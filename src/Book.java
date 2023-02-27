public class Book {
    private String nameOfBook;
    private  Author author;
    private int yearOfPublication;

    public Book(String nameOfBook, Author author, int yearOfPublication) {
        this.nameOfBook = nameOfBook;
        this.author=author;
        this.yearOfPublication = yearOfPublication;
    }
    public String getNameOfBook() {
        return nameOfBook;
    }
//    public void setNameOfBook () {
//        this.nameOfBook = nameOfBook;
//    }
    public Author getAuthor() {
        return author;
    }
//    public void setAuthor () {
//        this.author = author;
//    }
    public int getYearOfPublication () {
        return yearOfPublication;
    }
    public void setYearOfPublication (int year) {
        this.yearOfPublication = year;
    }

}

