import java.util.Objects;

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
    @Override
    public String toString() {
        return "Книга "+ nameOfBook + " ," +"автор "+ author + " ,год публикации " + yearOfPublication;
    }

    @Override
    public boolean equals (Object obt) {
        if (this.getClass()!=obt.getClass()) {
            return false;
        }
        Book obtBook =(Book) obt;
        return this.nameOfBook == obtBook.nameOfBook && this.author == obtBook.author && this.yearOfPublication == obtBook.yearOfPublication;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfBook, author, yearOfPublication);
    }
}

