/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud3_ed;

/**
 * 
 * @author Ana
 */
public class CCuenta {


     
  protected String nombre; // variable protegida de tipo cadena para el nombre
    private String cuenta; // variable privada de tipo cadena para la cuenta
    private double saldo; // variable privada de tipo decimal largo y exacto para el saldo
    private double tipoInterés; // variable privada de tipo decimal largo y exacto para el tipo de interés

  
    public CCuenta ()
    {
    }
   /**
    * 
    * @param nom Nombre del titular de la cuenta
    * @param cue Cuenta
    * @param sal Saldo de la cuenta
    * @param tipo Tipo de interés de la cuenta
    */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom; // valor del nombre
        cuenta=cue; // valor de la cuenta
        saldo=sal; // valor del saldo
        tipoInterés=tipo; // valor del tipo de interés
    }
  /**
   * 
   * @param nom Pide el nombre para asignarlo
   */
    public void asignarNombre(String nom) // asigna un nombre
    {
        nombre=nom;
    }
   
    /**
     * @param obtenerNombre obtiene el nombre de la funcion anterior
     * @return El metodo devuelve el nombre que se ha introducido
     */
    public String obtenerNombre() // obtiene un nombre
    {
        return nombre;
    }

    /**
     * @param estado guarda el estado actual de la cuenta
     * @return El metodo devuelve la cantidad de saldo actual
     */
     public double estado () // muestra la cantidad de saldo en la cuenta
    {
        return saldo;
    }

    /**
     * 
     * @param cantidad pide una cantidad y si cumple la condicion, aparece un error y
     * se añade al saldo
     * @throws Exception muestra un error que impide ingresar una cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }

    /**
    * 
    * @param cantidad pide una cantidad y si cumple con la condicion, se muestra un error,
    * y si cumple la siguiente condicion, se resta al saldo
    * @throws Exception el primer error dice que no se puede ingresar una cantidad negativa
    * y el segundo error dice que no hay suficiente saldo
    */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    
    /**
     * @param obtenerCuenta obtiene la cuenta
     * @return devuelve el valor de la variable cuenta
     */
    public String obtenerCuenta ()
    {
        return cuenta;
    }

  /**
   * 
   * @param cuenta muestra la cuenta
   */
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

  /**
   * 
   * @param saldo muestra el saldo
   */
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

 /**
  * @param getTipoInterés obtiene el tipo de interés
  * @return devuelve el valor de la variable tipoInterés
  */
  public double getTipoInterés() {
    return tipoInterés;
  }

  /**
   * 
   * @param tipoInterés muestra el valor de la variable tipoInterés
   */
  public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}
