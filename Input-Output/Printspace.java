import java.util.*;

public class Printspace {
    public void utility(Scanner scn) {
        // code here
        String a = scn.nextLine();
        String b = scn.nextLine();
        System.out.println(a + " " + b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Printspace sol = new Printspace();
        sol.utility(sc);
    }
}
