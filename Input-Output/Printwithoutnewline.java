import java.util.*;

class Printwithoutnewline {
    public void utility(Scanner sc) {
        // code here
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(a + " " + b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Printwithoutnewline sol = new Printwithoutnewline();
        sol.utility(sc);
    }
}
