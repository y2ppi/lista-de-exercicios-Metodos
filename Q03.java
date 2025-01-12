import java.util.*;

public class Q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binario;
        int decimal;

        System.out.println("Insira um número em binário para converter em decimal: ");
        binario = sc.nextLine();

        decimal = Integer.parseInt(binario, 2);

        System.out.println("Número em binário = \n" + binario + "\nNúmero em decimal = \n" + decimal);

        sc.close();
    }
}
