package edu.escuelaing.arsw.tallerInteractivo.security;

import java.util.ArrayList;
import java.util.List;

public class Ticket {
	private static Ticket _ticket= new Ticket();
	
	private final List<String> tickets;
	
	private int numeroTicket = 0;
	public Ticket() {
		tickets = new ArrayList<String>();
	}
	
	public static Ticket getInstance() {
		return _ticket;
	}
	
	public synchronized Integer getTicket() {
		Integer numero = numeroTicket++;
		tickets.add(numero.toString());
		return numero;
	}
	
	public boolean checkTicket(String ticket) {
		boolean valido = tickets.remove(ticket);
		return valido;
		
	}

}
