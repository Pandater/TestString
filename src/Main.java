import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // TODO) 1 string wpisany, ostatnie 2 na przód (min 3 znaki). jeśli nie zostawiasz
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Wprowadź dowolny Łańcuch: ");
        String lancuch = scan1.nextLine();
        if(lancuch.length() > 2) {
            String lancuch1 = lancuch.substring(0, lancuch.length()-2);
            String lancuch2 = lancuch.substring(lancuch.length()-2);
            System.out.println(lancuch2.concat(lancuch1));
        }
        else{
            System.out.println(lancuch);
        }
    }
}