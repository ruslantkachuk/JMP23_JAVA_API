package jmp.com.service.domain;

//@Document(collection = "movies")
public class Movie {

//    @Id
    private String id;

    private String title;

    private String genre;

    public Movie() {
    }

    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
