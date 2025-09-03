package logicaExercicios;

public class Exercicio2 {
    public static void main(String[] args) {
        int nota=3;
        int freq=80;

        if (nota >= 7){
            if (freq >= 85){
                System.out.println("Aluno aprovado");
            } else {
                System.out.println("Reprovado por frequência");
            }
        } else {
            System.out.println("Aluno reprovado por nota");
        }
    }
}
