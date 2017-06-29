package hotel;

import java.util.ArrayList;

public class Recepcao {
	
	private ArrayList estadias;
	 
	public Recepcao(){
		estadias = new ArrayList<Estida>();
	}
	
	public void checkIn(String nome, String tipo, int idade, int dias, double valor){
		Animal novoAnimal = new Animal(nome, tipo, idade, dias,valor);
		estadias.add(novoAnimal);
	}
	
	public void checkOut(String nome){
		for (Estadia estadia : estadias) {
			if (estadia.getNome().equals(nome)) {
				estadias.remove(estadia);	
			}
			
		}
	
	
	}
	
	public int getNumDeHospedes(){
		int numHospedes = estadias.size();
		return numHospedes;
	}
	
	public double getLucroTotal(){
		double lucro = 0;
		for (Estadia estadia: estadias) {
			lucro += estadias.getValor();
		}
		return lucro;
	}

	@Override
	public String toString() {
		String hospedes = "Estadias:";
		for (Estadia estadia : estadias) {
			hospedes = "\n" + estadia.toString();	
		}
		return hospedes;
	}
	
	
	
	
	
	
	

}
