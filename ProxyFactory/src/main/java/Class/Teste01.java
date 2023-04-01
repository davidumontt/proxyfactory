package Class;
import Class.OrcamentoProxy;

public class Teste01 {
    OrcamentoProxy proxy = new
OrcamentoProxy(2,2);
System.out.println("Valor desconto antes =" + proxy.getDescontoOrcamento());
System.out.println("Valor desconto depois=" + proxy.getDescontoOrcamento());
    
}
