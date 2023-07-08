package Exerc6;

import java.util.ArrayList;
import java.util.List;

public class Evento {
	 private List<Ingresso> ing;

	    public Evento() {
	        ing = new ArrayList<>();
	    }

	    public void vendeIngresso(Ingresso ingresso) {
	        ing.add(ingresso);
	    }

	    public double valorTotal() {
	        double valorTotal = 0;
	        for (Ingresso ingresso : ing) {
	            valorTotal += ingresso.getValor();
	        }
	        return valorTotal;
	    }

	    public void ingressosNaoVendidos() {
	        for (Ingresso ingresso : ing) {
	            if (!(ingresso instanceof IngressoVIP)) {
	                System.out.println(ingresso);
	            }
	        }
	    }
}
