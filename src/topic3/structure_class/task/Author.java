package topic3.structure_class.task;

public class Author {
    String name;
    String surname;
    String birthday;
    String country;

    public Author(String name, String surname, String birthday, String country) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.country = country;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", name,surname,birthday,country);
    }
}
