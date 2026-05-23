package ExerciciosRevisao;

public class InitArray3 {
    public static void main(String[] args) {
        final int TAM = 10;
        int a[] = new int[TAM];

        for(int i = 0; i < TAM; i++){
            System.out.printf("%6d %8d\n", i, a[i]);
        }
    }
}
