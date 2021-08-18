package Lesson7.reader.model;

public class Reader {
    private String name;
    private int idNumber;
    private String faculty;
    private String dataBirth;
    private int numberPhone;

    public Reader() {
    }

    public Reader(String name, int idNumber, String faculty, String dataBirth, int numberPhone) {
        this.name = name;
        this.idNumber = idNumber;
        this.faculty = faculty;
        this.dataBirth = dataBirth;
        this.numberPhone = numberPhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDataBirth() {
        return dataBirth;
    }

    public void setDataBirth(String dataBirth) {
        this.dataBirth = dataBirth;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public void takeBook(int numberBooks){
        StringBuilder builder = new StringBuilder();
        builder.append(name).
                append(" взял ").
                append(numberBooks).
                append(" книг");
        System.out.println(builder);
        System.out.println();
    }

    public void takeBook(String... nameBook){
        StringBuilder builder = new StringBuilder();
        builder.append(name).
                append(" взял книги: ").
                append("\n");
        System.out.print(builder);
        for (String book: nameBook){
            System.out.println(book);
        }
        System.out.println();
    }

    public void takeBook (Book... nameBook){
        StringBuilder builder = new StringBuilder();
        builder.append(name).
                append(" взял книги: ").
                append("\n");
        for (Book book : nameBook) {
            builder.append(book.getTitlesBook()).
                    append(", автор - ").
                    append(book.getAuthorBook()).
                    append("\n");
        }
        System.out.println(builder);
        System.out.println();
    }

    public void returnBook(int numberBooks){
        StringBuilder builder = new StringBuilder();
        builder.append(name).
                append(" вернул ").
                append(numberBooks).
                append(" книг");
        System.out.println(builder);
        System.out.println();
    }

    public void returnBook(String nameBook){
        StringBuilder builder = new StringBuilder();
        builder.append(name).
                append(" вернул книги: ").
                append(nameBook);
        System.out.println(builder);
        System.out.println();
    }

    public void returnBook (Book... nameBook){
        StringBuilder builder = new StringBuilder();
        builder.append(name).
                append(" вернул книги: ").
                append("\n");
        for (Book book : nameBook) {
            builder.append(book.getTitlesBook()).
                    append(", автор - ").
                    append(book.getAuthorBook()).
                    append("\n");
        }
        System.out.println(builder);
    }


    public void info(){
        StringBuilder builder = new StringBuilder();
        builder.append("ФИО читателя: ").
                append(name).append("\n").
                append("ID читателя: ").
                append(idNumber).append("\n").
                append("Факультет читателя: ").
                append(faculty).append("\n").
                append("Дата рождения читателя: ").
                append(dataBirth).append("\n").
                append("Номер телефона читателя: ").
                append(numberPhone);
        System.out.println(builder);
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", idNumber=" + idNumber +
                ", faculty='" + faculty + '\'' +
                ", dataBirth=" + dataBirth +
                ", numberPhone=" + numberPhone +
                '}';
    }
}
