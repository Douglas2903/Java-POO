package ExerciciosRevisao;

public class InitArray {
    public static void main(String[] args) {
        int a[];
        a = new int[10];

        System.out.printf("%s %8s\n", "Indice", "Valor");
        for(int i = 0; i < a.length; i++){
            System.out.printf("%6d %8d\n", i, a[i]);
        }
    }
}
