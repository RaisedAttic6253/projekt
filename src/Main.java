import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        List<Integer> seznamCisel = new ArrayList<>();

        for (int i = 0; i <= 10; i++){
            Integer nahodneCislo = (int) (Math.random()*99+1);
            seznamCisel.add(nahodneCislo);
        }
        System.out.println(seznamCisel);
        for(int cislo : seznamCisel){
            if (cislo > 6){
                System.out.println("Číslo: " + cislo);
            }
        }
    }
}