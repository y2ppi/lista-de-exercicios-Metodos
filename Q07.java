import java.util.*;

public class Q07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, opcoes;

        System.out.print("Insira um número: ");
        n1 = sc.nextInt();

        System.out.print("Insira mais um número: ");
        n2 = sc.nextInt();

        System.out.print("Digite um número para realizar a operação desejada: \n");
        System.out.print("1. O primeiro número elevado ao segundo número.\n");
        System.out.print("2. Raiz Quadrada de cada um dos números.\n");
        System.out.print("3. Raiz cúbica de cada um dos números.\n");
        opcoes = sc.nextInt();

        sc.close();

        switch(opcoes){
            case 1:
            System.out.print("Resultado = " + Math.pow(n1, n2));
            break;

            case 2:
            System.out.print("Raiz quadrada do primeiro número = " + Math.sqrt(n1));
            System.out.print("Raiz quadrada do segundo número = " + Math.sqrt(n2));
            break;

            case 3:
            System.out.print("Raiz cúbica do primeiro número = " + Math.cbrt(n1));
            System.out.print("Raiz cubica do segundo número = " + Math. cbrt(n2));
            break;

            default:
            System.out.print("Opção inválida. Tente novamente.");
        }
    }
}
