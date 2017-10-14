package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produto.CarrinhoDeCompras;
import br.com.casadocodigo.livraria.produto.Ebook;
import br.com.casadocodigo.livraria.produto.Livro;
import br.com.casadocodigo.livraria.produto.LivroFisico;
import br.com.casadocodigo.livraria.produto.Produto;

public class RegistroDeVendas {
    public static void main(String[] args) {
        
        Autor autor = new Autor();
        autor.setNome("Maurício Aniche");
        
        Livro livro = new LivroFisico(autor);
        livro.setNome("Test-Driven Development");
        livro.setValor(59.90);
        
        Livro ebook = new Ebook(autor);
        ebook.setNome("Test-Driven Development");
        ebook.setValor(29.90);
        
        
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(livro);
        carrinho.adiciona(ebook);
        
        System.out.println("Total R$ "+carrinho.getTotal());
        
        Produto[] produtos = carrinho.getProduto();
        
        for(Produto produto : produtos){
            try {
                if(produto != null){
                    System.out.println(produto.getValor());
                }
            } catch (Exception e) {
            }
        }
        System.out.println("Fui executado!");
        
        /*
        fisico.setAutor("Maurício Aniche");
        fisico.setNome("Test-Driven Development");
        
        Livro ebook = new Ebook(new Autor());
        
        ebook.setNome("Test-Driven Development");
        */
        
    }
}
