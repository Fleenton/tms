package Lesson7.reader.model;

public class Book {
    private String titlesBook;
    private String authorBook;

    public Book() {
    }

    public Book(String titlesBook, String authorBook) {
        this.titlesBook = titlesBook;
        this.authorBook = authorBook;
    }

    public String getTitlesBook() {
        return titlesBook;
    }

    public void setTitlesBook(String titlesBook) {
        this.titlesBook = titlesBook;
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }

    public void infoBooks(){
        StringBuilder builder = new StringBuilder();
        builder.append("Название книги: ").
                append(titlesBook).
                append("\n").
                append("Автор книги: ").
                append(authorBook);
        System.out.println(builder);
    }

    @Override
    public String toString() {
        return "Book{" +
                "titlesBook='" + titlesBook + '\'' +
                ", authorBook='" + authorBook + '\'' +
                '}';
    }
}
