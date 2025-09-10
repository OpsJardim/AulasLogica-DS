package logicaExercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha uma graduação: ");
        System.out.println("1 - Tecnólogo ");
        System.out.println("2 - Bacharel ");
        System.out.println("3 - Sair");
        int graduacao = sc.nextInt();

        while (graduacao == 3){
            System.out.println("Encerrando programa...");
            break;
        }

        switch (graduacao){

            case 1 -> {
                Scanner i = new Scanner(System.in);
                System.out.println("Tecnólogo");
                System.out.println("1 - ADS");
                System.out.println("2 - Gastronomia");
                System.out.println("3 - Administração");
                System.out.println("4 - Cibersegurança");
                System.out.println("5 - Sair");
                int opc = sc.nextInt();

                switch (opc){
                    case 1 -> {
                        System.out.println("ADS");
                    }
                    case 2 -> {
                        System.out.println("Gastronomia");
                    }
                    case 3 -> {
                        System.out.println("Administração");
                    }
                    case 4 -> {
                        System.out.println("Cibersegurança");
                    }
                    case 5 -> {
                        System.out.println("Encerrando programa...");
                        break;
                    }
                }
            }
            case 2 -> {
                Scanner i = new Scanner(System.in);
                System.out.println("Bacharel");
                System.out.println("1 - Ciência de Computação");
                System.out.println("2 - Engenharia de Software");
                System.out.println("3 - Engenharia da Computação");
                System.out.println("4 - Cibersegurança");
                System.out.println("5 - Sair");
                int opc = sc.nextInt();
                switch (opc){
                    case 1->{
                        System.out.println("Ciência de Computação");
                    }
                    case 2 -> {
                        System.out.println("Engenharia de Software");
                    }
                    case 3 -> {
                        System.out.println("Engenharia de Computação");
                    }
                    case 4 ->{
                        System.out.println("Cibersegurança");
                    }
                    case 5 -> {
                        System.out.println("Encerrando programa...");
                        break;
                    }
                }
            }
        }
    }
}
