package pizzaria;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pizza implements Pedido{
    
    private String tamanho;
    private int sabor;
    Ingredientes s;
    
    public Pizza(String tamanho, int sabor, Ingredientes s){
        this.sabor = sabor;
        this.tamanho = tamanho;
        this.s = s;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getSabor() {
        return sabor;
    }

    public void setSabor(int sabor) {
        this.sabor = sabor;
    }
    
    @Override
    public double calcularValor(){
        double preco = 0;
        if(tamanho.equals("P")){
            preco = 20.0;
        }
        else if(tamanho.equals("M")){
            preco = 30.50;
        }
        else if(tamanho.equals("G")){
            preco = 40.67;
        }
        else{
            System.out.println("Opção inválida. Escolha um tamanho P, M ou G");
        }
        return preco;
    }
    
    @Override
    public Date dataPedido(){
        SimpleDateFormat dtFormato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date agora = new Date();
        return agora;
    }
    
}
