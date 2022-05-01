
package terminaldetarjetas;


public class TarjetaCredito {
       protected int limiteDeTarjetaCredito;
    protected int saldoCredito;
  

       TarjetaCredito (){
           this.limiteDeTarjetaCredito=10000;
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
    
    
}
