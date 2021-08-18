package Lesson14;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book {
    private String name;
    private String art;
    private Genre genre;
    private List<Author> authorList = new ArrayList<>();

    public Book() {
    }

    public Book(String name, String art, Genre genre, List<Author> authorList) {
        this.name = name;
        this.art = art;
        this.genre = genre;
        this.authorList = authorList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public List<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name) && Objects.equals(art, book.art) && genre == book.genre && Objects.equals(authorList, book.authorList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, art, genre, authorList);
    }
}
