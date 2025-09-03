package logicaExercicios;
import java.math.*;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        sc.nextInt();

        int num = sc.nextInt();
        if (num >= 0){
            System.out.println("Esse número é positivo");
        }else{
            System.out.println("Esse número é negativo");
        }
    }
}
