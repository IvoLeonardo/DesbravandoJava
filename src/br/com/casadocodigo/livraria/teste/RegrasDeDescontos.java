package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produto.Ebook;
import br.com.casadocodigo.livraria.produto.Livro;
import br.com.casadocodigo.livraria.produto.LivroFisico;

public class RegrasDeDescontos {
    public static void main(String[] args) {
        
        
        Livro livro1 = new LivroFisico(new Autor());
        
        livro1.setAutor("Rodrigo Turini");
        
        livro1.setValor(59.90);
        
        double desconto = 0.3;
        if(!livro1.aplicaDesconto(desconto)){
            System.out.println("Desconto não pode ser maior que 30%");
        }else{
            System.out.println("Valor do livro com desconto: R$ "+livro1.getValor());
        }
        
        Livro ebook1 = new Ebook(new Autor());
        
        ebook1.setValor(29.90);
        
        if(!ebook1.aplicaDesconto(0.1)){
            System.out.println("O desconto do ebook não pode ser maior do que 15%.");
        }else{
            System.out.println("Valor do ebook com desconto R$ "+ebook1.getValor());
        }
        
    }
}
