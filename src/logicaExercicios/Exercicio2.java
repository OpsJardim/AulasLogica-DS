package logicaExercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota do aluno: ");
        int nota = sc.nextInt();

        System.out.println("Digite a frequência do aluno: ");
        int freq = sc.nextInt();

        if (nota >= 7){
            if (freq >= 85){
                System.out.println("Aluno aprovado");
            } else {
                System.out.println("Reprovado por frequência");
            }
        } else {
            System.out.println("Aluno reprovado");
        }
    }
}
