import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti cuvantul: ");
        String cuvant = input.nextLine();
        Functii c = new Functii();

        if(c.CaractereUnice(cuvant)){
            System.out.println("Stringul "+cuvant+" are doar caractere unice.");
        } else{
            System.out.println("Stringul "+cuvant+" are caractere duplicate");
        }
    }
}
