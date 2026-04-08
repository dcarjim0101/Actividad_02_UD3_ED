package actividad_02_ud3_ed;

/**
 * Clase que representa una cuenta bancaria con información
 * del titular, número de cuenta, saldo y tipo de interés.
 *
 * @author Ana
 */
public class CCuenta {

    /** Nombre del titular de la cuenta */
    protected String nombre;

    /** Número identificador de la cuenta bancaria */
    private String cuenta;

    /** Saldo actual disponible en la cuenta */
    private double saldo;

    /** Tipo de interés aplicado a la cuenta */
    private double tipoInterés;

    /**
     * Constructor por defecto de la clase CCuenta.
     * Inicializa una cuenta sin valores asignados.
     */
    public CCuenta() {
    }

    /**
     * Constructor con parámetros para crear una cuenta con valores iniciales.
     *
     * @param nom Nombre del titular de la cuenta
     * @param cue Número de cuenta bancaria
     * @param sal Saldo inicial de la cuenta
     * @param tipo Tipo de interés aplicado a la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }

    /**
     * Asigna un nuevo nombre al titular de la cuenta.
     *
     * @param nom Nuevo nombre del titular
     */
    public void asignarNombre(String nom) {
        nombre = nom;
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     *
     * @return Nombre del titular
     */
    public String obtenerNombre() {
        return nombre;
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     *
     * @return Saldo disponible
     */
    public double estado() {
        return saldo;
    }

    /**
     * Permite ingresar una cantidad de dinero en la cuenta.
     *
     * @param cantidad Cantidad de dinero que se desea ingresar
     * @throws Exception Se lanza si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(saldo + cantidad);
    }

    /**
     * Permite retirar una cantidad de dinero de la cuenta.
     *
     * @param cantidad Cantidad de dinero que se desea retirar
     * @throws Exception Se lanza si la cantidad es negativa o
     * si no hay suficiente saldo en la cuenta
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No hay suficiente saldo");
        }
        setSaldo(saldo - cantidad);
    }

    /**
     * Obtiene el número de cuenta.
     *
     * @return Número de cuenta bancaria
     */
    public String obtenerCuenta() {
        return cuenta;
    }

    /**
     * Establece un nuevo número de cuenta.
     *
     * @param cuenta Nuevo número de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Establece el saldo de la cuenta.
     *
     * @param saldo Nuevo saldo de la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el tipo de interés de la cuenta.
     *
     * @return Tipo de interés aplicado
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés de la cuenta.
     *
     * @param tipoInterés Nuevo tipo de interés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}