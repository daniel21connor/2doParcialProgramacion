package terminaldetarjetas;


public class TarjetaDebito  extends TarjetaCredito{ //herencia de TarjetaCredito 
     protected int limiteDebito;
    protected int saldo;
    
    TarjetaDebito (){
        this.limiteDebito= 5000;
        this.saldo=3000;
        
    }
     @Override
     public int usuarioCredito (String usuario){
    System.out.println("EL Nombre Del Usuario ES "+ usuario);
    
    return 0;
    }
    
     @Override // nos damos cuenta de la sobre escritura que se provoco.
    public int numeroDeTarjeta(int numero){
        System.out.println("El numero De Tarjeta Es  "+numero);
        return 0;
    }
    public int deposito (int depo){
       int Dinero=3000;
        int depositoo = Dinero+depo;
        System.out.println("El Saldo total Es  "+"Q"+depositoo);
        
        return 0;
        
    }
     @Override
    public int compra(int compra){
    int  saldoDebi =3000;
       int limite= 5000; 
           if (limite>=compra){
           int saldoTotal=saldoDebi-compra;
               System.out.println("su Saldo total es "+ "Q" + saldoTotal);
               
           }else if (limite <compra){
               System.out.println("el Dinero De Tu Tarjeta Es Menor A la de tu Compra ");
    }
           return 0;
    
    }
        public int getLimiteDebito() { //los metodos get para llamarlo a la pantalla principal
        return limiteDebito;
    }
    
    public int getSaldo() {
        return saldo;
    }
    
    
    
}
