package aula0310heranca;

import java.util.UUID;

public class Teste {
    public static void main(String[] args) {
        //Vantagens e possibilidades da herança!
        
        //abstração?
        //não é possivel isntaciar uma classe abstrata
        //Obra obra = new Obra();

        //polimorfismo possibilita generalização,
        //ou seja, compatibilidade entre filhos
    
       //Obra obraEbook = new Ebook();
       //Obra obraLivro = new Livro();

       Ebook ebook = new Ebook();
       ebook.setId(UUID.randomUUID());
       ebook.setIsbn("123456789");
       ebook.setTitulo("Receitas de bolo ");
       ebook.setUrlMarcaDagua("https:\\localhost:8080\figura.png");

       Livro livro = new Livro();
       livro.setId(UUID.randomUUID());
       livro.setIsbn("123456789 ");
       livro.setTitulo("Harry Potter e a Pedra Filosofal ");
       livro.setTiragem(1000);
       livro.setValor(45);


       venderObra(ebook);
       venderObra(livro);
       
    }

    public static void venderObra(Obra obra) {
        System.out.println("ID: " + obra.getId());
        System.out.println("Titulo: " + obra.getTitulo());
        System.out.println ("Valor Atual: " + obra.getValor());

        System.out.println("Aplicando desconto...");
        boolean reultado = obra.aplicarDesconto(0.3);
        if(reultado) {
            System.out.println("Desconto aplicado");
        }else{
            System.out.println ("Não foi posível aplicar o desconto");
        }
        System.out.println ("Valor atualizado " + obra.getValor());

        if(obra instanceof Livro) {
            System.out.println("Vendendo Livro ");
            Livro livroTemp = (Livro) obra;
            System.out.println("URL: " + livroTemp.getTiragem());

        } else if (obra instanceof Ebook) {
            System.out.println("Vendendo Ebook");
            Ebook ebookTemp = (Ebook) obra;
            System.out.println("URL: " + ebookTemp.getUrlMarcaDagua());
        }
    }
    
}
