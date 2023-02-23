
package pooejercicios;

public class Cuentas {

   float cuenta = 0;
   
   
   public Cuentas(){
       
   }
   
   public float acreditarCuentas(float cuenta){   
      return this.cuenta += cuenta;
   }
   public float debitarCuentas(float debitar ){
      return this.cuenta -= debitar;
   }
   
   @Override
   public String toString(){
       return "total saldo " + this.cuenta;
   }
}
