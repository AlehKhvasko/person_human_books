package projectsHandsOn.AdvancedOOP.animals.humanBooksPerson;

public class Book {
    private final String publishedBy = "Humbolds";
    private String name;
    private String topic;
    private int numberOfPages;
    private String author;

    public Book(String name, String topic, int numberOfPages, String author){
        this.name = name;
        this.topic = topic;
        this.numberOfPages = numberOfPages;
        this.author = author;
    }

    public String getName(){
        return this.name;
    }

    public String getAuthorsName(){return this.name;
    }

}
