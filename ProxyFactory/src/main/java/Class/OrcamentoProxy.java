package Class;
import Class.Orcamento;
import java.math.BigDecimal;
public class OrcamentoProxy extends Orcamento {
    private BigDecimal descontoOrcamento;

private Orcamento orcamento;

public OrcamentoProxy(BigDecimal
descontoOrcamento, Orcamento orcamento) {
this.descontoOrcamento =
descontoOrcamento;
this.orcamento = orcamento;
}

public OrcamentoProxy(int i, int j) {
}

public BigDecimal getDescontoOrcamento() {
if(descontoOrcamento == null){ 
this.descontoOrcamento =
orcamento.getDescontoOrcamento();
}
return this.descontoOrcamento;
}



    
}
