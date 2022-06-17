package org.wecancoeit.reviews;

public class Review {

    private Long id;
    private String title;
    private String director;
    private String year;
    private String genre;
    private String urlPoster;
    private String urlStar;

    public Review(long id, String title, String director, String year, String genre, String urlPoster, String urlStar) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.year = year;
        this.genre = genre;
        this.urlPoster = urlPoster;
        this.urlStar = urlStar;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public String getUrlPoster() {
        return urlPoster;
    }

    public String getUrlStar() {
        return urlStar;
    }
}



