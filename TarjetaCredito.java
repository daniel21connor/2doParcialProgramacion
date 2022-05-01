
package terminaldetarjetas;


public class TarjetaCredito {
       protected int limiteDeTarjetaCredito; // se ponen protected  para que se puedan usar si se heredan. o usar de una forma mas comun
    protected int saldoCredito;
  

       TarjetaCredito (){
           this.limiteDeTarjetaCredito=10000;    //constructor para poder llamar con un metodo get.
           this.saldoCredito=5000;       
     
}
    
    public int usuarioCredito (String usuario){
    System.out.println("EL Nombre Del Usuario ES "+ usuario);
    
    
    
return 0;    
}
       
public int tasaDeInteres (int capital, int interes, int tiempo){
    double porcentaje = interes * 0.01;
    double porcen= capital * porcentaje;
    double porcentaje3= porcen * tiempo;
    double tasaTotal= capital *porcentaje3;
    
    System.out.print("La Tasa De interes Es De "+"Q"+tasaTotal);
    return 0;
}
    
  
    public int numeroDeTarjeta(int numero){
        System.out.println("El numero De Tarjeta Es  "+numero);
    
    return 0;
}
    
    public int compra(int compra){
       int  saldoCredi =5000;
       int limite= 10000; 
           if (limite>=compra){
           int saldoTotal=saldoCredi-compra;
               System.out.println("su Saldo total es "+ "Q" + saldoTotal);
               
           }else if (limite <compra){
               System.out.println("el credito que pediste sobre pasa el limite de saldo, por favor abone mas o haga una compra menor");
           
       }
           return 0;     }
    public int paga (int paga){
        int saldoCredito1 = 5000;
        int pagar = saldoCredito1+paga;
        System.out.println("El saldo Total ahora despues de la paga es "+"Q"+pagar);
        
        return 0;
        // Aca los metodos solo resuelven y  tambien dan el resultado a la pantalla principal 
    }
       public int getLimiteDeTarjetaCredito() {
        return limiteDeTarjetaCredito;
    }
    
    
    
    public int getSaldoCredito() {
        return saldoCredito;
    }
    // metodos get para arrojar el resultado del constructor a la pantalla principal
}
