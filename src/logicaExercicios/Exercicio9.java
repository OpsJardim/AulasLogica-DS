package logicaExercicios;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Digite um número (7 para sair): ");
            int num = sc.nextInt();

            if (num ==7){
                System.out.println("Encerrando o programa...");
                break;
            }

            System.out.println("Você digitou " + num);
        }
        sc.close();
    }
}
