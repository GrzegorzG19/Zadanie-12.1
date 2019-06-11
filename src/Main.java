public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        do {
            try {
                System.out.println("podaj dane 1 osoby \n Imie nazwisko wiek pesel");
                Method.uzup(person1);
            } catch (NameUndefinedException ex) {
                System.out.println("nazwa jest za krótka, podaj dane od nowa");
            } catch (IncorrectAgeException ex) {
                System.out.println("Wiek jest za mały, podaj dane od nowa");
            }
        } while (person1.getFirstName() == null || person1.getLastName()== null || person1.getAge() < 1);

        System.out.println(person1.getFirstName() + " " + person1.getLastName()+ " " + person1.getAge()+ " " + person1.getPesel());
    }


}


