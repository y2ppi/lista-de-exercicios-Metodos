import java.util.*;

public class Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        double delta, x, x1, x2;

        System.out.println("Insira o valor de a: ");
        a = sc.nextInt();

        System.out.println("Insira o valor de b: ");
        b = sc.nextInt();

        System.out.println("Insira o valor de c: ");
        c = sc.nextInt();

        delta = (b*b - 4*a*c);

        if(delta > 0){
            x1 = (-b + Math.sqrt(delta)) / (2*a);
            x2 = (-b + Math.sqrt(delta)) / (2*a);
            System.out.println("Raizes = " + x1 + " , " + x2);
        } else if (delta == 0) {
            x = -b / (2*a);
            System.out.println("Única raíz = " + x);
        } else {
            System.out.println("Não existem raízes reais.");
        }
        
        sc.close();
    }
}
