package Solid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reino {
    
    ArrayList<Animal> animales = new ArrayList<>();
    List<String> rapidez = Arrays.asList("rápido", "lento");
    
    public void añadirAnimal(){
        //Añade a la lista de animales
        animales.add(new Acuatico());
        animales.add(new Terrestre());
    } 
    
    public void mostrarReino(){
        //Imprimir toda la lista y mostrar su medio y como se mueve
        for (int i=0; i<animales.size(); i++) {
            
            int numAlt = (int) Math.floor(Math.random()*2);
            
            System.out.println(
                    animales.get(i).getMedio()+"\n"+
                    animales.get(i).moverse(rapidez.get(numAlt))+"\n");
        }
    }
    
    
    public static void main(String[] args) { 
        Reino r = new Reino();
        r.añadirAnimal();
        r.mostrarReino();       
    } 
}