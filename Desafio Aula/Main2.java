public class Main2 {

            public static void main(String[] args) {
                int opcao;

                do {
                    Telas.menuPrincipal();
                    opcao = Telas.lerOpcao();   // delega leitura e tratamento para Telas

                    switch (opcao) {
                        case 1:
                            Telas.mensagem("Criar conta (em breve)");
                            break;
                        case 2:
                            Telas,mensagem("Acessar conta (em breve)")
                            break;
                        case 3:
                            Telas.mensagem("Encerrando. Até logo!");
                            break;    
                        default:
                            Telas.erro("Opção inválida. Tente novamente.");

            }   while (opcao != 3); 
                
            }
        }
    }