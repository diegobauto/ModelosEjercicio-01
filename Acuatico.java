package Solid;


public class Acuatico implements Animal, Aletas {
    
    @Override
    public String getMedio() {
        return "Es un animal acuatico";
    }

    @Override
    public String moverse(String speed) {
        return "Esta nadando muy " + speed + 
                " con " + getAletas() + " aletas";
    }

    @Override
    public int getAletas() {
        return (int) Math.floor(Math.random()*6);
    }
}