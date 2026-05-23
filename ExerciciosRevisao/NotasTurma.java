package ExerciciosRevisao;

import java.util.Scanner;

public class NotasTurma {
    public static void main(String[] args) {
        final int ALUNOS = 5;
        final int PROVAS = 2;

        int lin, col;
        double soma = 0;
        double media[] = new double[ALUNOS];
        double mediaSala = 0;

        double notas[][] = new double[ALUNOS][PROVAS];
        Scanner entrada = new Scanner(System.in);

        for(lin = 0; lin < ALUNOS; lin++){
            System.out.printf("\nDigite as notas do aluno %do aluno: \n", lin + 1);
            for(col = 0; col < PROVAS; col++){
                System.out.printf("Nota %d: ", col + 1);
                notas[lin][col] = entrada.nextDouble();
                while (notas[lin][col] < 0 || notas[lin][col] > 10) {
                    System.out.println("Nota inválida. Tente novamente");
                    System.out.printf("Nota %d: ", col + 1);
                    notas[lin][col] = entrada.nextDouble();
                }
                soma += notas[lin][col];
            }
            media[lin] = soma / 2;
            mediaSala += media[lin];
            soma = 0;
        }

        mediaSala /= ALUNOS;
        
        System.out.println();
        System.out.println("Notas e Média");
        System.out.printf("Média da Sala: %.2f", mediaSala);

        for(lin = 0; lin < ALUNOS; lin++){
            System.out.printf("\nAluno %d: ", lin+1);
            for(col = 0; col < PROVAS; col++){
                System.out.printf("%2.2f ", notas[lin][col]);
            }
            System.out.printf(" - Média %2.2f ", media[lin]);
            if (media[lin] < mediaSala) {
                System.out.printf(" - Abaixo da Média");
            }else if(media[lin] == mediaSala){
                System.out.printf(" - Na Média");
            }else{
                System.out.printf(" - Acima da Média");
            }
        }
        entrada.close();
    }
}
