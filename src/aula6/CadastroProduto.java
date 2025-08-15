package aula6;

public class CadastroProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.id = 5;
        produto1.nome = "base"; 
        produto1.descricao = "base matte";
        produto1.codigoBarras = "2023100600";
        produto1.valor = 85.00;


        Produto produto2 = new Produto(10, "Pincel", "Pincel de sombra", "2023100700", 25.50); 
        
        Produto produto3 = new Produto(20, "Sombra", "Sombra colorida", "2023100800", 70.00); 

        System.out.println("===== PRODUTO 01 =====");
        produto1.imprimirDados();

        System.out.println("===== PRODUTO 02 =====");
        produto2.imprimirDados();
        
        System.out.println("===== PRODUTO 03 =====");
        produto3.imprimirDados();
       
}
}