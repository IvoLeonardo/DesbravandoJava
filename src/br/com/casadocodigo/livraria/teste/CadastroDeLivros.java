package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produto.Livro;
import br.com.casadocodigo.livraria.produto.LivroFisico;

public class CadastroDeLivros {
    public static void main(String[] args) {
        
        Autor autor1 = new Autor();
        Livro livro = new LivroFisico(autor1);
        
        autor1.setNome("Rodrigo Turini");
        autor1.setEmail("rodrigo.turini@caelum.com.br");
        autor1.setCpf("123.456.789-10");
        
        livro.setNome("Java 8 Prático");
        livro.setDescricao("Novos recursos da linguagem");
        livro.setValor(59.90);
        livro.setIsbn("978-85-66250-46-6");
        livro.mostrarDetalhes();

        Livro livro2 = new LivroFisico(new Autor());
        
        livro2.setNome("Lógica de Programação");
        livro2.setDescricao("Crie seus primeiros programas");
        livro2.setValor(59.90);
        livro2.setIsbn("978-85-66250-22-0");
        livro2.aplicaDesconto(0.10);
        
        livro2.getAutor().setNome("Paulo Silveira");
        livro2.getAutor().setEmail("paulo.silveira@caelum.com.br");
        livro2.getAutor().setCpf("123.456.789-10");
        livro2.mostrarDetalhes();
        
      
        
        
    }
    
}
