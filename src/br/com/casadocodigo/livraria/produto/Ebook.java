package br.com.casadocodigo.livraria.produto;

import br.com.casadocodigo.livraria.Autor;

public class Ebook extends Livro implements Promocional {
    
    private String waterMark;
    
    public Ebook(Autor autor){
        super(autor);
    }
    
    @Override
    public boolean aplicaDesconto(double porcentagem){
        if(porcentagem > 0.15){
            return false;
        }
        double desconto = this.getValor() * porcentagem;
        this.setValor(this.getValor() - desconto);
        System.out.println("aplicando desconto no Ebook");
        return true;
    }
    
    public String getWaterMark(){
        return this.waterMark;
    }
    
    public void setWaterMark(String waterMark){
        this.waterMark = waterMark;
    }
    
}
