package clases;

import java.util.ArrayList;
import java.util.List;

public class GestorPedidos {
	
	
	public static List<Pedido> buscar(List pedidos) {
		
		List<Pedido> encontrados = new ArrayList();
		
		for(int i=0; i<pedidos.size(); i++) {
			Pedido p=(Pedido) pedidos.get(i);
			
			if(p.getImporte()>1000 && !p.isPagado()) {
				encontrados.add(p);
			}
		}
			
		
		return encontrados;
	}
	
	
}