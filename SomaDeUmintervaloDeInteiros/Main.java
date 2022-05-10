package SomaDeUmintervaloDeInteiros;

import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int primeiroTermo,termo_n,resultado;

        System.out.print("Dgite o primeiro Numero do intervalo : ");
        primeiroTermo = sc.nextInt();

        System.out.print("Dgite o Utimo Numero do intervalo : ");
        termo_n = sc.nextInt();

        resultado = (((termo_n * ( termo_n + 1 )) /2) - ((primeiroTermo * ( primeiroTermo + 1 )) /2)) + primeiroTermo;

        System.out.println(resultado);
    }
}