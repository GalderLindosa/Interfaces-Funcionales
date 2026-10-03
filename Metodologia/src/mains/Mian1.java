package mains;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Predicate;


public class Mian1 {




	public static void main(String[] args) {

		// 1.1
		Predicate<Integer> EsMayorDeEdad = new Predicate<Integer>(){
			@Override
			public boolean test(Integer edad) {
				return edad >= 18;
			}


		};
		System.out.println(EsMayorDeEdad.test(20));


		// 1.2
		Function<String, Integer> LogitudTexto  = new Function<String, Integer>(){
			@Override
			public Integer apply(String texto) {
				return texto.length();
			}

		};

		// 1.3
		Consumer<String> mostrarTexto = new Consumer<String>() {
			   @Override
			   public void accept(String texto) {
			       System.out.println(texto);
			   }

		};




	}







}

