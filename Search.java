package project230;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Search {
	//Methods for ranking and sorting the documents ArrayList
    //A normalize method that takes user input and makes it simple, without punctuation, removes whitespace, and makes it lowercase
    //Will return a list with each query word separated so we can use them as tokens
    public static List<String> normalize(String userInp) {
    	//If the userInput is empty return an empty ArrayList 
    	if(userInp == null) {
    		return new ArrayList<>();
    	}
    	//Trims white space from the beginning and end and makes it lowercase
    	String normalized = userInp.trim().toLowerCase();
    	//removing punctuation, items in first slot are regEx
    	normalized = normalized.replaceAll("\\p{Punct}", "");
    	//Finally return the normalized array, splitting based on the spaces on spaces in the userInput
    	String[] tokens = normalized.split("\\s+");
    	//Convert to an ArrayList
    	return Arrays.asList(tokens);
    }
    
    //A method to compute a score for each object in the documents ArrayList
    //With the results of this method we will then sort the ArrayList based on score, from highest to lowest
    //Create a score datamember in the urls class inorder to sort the ArrayList
    public static int computeScore(Urls info, List <String> userTokens){
    	//Create a list with all of the descriptions normalized
    	List<String> descriptionTokens = normalize(info.getDescription());
    	List<String> urlTokens = normalize(info.getUrl());
        int score = 0;
        
        //For every token in the userTokens, check how many times a websites description or chapter matches, set that score to the websites score datamember
        //Also check the url for tokens that are equal, increase score by +1
        for(String token : userTokens) {
        	for(String descToken : descriptionTokens) {
        		for(String urlToken : urlTokens){
        			if(descToken.equals(token)) {
            			score++;
            		}else if(urlToken.equals(token)) {
            			score++;
            		}
        		}
        		
        	}
			
        	try {
                double tokenValue = Double.parseDouble(token);
                // Compare token that is a numeric value with the chapter datamember from the urlClass. 
                if (tokenValue == info.getChapter()) {
                    score += 2;
                //If it's within .5 of the .getChapter assign +1 to score
                }else if (Math.abs(tokenValue - info.getChapter()) <= 0.5) {
                	score++;
                }
             // If the token is not a number, this will catch and not assign score += 2
            } catch (NumberFormatException e) {
                e.getMessage();
            }
			
        }
      //Set the score of that particular website to the score it achieved
      return score;
        
    }
   
    
    //Method that sorts the ArrayList based on the score each website has
    public static List<Result> searchEngineSort(String userInp, List<Urls> docs) {
    	//Normalize the userInp
    	//Create an empty list for the results
    	List<String> userTokens = normalize(userInp);
		List<Result> results = new ArrayList<>();
		
		//Iterate through each document and store the ones with a score > 0 in the results ArrayList
		for(int i = 0; i < docs.size(); i++) {
			int score = computeScore(docs.get(i), userTokens);
			if(score > 0) {
				results.add(new Result(docs.get(i).getUrl(), docs.get(i).getDescription(), docs.get(i).getChapter(), score));
			}
		}
		//Sorting using quickSort
		quickSort(results, 0, results.size()-1);
		return results;
    }
    
    	//quickSort method to sort the ArrayList by ascending order
        private static void quickSort(List<Result> results, int low, int high) {
        	if (low < high) {
                int pivotIndex = partition(results, low, high);
                quickSort(results, low, pivotIndex - 1);
                quickSort(results, pivotIndex + 1, high);
            }
        }
		
	private static int partition(List<Result> results, int low, int high) {
	     // Choose the center element as pivot.
        int mid = low + (high - low) / 2;
        // Swap the center element with the last element.
        swap(results, mid, high);
        Result pivot = results.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
        	//place elements with higher or equal score before the pivot.
            if (results.get(j).getScore() >= pivot.getScore()) {
                i++;
                swap(results, i, j);
            }
        }
        swap(results, i + 1, high);
        return i + 1;
    }
		//Simple swap method to swap items in the ArrayList
		private static void swap(List<Result> results, int i, int j) {
		Result temp = results.get(i);
		results.set(i, results.get(j));
		results.set(j, temp);
	}
}