package cuentas;

/**
 * Clase que representa una cuenta bancaria.
 */
public class CCuenta {
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor de la clase CCuenta.
     */
    public CCuenta() {
    }
    
    /**
     * Constructor que permite establecer los valores iniciales de la cuenta.
     *
     * @param nom   El nombre del titular de la cuenta.
     * @param cue   El número de cuenta.
     * @param sal   El saldo inicial de la cuenta.
     * @param tipo  El tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }
    
    /**
     * Obtiene el saldo actual de la cuenta.
     *
     * @return El saldo de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta.
     *
     * @param saldo El saldo de la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     *
     * @return El nombre del titular.
     */
    public String getNombre() {
        return nombre;
    }

     /**
     * Establece el nombre del titular de la cuenta.
     *
     * @param nombre El nombre del titular.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de cuenta.
     *
     * @return El número de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

     /**
     * Establece el número de cuenta.
     *
     * @param cuenta El número de cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el tipo de interés de la cuenta.
     *
     * @return El tipo de interés.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés de la cuenta.
     *
     * @param tipoInterés El tipo de interés.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     *
     * @return El saldo de la cuenta.
     */
    public double estado() {
        return saldo;
    }

    /**
     * Ingresa una cantidad en la cuenta.
     *
     * @param cantidad La cantidad a ingresar.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Retira una cantidad de la cuenta.
     *
     * @param cantidad La cantidad a retirar.
     * @throws Exception Si la cantidad es negativa o supera el saldo disponible.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}