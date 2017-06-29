package hotel;

public class Estadia {
	
	private double valor;
	private int dias;
	private Animal animal;
	public Estadia(double valor, int dias, Animal animal) {
		super();
		this.valor = valor;
		this.dias = dias;
		this.animal = animal;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getDias() {
		return dias;
	}
	public void setDias(int dias) {
		this.dias = dias;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	@Override
	public String toString() {
		return animal.getNome() + ", " + animal.getTipo() + ", " + dias + "dias com o preço de R$ " + valor;
	}
	
	
	

	
	
	

}
