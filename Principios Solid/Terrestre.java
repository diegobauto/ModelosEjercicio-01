package Solid;

public class Terrestre implements Animal{
    
    @Override
    public String medio() {
        return "Es un animal terrestre";
    }
    
    @Override
    public String moverse(String speed) {
        return "Esta corriendo muy " + speed;
    }
}