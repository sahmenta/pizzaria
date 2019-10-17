package pizzaria;

public class Sabor {
    
    private String [] sabores = {"Marguerita", "Capricciosa", "Diavolo", "Funghi", "Prosciutto"};

    public String[] getSabores() {
        return sabores;
    }
   
    
    public String retornaSabor(int nSabor){
        String saborEscolhido = "";
        
        saborEscolhido = sabores[nSabor];
        
        return saborEscolhido;
    }
}
