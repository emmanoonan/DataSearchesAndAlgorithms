package project230;

//Class for storing results of a search
public class Result extends Urls {
    private final int score;
//result constructor
    public Result(String url, String description, double chapter,int score) {
        super(url,description,chapter);
        this.score = score;
    }

//Overriding the getUrl method from Urls
    @Override 
    public String getUrl(){
        return super.getUrl();
    }
    //returns the score of the Result, this is for the quickSort algorithm
    public int getScore() {
        return score;
    }

}
