public class Book {
    private final String bookName;
    int yearPublishing;
    Autor autor;
//Если ввести - Autor autor = new Autor(String firstName,  String lastName), то "return autor" тоже будет подчёркнут

    public  String getBookName() {
        return this.bookName;
    }
    public Autor getAutor() { return this.autor; }
    public int getYearPublishing() { return yearPublishing; }
    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public Book (String bookName, Autor autor, int yearPublishing) {
        this.bookName = bookName;
        this.autor = autor;
        this.yearPublishing = yearPublishing;
    }


}