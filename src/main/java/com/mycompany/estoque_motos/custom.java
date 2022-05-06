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
 * Class custom
 */
public class custom {

  //
  // Fields
  //

  private String modelo;
  private String cor;
  private float preco;
  
  //
  // Constructors
  //
  public custom () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of modelo
   * @param newVar the new value of modelo
   */
  public void setModelo (String newVar) {
    modelo = newVar;
  }

  /**
   * Get the value of modelo
   * @return the value of modelo
   */
  public String getModelo () {
    return modelo;
  }

  /**
   * Set the value of cor
   * @param newVar the new value of cor
   */
  public void setCor (String newVar) {
    cor = newVar;
  }

  /**
   * Get the value of cor
   * @return the value of cor
   */
  public String getCor () {
    return cor;
  }

  /**
   * Set the value of preco
   * @param newVar the new value of preco
   */
  public void setPreco (float newVar) {
    preco = newVar;
  }

  /**
   * Get the value of preco
   * @return the value of preco
   */
  public float getPreco () {
    return preco;
  }

  //
  // Other methods
  //

}