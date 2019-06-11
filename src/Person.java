import java.util.Scanner;

public class Person {
   private String firstName;
   private String lastName;
   private int age;
   private int pesel;

    public Person(String firstName, String lastName, int age, int pesel) {
        this.firstName = firstName;
        if (firstName.length() <= 2) {
            throw new NameUndefinedException();
        } else if (firstName == null) {
            throw new NameUndefinedException();
        } else {
            System.out.println("Imie jest dobre");
        }
        this.lastName = lastName;
        if (lastName.length() <= 2) {
            throw new NameUndefinedException();
        } else if (lastName == null) {
            throw new NameUndefinedException();
        } else {
            System.out.println("Nazwisko jest dobre");
        }
        this.age = age;
        if (age < 1) {
            throw new IncorrectAgeException();
        } else {
            System.out.println("Wiek jest dobry");
        }
        this.pesel = pesel;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getPesel() {
        return pesel;
    }
}

