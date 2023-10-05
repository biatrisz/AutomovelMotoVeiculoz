package GaragemVeiculo;

public class Principal {

	public static void main(String[] args) {
		Veiculo veiculo = new Veiculo ("Ford", "2021", 432, "REW" );
		System.out.println("Veiculo:");
		System.out.println("Marca: "+ veiculo.getMarca());
		System.out.println("Modelo:"+ veiculo.getModelo());
		System.out.println("Ano: " + veiculo.getAno());
		
		Automovel automovel = new Automovel ("Ford","sla",4, "2021", 432, "REW");
		System.out.println("Automovel: ");
		System.out.println("numeroPortas: " + automovel.getNumeroPortas());
		System.out.println("Motor: " + automovel.getMotor());
		System.out.println("Marca: "+ automovel.getMarca());
		System.out.println("Modelo:"+ automovel.getModelo());
		System.out.println("Ano: " + automovel.getAno());
						
		
		Moto moto = new Moto ("Ford", "2021", 432, "REW" , 20);
		System.out.println("Moto:");
		System.out.println("cilindrada: " +moto.getCilindrada());
		System.out.println("Marca: "+ moto.getMarca());
		System.out.println("Modelo:"+ moto.getModelo());
		System.out.println("Ano: " + moto.getAno());
		

	}

}
