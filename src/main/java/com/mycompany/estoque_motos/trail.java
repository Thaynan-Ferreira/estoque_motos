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
 * Class trail
 */
public class trail {

  //
  // Fields
  //

  private String modelo;
  private String cor;
  private float preco;
  
  //
  // Constructors
  //
  public trail () { };
  
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
  public void setModelo (String modelo) {
    this.modelo = modelo;
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
  public void setCor (String cor) {
    this.cor = cor;
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
  public void setPreco (float preco) {
    this.preco = preco;
  }

  /**
   * Get the value of preco
   * @return the value of preco
   */
  public float getPreco () {
    return preco;
  }

 
}