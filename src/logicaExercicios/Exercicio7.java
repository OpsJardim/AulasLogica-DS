package logicaExercicios;

public class Exercicio7 {
    public static void main(String[] args) {
        int matriz [][] = new int[5][5];

        for (int i =0; i<5 ; i++){
            for (int j = 0; j < 5; j++){
                matriz [i] [j]= i + j;
            }
        }

        System.out.println("Matriz 5x5 (soma dos indices)");
        for (int i = 0; i<5; i++){
            for (int j =0; j<5; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
