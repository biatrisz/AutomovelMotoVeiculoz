package GaragemVeiculo;

public class Moto extends Veiculo {
private int cilindrada;

	public int getCilindrada() {
	return cilindrada;
}

public void setCilindrada(int cilindrada) {
	this.cilindrada = cilindrada;
}

	public Moto(String marca, String modelo, int ano, String cor, int cilindrada) {
	super(marca, modelo, ano, cor);
	this.cilindrada = cilindrada;
}

	public Moto(String marca, String modelo, int ano, String cor) {
		super(marca, modelo, ano, cor);
		
	}

}
