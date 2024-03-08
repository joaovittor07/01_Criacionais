package AbstractFactory2;

public class MainProduto {
    public static void main(String[] args) {
        
        LojaFactory factory = new CompraFactory();
        Produto produto = factory.criarProduto();
        Pagamento Pagamento = factory.criarPagamento();

        System.out.println("Detalhes da Compra :");
        System.out.println(produto.getDescricao());
        System.out.println(Pagamento.getDescricao());
    }
}