package mains;

import java.util.ArrayList;
import java.util.List;

import clases.GestorPedidos;
import clases.Pedido;

public class Main2 {
	
	
	


	

	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Pedido> pedidos = new ArrayList<>();
		
		pedidos.add(new Pedido(1, "Ana", 1200, true));
		pedidos.add(new Pedido(2, "Carlos", 350, false));
		pedidos.add(new Pedido(3, "Marta", 800, true));
		pedidos.add(new Pedido(4, "Luis", 1500, false));

		List<Pedido> pedidosEncontrados = new ArrayList();
		
		pedidosEncontrados=GestorPedidos.buscar(pedidos);
		
		for(Pedido p : pedidosEncontrados) {
			p.toString();
		}
		
		
	}
	



	
	
	
}
