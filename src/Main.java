import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            try {
                System.out.println("podaj dane 1 osoby \n Imie nazwisko wiek pesel");
                Person person1 = new Person(scan.nextLine(),scan.nextLine(), scan.nextInt(),scan.nextInt());

            } catch (NameUndefinedException ex) {
                System.out.println("nazwa jest za krótka, podaj dane od nowa");
            } catch (IncorrectAgeException ex) {
                System.out.println("Wiek jest za mały, podaj dane od nowa");
            }


       // System.out.println(person1.getFirstName() + " " + person1.getLastName()+ " " + person1.getAge()+ " " + person1.getPesel());
    }


}


