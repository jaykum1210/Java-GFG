import java.util.Scanner;

class Printwithoutspace {
    public void concatAndPrint(String a, String b) {
        // code here
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        Printwithoutspace pri = new Printwithoutspace();
        pri.concatAndPrint(a, b);
    }
}
