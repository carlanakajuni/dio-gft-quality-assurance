import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // abrir o teclado para criar o input

        int quantNumeros; // variável para armazenar a quantidade de vezes que se repita
        int numero; // salvará o número toda vez que ocorrer o laço
        int quantPares = 0, quantImpares = 0; // atribuindo variáveis do mesmo tipo

        System.out.println("Quantidade de números: "); // mostra a mensagem pedindo o número
        quantNumeros = scan.nextInt(); // método para digitar a quantidade de números no terminal

        // criação do laço:
        int count = 0; // contador do laço para saber quantas vezes irá se repetir
        do {
            System.out.println("Número: ");
            numero = scan.nextInt(); // variável numero para armazenar o número digitado no terminal

            if (numero % 2 == 0) quantPares++; // verificando se o número é par e incrementando se for par
            else quantImpares++; // incrementando caso o número for ímpar

            count++; // incremento para somar ao contador

        } while(count < quantNumeros); // o loop irá acontecer o numero de vezes que foi colocado na quantNumeros

        System.out.println("Quantidade par: " + quantPares);
        System.out.println("Quantidade ímpar: " + quantImpares);

    }

}
