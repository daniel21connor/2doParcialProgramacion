package terminaldetarjetas;
import java.util.Scanner;
public class BancoConnor {// llamada de objetos, esta se heredara la tarjeta debito
       TarjetaCredito objeto = new TarjetaCredito();
    TarjetaDebito tarjeta= new TarjetaDebito();
    static  Scanner scanner=new Scanner (System.in);
    
    public int tarjetaCredito(int numeral){
    System.out.println("Bienvenido al banco");       
    System.out.println("Tarjetas De Credito ");
    switch (numeral){
        
        case 1:
             System.out.println("Ingrese Su nombre ");
             String usuario=scanner.nextLine();
             System.out.print(objeto.usuarioCredito(usuario)); //se llama a lasclase TarjetaCredito
            break;
       case 2:
             System.out.println("ingrese el numero de tarjeta");
             int numer=scanner.nextInt();
             System.out.println(objeto.numeroDeTarjeta(numer));
             break;
       case 3:
            System.out.println("ingrese el capital");
            int capital= scanner.nextInt();
            System.out.println("ingrese la taza De Interes");
            int taza =scanner.nextInt();
            System.out.println("ingrese el lapso de tiempo en meses");
            int tiempo=scanner.nextInt();
            System.out.println(objeto.tasaDeInteres(capital, taza, tiempo));
              break;   
      case 4:
            System.out.println("El saldo Actual Es De  " +"Q"+ objeto.getSaldoCredito());
              break;
        case 5:
             System.out.println("ingrese el valor de compra ");
             int compra=scanner.nextInt();
             System.out.println(objeto.compra(compra));     
             break;
        case 6:
             System.out.println("ingrese el valor de pago ");
             int pago=scanner.nextInt();
              System.out.println(objeto.paga(pago));
              break;
         case 7:
             System.out.println("El limite de credito de la tarjeta es "+"Q"+objeto.limiteDeTarjetaCredito);
            
            default : System.out.println("GRACIAS POR USAR LA TARJETA");
            
    }//nos damos cuenta que todo resultado se da en la pantall principal, no siendo la main.
        return 0;
 }
    
    
          public int tarjetaDebito (int numer){
 System.out.println("Bienvenido al banco");       
    System.out.println("Tarjetas De Debito ");
    switch (numer){
        
        case 1:
             System.out.println("Ingrese Su nombre ");
             String usuario=scanner.nextLine();
             System.out.print(tarjeta.usuarioCredito(usuario));//se llama a la clase TarjetaDebito
            break;
        case 2:
             System.out.println("ingrese el numero de tarjeta");
             int numero=scanner.nextInt();
             System.out.println(tarjeta.numeroDeTarjeta(numero));
             break;
               case 3:
             System.out.println("El saldo Actual Es De  " + "Q"+ tarjeta.getSaldo());
              break;
         case 4:
             System.out.println("ingrese el valor del Deposito ");
             int pago=scanner.nextInt();
              System.out.print(tarjeta.deposito(pago));
              break;
         case 5:
             System.out.println("ingrese el valor de compra ");
             int compra=scanner.nextInt();
             System.out.print(tarjeta.compra(compra));     
             break;
        case 6:
             System.out.println("El limite de credito de la tarjeta es "+ "Q"+tarjeta.getLimiteDebito());
              break;
          
        default : System.out.println("GRACIAS POR USAR LA TARJETA");
            
    }
        return 0;//nos damos cuenta que todo resultado se da en la pantall principal, no siendo la main.


}
}
