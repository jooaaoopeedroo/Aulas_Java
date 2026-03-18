import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do{
            Telas.menuPrincipal();
            opcao = Integer.parseInt(sc.nextLine().trim());

            switch (opcao) {
                case 1:
                    Telas.mensagem("Opcao 1 selecionada: Criar Conta (em breve)");
                    break;
                case 2:
                    Telas.mensagem("Opcao 2 selecionada: Acessar conta (em breve)");
                    break;
                case 3:
                    Telas.mensagem("Encerramento o sistema. Até logo!");
                    break;
                default:
                    Telas.mensagem("Opcao invalida. Tente novamente.");
            }
        }
        while (opcao != 3);

        sc.close();
    }
}