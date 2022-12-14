import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String domain = s.nextLine();
        System.out.println(domain);
//        System.out.println("Enter n");
//        int n = s.nextInt();
//        System.out.println("Enter r");
//        int r = s.nextInt();
//        System.out.println(n + "C" + r + " = " + fac(n)/(fac(r)*fac(n-r)));
//        System.out.println(n + "P" + r + " = " + fac(n)/fac(n-r));
    }

    static int fac(int num) {
        int f = 1;
        for(int i = 2; i <= num; i++) f *= i;
        return f;
    }

}
