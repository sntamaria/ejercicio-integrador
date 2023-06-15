
package postnet;

/**
 * clase ticket
 */


class Ticket {
  
    private String nombreApellido;
    private double montoTotal;
    private double montoPorCuota;
    

    /**
     * constructor ticket
     * @param nombreApellido
     * @param montoTotal
     * @param montoPorCuota 
     */
    public Ticket(String nombreApellido, double montoTotal, double montoPorCuota) {
        this.nombreApellido = nombreApellido;
        this.montoTotal = montoTotal;
        this.montoPorCuota = montoPorCuota;
    }


    /**
     * Obtiene el nombre y apellido del titular de la tarjeta.
     *
     * @return
     */
    public String getNombreApellido() {
        return nombreApellido;
    }

    /**
     * Obtiene el monto total de la compra.
     *
     * @return
     */
    public double getMontoTotal() {
        return montoTotal;
    }

    /**
     * Obtiene el monto por cuota.
     *
     * @return
     */
    public double getMontoPorCuota() {
        return montoPorCuota;
    }

    /**
     * Establece el nombre y apellido del titular de la tarjeta.
     *
     * @param nombreApellido
     */
    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    /**
     * Establece el monto total de la compra.
     *
     * @param montoTotal
     */
    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    /**
     * Establece el monto por cuota.
     *
     * @param montoPorCuota
     */
    public void setMontoPorCuota(double montoPorCuota) {
        this.montoPorCuota = montoPorCuota;
    }
    
    
    
}
