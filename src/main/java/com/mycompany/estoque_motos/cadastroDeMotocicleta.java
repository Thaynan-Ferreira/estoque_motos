/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.estoque_motos;

import java.util.Scanner; //chama a biblioteca para receber entrada de dados do usuario

/**
 *
 * @author Thaynan Ferreira
 */
public class cadastroDeMotocicleta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //VARIAVEIS PARA RECEBER AS INFORMAÇOES PARA CADASTRO DA MOTOCICLETA
        String chassi;
        String ano;
        String modelo;
        String cor;
        String preco;
        int categoria;
        city moto = new city();
        
        System.out.println("Escolha a categoria da motocicleta:\n ");
        System.out.println("--------------------------------------");
        System.out.println("(1) CITY \n (2) TRAIL \n (3) CUSTOM");
        categoria = entrada.nextInt();
        
        switch (categoria){
            case 1 :
                
                System.out.println("Digite o chassi da motocicleta: ");
                chassi = entrada.next();
                moto.setChassi(chassi);
                
                System.out.println("Digite o Ano da motocicleta: ");
                ano = entrada.next();
                moto.setAno(ano);
                
                System.out.println("Digite o modelo da motocicleta: ");
                modelo = entrada.next();
                moto.setModelo(modelo);
                
                System.out.println("Digite o cor da motocicleta: ");
                cor = entrada.next();
                moto.setCor(cor);
                
                System.out.println("Digite o preco da motocicleta: ");
                preco = entrada.next();
                moto.setPreco(preco);
                
                //impressao dos dados
                System.out.println("-----------------------------------");
                System.out.println("CATEGORIA City:");
                System.out.println("Motocicleta: " + moto.getModelo());
                System.out.println("Cor: " + moto.getCor());
                System.out.println("Valor: R$" + moto.getPreco() + ",00");
                System.out.println("EM ESTOQUE");
        }
        
        
    }
    
}
