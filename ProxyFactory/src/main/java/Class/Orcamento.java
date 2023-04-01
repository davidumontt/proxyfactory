/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;
import java.math.BigDecimal;

/**
 *
 * @author Davi
 */
public class Orcamento {
    private BigDecimal valorOrcamento;
    private int qtdItens;
    private BigDecimal descontoOrcamento;

    public Orcamento(BigDecimal valorOrcamento, BigDecimal descontoOrcamento) {
        this.valorOrcamento = valorOrcamento;
        this.qtdItens = qtdItens;
        this.descontoOrcamento = descontoOrcamento;
    }

    public Orcamento() {
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public void setValorOrcamento(BigDecimal valorOrcamento) {
        this.valorOrcamento = valorOrcamento;
    }

    public int getQtdItens() {
        return qtdItens;
    }

    public void setQtdItens(int qtdItens) {
        this.qtdItens = qtdItens;
    }

    public BigDecimal getDescontoOrcamento() {
        try {
                Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
            }
        return descontoOrcamento;
}

    public void setDescontoOrcamento(BigDecimal descontoOrcamento) {
        this.descontoOrcamento = descontoOrcamento;
    }
    
    
    
}
