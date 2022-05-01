 
package terminaldetarjetas;

public class TerminalDeTarjetas extends BancoConnor{

    
    public static void main(String[] args) {
         BancoConnor hola=new BancoConnor(); // nos damos cuenta que heredo las funciones de BancoConnor 
 System.out.println( "1" +"  Tarjeta De Credito ");    
 System.out.println( "2" +"  Tarjeta De Debito ");  
 System.out.print("\n Escoge la Tarjeta ");
        int opcion = scanner.nextInt(); // vemos que podemos usar el Scanner, sin necesidad de tener su  libreria, ya que BancoConnor esta pasando esa herencia
  
      switch(opcion){
               
         case 1 -> { 
             System.out.println( "1"+" Nombre De la Tarjeta");
             System.out.println( "2"+" Numero De la Tarjeta");
             System.out.println( "3"+" Tasa De Interes");
             System.out.println( "4"+" Saldo");
             System.out.println( "5"+" Compra");
             System.out.println( "6"+" Pago");
             System.out.println( "7"+" limite De Credito");
             System.out.println( "8"+" Salir");
                System.out.println( "INGRESA EL NUMERO DE LA OPCION QUE DESEAS");
                int numer=scanner.nextInt();
             System.out.println ( hola.tarjetaCredito(numer));
               }   
     case 2 -> {
            System.out.println( "1"+" Nombre De la Tarjeta");
             System.out.println( "2"+" Numero De la Tarjeta");
             System.out.println( "3"+" Saldo");
             System.out.println( "4"+" Deposito");
             System.out.println( "5"+" compra");
             System.out.println( "6"+" limite De tarjeta De debito");
             System.out.println( "7"+" Salir");
                System.out.println( "INGRESA EL NUMERO DE LA OPCION QUE DESEAS");
                int numer=scanner.nextInt();
             System.out.println ( hola.tarjetaDebito(numer));
               }
            
        
          
               }  
     
         }  
    
    }
      
    

