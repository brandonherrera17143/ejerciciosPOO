
package ejercicios;

public class TelefonoMovil extends ProductoElectronico{
    
    public int capacidadAlmacenamiento;
    public int duracionBateria;
    
    public int getCapacidadAlmacenamiento(){
        return this.capacidadAlmacenamiento;
    }    
    public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento){
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }
    
    public int getDuracionBateria(){
        return this.duracionBateria;
    }
    public void setDuracionBateria(int duracionBateria){
        this.duracionBateria = duracionBateria;
    }
    
    
}
