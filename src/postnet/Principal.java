
package postnet;
/**
 * Implementacion de un datáfono sencillo con pago a plazos.
 * Ejemplo integrador clase Principal
 */
public class Principal {
    /**
     * Metodo principal
     * @param args 
     */
    public static void main(String[] args) {
        
        Posnet posnet=new Posnet();
        Persona titular=new Persona("49861204X","Maria","Martin","656462278","maria@gmail.com");
        TarjetaDeCredito tarjeta=new TarjetaDeCredito("BIRZA","455607424464",15000,titular,EntidadBancaria.BIRZA);
        
        System.out.print("Tarjeta antes del pago: ");
        System.out.print(tarjeta+"\n");
                
        System.out.print("Ticket tras pago: ");
        Ticket ticketGenerado=posnet.efectuarPago(tarjeta, 10000, 5);
        System.out.print(ticketGenerado +"\n");
        
        System.out.print("Tarjeta después del pago: ");
        System.out.print(tarjeta+"\n");                      
    }
    
}
