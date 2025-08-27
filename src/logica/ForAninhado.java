package logica;

import java.sql.SQLOutput;

public class ForAninhado {
    public static void main(String[] args) {
        for (int i = 1; i<= 3; i++){
            for (int j=1; j<= 3; i++){
                System.out.printf("%d X %d = %d ", i, j, i*j);
            }
            System.out.println();
        }
    }
}
