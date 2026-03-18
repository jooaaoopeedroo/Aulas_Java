documpublic class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        // Adicionando livros
        biblioteca.adicionar(new Livro("Pinóquio", "Carlo Colodii", 1883));
        biblioteca.adicionar(new Livro("As Tartarugas Ninjas", "Kevin Eastman", 1094));
        biblioteca.adicionar(new Livro("Hulk Contra o Mundo", "Greg Pak", 2024));
        biblioteca.adicionar(new Livro("Planeta Hulk", "Greg Pak", 2006));

        // Listar todos
        biblioteca.listar();

        // Buscar existente
        biblioteca.buscar("Pinóquio");

        // Buscar inexistente
        biblioteca.buscar("Hulk Contra o Mundo");
    }
}