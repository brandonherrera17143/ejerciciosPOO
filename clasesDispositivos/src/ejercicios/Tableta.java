
package ejercicios;

public class Tableta extends ProductoElectronico {
    
    public double tamanoPantalla;
    public String resolucionPantalla;
    
    
    public double setTamanoPantalla(){
        return this.tamanoPantalla;
    }
    public void getTamanoPantalla(double tamanoPantalla){
       this.tamanoPantalla = tamanoPantalla; 
    }
    
    public String setResolucionPantall(){
        return this.resolucionPantalla;
    }
    
    public void getResolucionPantalla(String resolucionPantalla){
        this.resolucionPantalla = resolucionPantalla;
    }
    
}
