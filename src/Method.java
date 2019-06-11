import java.util.Scanner;

public class Method {
    public static void uzup(Person person) throws NameUndefinedException, IncorrectAgeException {
        Scanner scan = new Scanner(System.in);

        person.setFirstName(scan.nextLine());
        if (person.getFirstName().length() <= 2) {
            throw new NameUndefinedException();
        } else if (person.getFirstName() == null) {
            throw new NameUndefinedException();
        } else {
            System.out.println("Imie jest dobre");
        }

        person.setLastName(scan.nextLine());
        if (person.getLastName().length() <= 2) {
            throw new NameUndefinedException();
        } else if (person.getLastName() == null) {
            throw new NameUndefinedException();
        } else {
            System.out.println("Nazwisko jest dobre");
        }
        person.setAge(scan.nextInt());
        if (person.getAge() < 1) {
            throw new IncorrectAgeException();
        } else {
            System.out.println("Wiek jest dobry");
        }
        person.setPesel(scan.nextInt());
    }
}