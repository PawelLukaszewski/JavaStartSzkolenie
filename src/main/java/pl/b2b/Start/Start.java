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
        return name + " " + surname;
    }

    public int plus(int first, int second) {
        int sum = 0;
        sum += first;
        sum += second;
        return sum;
    }

   public int minus(int first, int second){
        first -= second;
        return first;
   }

   public int multiplication(int first, int second){
        first *= second;
        return first;
   }

    public int division(int first, int second){
        first /= second;
        return first;
    }

    public String ageNameSurname(int age, String nameSurname){
        return (age + " " + nameSurname);
    }
}
