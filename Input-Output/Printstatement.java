import java.util.*;

class Printstatement {
    void utility(Scanner scn) {
        // code here
        String a = scn.nextLine();
        System.out.println(a);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        Printstatement sol = new Printstatement();
        sol.utility(scn);
    }
}
