package project230;

public class Urls {

	//Datamembers
	private final String url;
	private final String description;
	private final double chapter;
	
	//Constructor
	public Urls(String url, String description, double chapter) { 
        this.url = url; 
        this.description = description;
        this.chapter = chapter;
	}
	//get method that returns url
	public String getUrl() {
		return url;
	}
	//returns the description
	public String getDescription() {
		return description;
	}
	//returns chapter
	public double getChapter() {
		return chapter;
	}
        
}
