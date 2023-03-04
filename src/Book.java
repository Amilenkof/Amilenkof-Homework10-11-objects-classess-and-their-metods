import java.util.Objects;

public class Book {
    private String nameOfBook;
    private Author author;
    private int yearOfPublication;

    public Book(String nameOfBook, Author author, int yearOfPublication) {
        this.nameOfBook = nameOfBook;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }


    public Author getAuthor() {
        return author;
    }


    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int year) {
        this.yearOfPublication = year;
    }

    @Override
    public String toString() {
        return "Книга " + nameOfBook + " ," + "автор " + author + " ,год публикации " + yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && nameOfBook.equals(book.nameOfBook) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfBook, author, yearOfPublication);
    }
}

