package Aula;
public class Main {

    public static void main(String[] args) {

        Produto[] produtos = {
            new Produto("Camiseta", 29.90, 50),
            new Produto("Calça Jeans", 99.90, 30),
            new Produto("Tênis", 149.90, 20),
            new Produto("Boné", 39.90, 40),
            new Produto("Mochila", 79.90, 15)
        };

        Cliente[] clientes = {
            new Cliente("João Silva", "111.222.333-44"),
            new Cliente("Maria Souza", "555.666.777-88"),
            new Cliente("Carlos Mendes", "999.888.777-66")
        };

        Venda[] vendas = new Venda[10];
        int totalVendas = 0;

        // Venda 1
        vendas[totalVendas] = new Venda(clientes[0]);
        vendas[totalVendas].adicionarItem(produtos[0], 2);
        vendas[totalVendas].adicionarItem(produtos[1], 1);

        System.out.println("Venda #1 finalizada para "
                + clientes[0].nome
                + " — Total: R$ "
                + String.format("%.2f", vendas[totalVendas].calcularTotal()));

        totalVendas++;

        // Venda 2
        vendas[totalVendas] = new Venda(clientes[1]);
        vendas[totalVendas].adicionarItem(produtos[2], 1);
        vendas[totalVendas].adicionarItem(produtos[3], 2);

        System.out.println("Venda #2 finalizada para "
                + clientes[1].nome
                + " — Total: R$ "
                + String.format("%.2f", vendas[totalVendas].calcularTotal()));

        totalVendas++;

        // Venda 3
        vendas[totalVendas] = new Venda(clientes[2]);
        vendas[totalVendas].adicionarItem(produtos[4], 1);
        vendas[totalVendas].adicionarItem(produtos[0], 1);

        System.out.println("Venda #3 finalizada para "
                + clientes[2].nome
                + " — Total: R$ "
                + String.format("%.2f", vendas[totalVendas].calcularTotal()));

        totalVendas++;

        // Recibos
        for (int i = 0; i < totalVendas; i++) {
            vendas[i].imprimirRecibo(i + 1);
        }
    }
}