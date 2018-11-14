package pl.b2b;

public class App {
    public static void main(String[] args) {
        // System.out.println( "Hello World!" );


        // Wypisz swoje imię
        System.out.println("Pablito");


        //wypisz swoje imie i nazwisko
        String name = "Pablito";
        String surname = "Kowalski";
        System.out.println(name + " " + surname);

        //Suma 4 i 9
        System.out.println(4 + 9);


        //Wypisz wynik mnożenia, dzielenia i odejmowania liczb 3455 i 789
        int first = 3455;
        int second = 789;

        int mnozenie = first * second;
        System.out.println("wynik mnozenia to " + mnozenie);
        int dzielenie = first / second;
        System.out.println("wynik dzielenie to " + dzielenie);
        int odejmowanie = first - second;
        System.out.println("wynik odejmowanie to " + odejmowanie);


        //wypisz swoj wiek, imie i nazwisko

        int age = 27;
        String nameAndSurname = "pablito Kowalski";
        System.out.println(age + ", " + nameAndSurname);


    }


}
