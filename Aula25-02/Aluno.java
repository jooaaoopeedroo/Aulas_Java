public class Aluno {

    String nome;
    int idade;
    double nota1;
    double nota2;

    Aluno(String nome, int idade, double nota1, double nota2) {
        this.nome = nome;
        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    double calcularMedia() {
        return (this.nota1 + this.nota2) / 2;
    }

    String verificarAprovacao() {
        if (calcularMedia() >= 7.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    void exibirInformacoes() {
        System.out.println("\n--- Dados do Aluno ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.printf("Nota 1: %.2f%n", this.nota1);
        System.out.printf("Nota 2: %.2f%n", this.nota2);
        System.out.printf("Média: %.2f%n", calcularMedia());
        System.out.println("Situação: " + verificarAprovacao());
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Joao", 27, 8.5, 8.0);
        aluno1.exibirInformacoes();
    }
}