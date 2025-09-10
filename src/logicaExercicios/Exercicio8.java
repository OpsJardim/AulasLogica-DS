package logicaExercicios;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas notas você quer inserir? ");
        int qtd = sc.nextInt();

        double[] notas = new double [qtd];
        double soma = 0;

        for (int i = 0; i < notas.length; i++){
            System.out.println("Digite a nota " + (i + 1) + ": ");
            notas [i] = sc.nextDouble();
            soma += notas[i];
        }

        double media = soma / notas.length;
        if (media < 7.5){
            System.out.println("Aluno reprovado com: " + media);
        } else {
            System.out.println("Aluno aprovado com: " + media);
        }


        sc.close();

        System.out.println();
    }
}
