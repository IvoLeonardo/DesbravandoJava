package br.com.casadocodigo.livraria.produto;

import br.com.casadocodigo.livraria.Autor;

public abstract class Livro implements Produto {
    
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;
    
    public Livro(Autor autor){
        this();
        this.autor = autor;
    }
    
    public Livro(){
        this.isbn = "000-00-00000-00-0";
    }
    
    public void mostrarDetalhes(){
        
        String mensagem = "Mostrando detalhes do livro";
        System.out.println(mensagem);
        System.out.println("");
        System.out.println("Livro: "+getNome());
        System.out.println(getDescricao());
        System.out.println("preço: R$ "+valor);
        System.out.println("ISBN: "+getIsbn());
        if(this.temAutor()){
            getAutor().mostrarDetalhes();    
        }
        System.out.println("*********************************************");
    }
    
    public abstract boolean aplicaDesconto(double porcentagem);
    
    boolean temAutor(){
        return this.getAutor() != null;
    }
    
    public double getValor(){
        return this.valor;
    }
    
    public void setValor(double valor){
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }
    public void setAutor(String nome){
        this.nome = nome;
    }
    
}
