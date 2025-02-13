

package Maquinas;

import Interfaces.InterfazMaquina;
import java.util.Random;

public class Maquina implements InterfazMaquina {
    Random random = new Random();
    protected String nombre;
    protected int cuantosLotes;
    protected int fallo;
    protected double beneficio;
    protected double costeReparacion;
    public int retardo;

    public Maquina (String nombre){
        this.nombre = nombre.toUpperCase();
        this.fallo = random.nextInt(1,125);
        
    }
    
    
}
