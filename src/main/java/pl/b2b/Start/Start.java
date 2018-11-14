package pl.b2b.Start;

public class Start {

    private String name = "pablito";

    public String getName(String name) {
        return name;
    }


    public void setName(String name) {
        this.name = name;

    }


    public String getNameAndSurname(String name, String surname) {
        return name + surname;
    }

    public int plus(int first, int second) {
        int sum = 0;
        sum += first;
        sum += second;
        return sum;
    }

   public int minus(int first, int second){
        int minus = 0;
        minus -= first;
        second -= second;
        return minus;
   }

   public int multiplication(int first, int second){
        int multi = 0;
        multi /= first;
        multi /= second;
        return multi;
   }

    public int division(int first, int second){
        int divi = 0;
        divi /= first;
        divi /= second;
        return divi;
    }

    public int ageNameSurname(int age, String nameSurname){
         age = 20;
        nameSurname = " pablito Kowalski";
        return Integer.parseInt(age + nameSurname);
    }
}
