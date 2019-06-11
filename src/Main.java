import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0;
        do {
            try {
                System.out.println("podaj dane 1 osoby \n Imie nazwisko wiek pesel");
                Person person1 = new Person(scan.nextLine(), scan.nextLine(), scan.nextInt(), scan.nextInt());
                System.out.println("Imie: " + person1.getFirstName() + " Nazwisko: " + person1.getLastName()+ " Wiek: " + person1.getAge()+ " Pesel: " + person1.getPesel());
                a += 1;
            } catch (NameUndefinedException ex) {
                System.out.println("nazwa jest za krótka, podaj dane od nowa");
            } catch (IncorrectAgeException ex) {
                System.out.println("Wiek jest za mały, podaj dane od nowa");
            }
        }while(a==0);


    }


}


