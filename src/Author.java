import java.security.PublicKey;
import java.util.Objects;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    @Override
    public String toString() {
        return "Имя " + name + " ,Фамилия " + surname;
    }

    @Override
    public boolean equals(Object obt) {
        if (obt.getClass() == null || this.getClass() != obt.getClass()) {
            return false;
        } else {
            Author obtauthor = (Author) obt;
            return this.name == obtauthor.name && this.surname == obtauthor.surname;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}


