package logicaExercicios;

public class Exercicio3 {
    public static void main(String[] args) {
        int categoria = 2;
        int opcao = 1;

        switch (categoria){
            case 1 -> {
                System.out.println("Categoria: Faculdade");
                switch (opcao){
                    case 1 -> {
                        System.out.println("Engenharia de Software");
                    }
                    case 2 -> {
                        System.out.println("Ciência da Computação");
                    }
                }
            }
            case 2 -> {
                System.out.println("Categoria: Tecnologo");
                switch (opcao){
                    case 1->{
                        System.out.println("Desenvolvimentos de Sistemas");
                    }
                    case 2 -> {
                        System.out.println("Cibersegurança");
                    }
                }
            }
        }
    }
}
