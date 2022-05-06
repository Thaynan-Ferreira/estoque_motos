/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.estoque_motos;

/**
 *
 * @author Thaynan Ferreira
 */
/**
 * Class motocicleta
 */
public class motocicleta {

  //
  // Fields
  //

  private String chassi;
  private String ano;
  
  //
  // Constructors
  //
  public motocicleta () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of chassi
   * @param newVar the new value of chassi
   */
  public void setChassi (String newVar) {
    chassi = newVar;
  }

  /**
   * Get the value of chassi
   * @return the value of chassi
   */
  public String getChassi () {
    return chassi;
  }

  /**
   * Set the value of ano
   * @param newVar the new value of ano
   */
  public void setAno (String newVar) {
    ano = newVar;
  }

  /**
   * Get the value of ano
   * @return the value of ano
   */
  public String getAno () {
    return ano;
  }
}
