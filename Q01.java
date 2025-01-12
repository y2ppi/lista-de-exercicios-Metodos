public class Q01 {
    public static void main(String[] args) {
        int numero;
        double raizQuadrada;

        // math.sqrt metodo que calcula raiz quadrada

        for(numero = 1; numero <= 100; numero++){
            raizQuadrada = Math.sqrt(numero);
            System.out.printf("\nNumero = \n" + numero + "\nRaiz Quadrada = \n" + raizQuadrada);
        }
    }
}