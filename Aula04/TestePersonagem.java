package Aula04;

public class TestePersonagem {

    public static void main(String[] args) {
        Personagem p1 =
                new Personagem("Arthur", 100, 1);
        Personagem p2 =
                new Personagem("Merlin", 80, 5);

        p1.exibirStatus();
        p2.exibirStatus();

        // Arthur recebe dano

        p1.receberDano(30);

        // Merlin cura vida

        p2.curar(15);

        // Arthur sobe de nível

        p1.subirNivel();

        // Alterando nome

        p2.setNome("Mago Merlin");

        // Exibindo status atualizado

        p1.exibirStatus();
        p2.exibirStatus();

        // Testes inválidos

        p1.receberDano(-10);

        p2.curar(500);

        // Vida não deve passar de 100

        p2.exibirStatus();
    }
}
