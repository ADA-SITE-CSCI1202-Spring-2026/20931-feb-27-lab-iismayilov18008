import java.util.Objects;

public class Person {

    private String name;
    private String surname;
    private String sex;

    public Person(String name, String surname, String sex) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', surname='" + surname + "', gender='" + sex + "'}";
    }

    public boolean equals(Person p) {
        if (p == null) return false;

        return Objects.equals(name, p.name) &&
               Objects.equals(surname, p.surname) &&
               Objects.equals(sex, p.sex);
    }
}