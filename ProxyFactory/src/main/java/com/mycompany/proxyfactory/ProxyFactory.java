/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proxyfactory;

import Class.Orcamento;
import java.math.BigDecimal;

/**
 *
 * @author Davi
 */
public class ProxyFactory {

    public static void main(String[] args) {
    Orcamento orcamento = new Orcamento
    (new BigDecimal("200"), new BigDecimal("0"));
    System.out.println(orcamento.getValorOrcamento() + "Valor desconto antes = ");
    System.out.println("Valor desconto antes = " + orcamento.getDescontoOrcamento());
}
}
