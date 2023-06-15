
package postnet;

/**
 * clase TarjetaDeCredito
 *
 */
class TarjetaDeCredito {
    
    private String entidadBancaria;
    private String nroTarjeta;
    private double saldo;
    private EntidadBancaria entidadFinanciera;
    private Persona titular;
    
  /**    
   * constructor TarjetaDeCredito
   * @param entidadBancaria
   * @param nroTarjeta
   * @param saldo
   * @param titular
   * @param entidadFinanciera 
   */

    public TarjetaDeCredito(String entidadBancaria, String nroTarjeta, double saldo, Persona titular, EntidadBancaria entidadFinanciera) {
        this.entidadBancaria = entidadBancaria;
        this.nroTarjeta = nroTarjeta;
        this.saldo = saldo;
        this.entidadFinanciera = entidadFinanciera;
        this.titular = titular;
    }

    @Override
    public String toString() {
             return "TarjetaDeCredito{" + "entidadBancaria=" + entidadBancaria + ", nroTarjeta=" + nroTarjeta + ", saldo=" + saldo + ", entidadFinanciera=" + entidadFinanciera + ", titular=" + titular + '}';
    }

    /**
     * Obtiene la entidad bancaria de la tarjeta.
     *
     * @return
     */
    public String getEntidadBancaria() {
        return entidadBancaria;
    }

    /**
     * Obtiene el número de tarjeta.
     *
     * @return e
     */
    public String getNroTarjeta() {
        return nroTarjeta;
    }

    /**
     * Obtiene el saldo de la tarjeta.
     *
     * @return
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Obtiene la entidad financiera de la tarjeta.
     *
     * @return
     */
    public EntidadBancaria getEntidadFinanciera() {
        return entidadFinanciera;
    }

    /**
     * Obtiene el titular de la tarjeta.
     *
     * @return el titular de la tarjeta
     */
    public Persona getTitular() {
        return titular;
    }


    /**
     * Establece la entidad bancaria de la tarjeta.
     *
     * @param entidadBancaria
     */
    public void setEntidadBancaria(String entidadBancaria) {
        this.entidadBancaria = entidadBancaria;
    }

    /**
     * Establece el número de tarjeta.
     *
     * @param nroTarjeta
     */
    public void setNroTarjeta(String nroTarjeta) {
        this.nroTarjeta = nroTarjeta;
    }

    /**
     * Establece el saldo de la tarjeta.
     *
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Establece la entidad financiera de la tarjeta.
     *
     * @param entidadFinanciera
     */
    public void setEntidadFinanciera(EntidadBancaria entidadFinanciera) {
        this.entidadFinanciera = entidadFinanciera;
    }

    /**
     * Establece el titular de la tarjeta.
     *
     * @param titular
     */
    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    /**
     * Verifica si la tarjeta tiene saldo disponible para realizar una compra.
     *
     * @param monto
     * @return true si la tarjeta tiene saldo disponible, false en caso contrario
     */
    public boolean tieneSaldoDisponible(double monto) {
        return saldo>=monto;
    }

    /**
     * Retorna el nombre completo del titular de la tarjeta.
     *
     * @return
     */
    public String nombreCompletoDelTitular() {
        return titular.nombreCompleto();
    }

    /**
     * Descuenta el monto de una compra del saldo de la tarjeta.
     *
     * @param monto
     */
    public void descontar(double monto) {
      saldo=saldo-monto;
    }
    
    
    
    
}
