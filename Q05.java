import java.util.*;

public class Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero;
        float numeroArredondado;

        System.out.println("Insira um número: ");
        numero = sc.nextDouble();

        numeroArredondado = (float) numero;

        System.out.printf("%.2f", numeroArredondado);

        sc.close();
    }
}
