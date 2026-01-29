package aula2;

import java.util.Scanner;

public class EntradaDeDados {
    static void main(){

        Scanner sc = new Scanner(System.in);
        IO.println("Digite o seu nome");
        String nome = sc.next();

        IO.println("Digite o sua idade");
        int idade = sc.nextInt();

        IO.println("Digite seu peso");
        double peso = sc.nextDouble();

        IO.println("Digite sua altura");
        double altura = sc.nextDouble();

        Double imc = peso / (altura * altura);
        IO.println(imc);



    }

    }


