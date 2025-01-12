public class Q02 {
    public static void main(String[] args) {
        int numero;
        String binario;

        for(numero = 1; numero <= 100; numero++){
            binario = Integer.toString(numero, 2);
            System.out.print("\nNumero = \n" + numero + "\nBinario do número = \n" + binario);
    }
}
}