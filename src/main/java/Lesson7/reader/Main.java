package Lesson7.reader;

import Lesson7.reader.model.Book;
import Lesson7.reader.model.Reader;

public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader("Пушкин А.С.", 1, "Писательский", "6 июня 1799", 1236775);
        Reader reader1 = new Reader("Лермонтов М.Ю.", 2, "Писательский", "15 октября 1814", 6758398);
        Reader reader2 = new Reader("Есенин С.А.", 3, "Писательский", "3 октября 1895", 9887734);
        Reader [] readers = {reader, reader1, reader2};

        Book book = new Book("Изучаем Java", "Кэти Сьерра и Берт Бейтс");
        Book book1 = new Book("Java. Руководство для Начинающих", "Герберт Шильд");
        Book book2 = new Book("Философия Java", "Брюс Эккель");
        Book book3 = new Book("Муравьи", "Бернард Вербер");
        Book book4 = new Book("451 градус по Фаренгейту", "Рэй Брэдбери");
        Book [] books = {book, book1, book2, book3, book4};

        printReaders(readers);
        printBooks(books);

        reader.takeBook(5);
        reader1.takeBook("Сказки", "Энциклопедия", "Детективы");
        reader2.takeBook(book1, book2);

        reader.returnBook(2);
        reader1.returnBook("Сказки");
        reader2.returnBook(book1);
    }

    public static void printReaders(Reader [] readers){
        System.out.println("Читатели библиотеки:");
        for (Reader reader: readers) {
            reader.info();
            System.out.println();
        }
    }

    public static void printBooks(Book [] books){
        System.out.println("Книги библиотеки:");
        for (Book book: books) {
            book.infoBooks();
            System.out.println();
        }
    }
}
