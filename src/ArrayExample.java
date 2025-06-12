public class ArrayExample {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        // Acesse os elementos do array
        System.out.println("Primeiro elemento: " + numeros[0]);
        System.out.println("Segundo elemento: " + numeros[1]);

        // Utilize um loop para percorrer o array
        System.out.print("Elementos do array: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        // Utilize um loop avançado (for-each)
        System.out.print("Elementos do array (for-each): ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();

        // Modificar um elemento do array
        numeros[2] = 10;
        System.out.println("Terceiro elemento após modificação: " + numeros[2]);

        // Obter o tamanho do array
        System.out.println("Tamanho do array: " + numeros.length);
    }
}
