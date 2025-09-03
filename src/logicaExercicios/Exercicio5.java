package logicaExercicios;

public class Exercicio5 {
    public static void main(String[] args) {
        int multiplicando = 1;
        while (multiplicando <= 10){
            int multiplicador = 1;
            while (multiplicador<=10){
                System.out.println(multiplicando + " X " + multiplicador + " = " + multiplicador*multiplicando );
                multiplicador++;
            }
            multiplicando++;
            System.out.println();
        }
    }
}
