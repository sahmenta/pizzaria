package br.com.poo.model;

public class Ingredientes {

    private String [] ingredientes = {"Molho", "Mozarella", "Presunto de Parma", "Champignons", "Alcachofra",
            "Azeitonas Pretas", "Salame", "Pimentão", "Pimenta Roxa", "Peperoni"} ;

    public Ingredientes(){

    }

    public String ingredientePizza(int sabor){
        String aux = "";
        switch(sabor){
            case 0:
                aux = ingredientes[0] + ", ";
                aux += ingredientes[1];
                break;
            case 1:
                aux = ingredientes[0] + ", ";
                aux += ingredientes[1] + ", ";
                aux += ingredientes[2] + ", ";
                aux += ingredientes[3] + ", ";
                aux += ingredientes[4] + ", ";
                aux += ingredientes[5] + ", ";
                aux += ingredientes[6];
                break;
            case 2:
                aux = ingredientes[0] + ", ";
                aux += ingredientes[1] + ", ";
                aux += ingredientes[6] + ", ";
                aux += ingredientes[7] + ", ";
                aux += ingredientes[8] + ", ";
                aux += ingredientes[9];
                break;
            case 3:
                aux = ingredientes[0] + ", ";
                aux += ingredientes[1] + ", ";
                aux += ingredientes[3];
                break;
            case 4:
                aux = ingredientes[0] + ", ";
                aux += ingredientes[1] + ", ";
                aux += ingredientes[2] + ", ";
                aux += ingredientes[3];
                break;

        }

        return aux;
    }
}
