package br.fai.ex06;

public class Main {

	public static void main() {

		Main app = new Main();
		app.start();

	}

	private void start() {

		String[] carros = { "Civic", "Gol", "Palio", "Uno" };

		try {
			for (int i = 0; i < carros.length; i++) {

				String nomeDoCarro = carros[i];
				System.out.println("Nome do carro: " + nomeDoCarro);
				if(i == 2) {
					i = -1;
				}
				
				System.out.println("Este pedaço do codigo não sera executado");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		System.out.println("----------");
		carros[1] = "L200";

		for (String carro : carros) {
			System.out.println("Nome do carro: " + carro);
		}
		System.out.println("-----------");
		
		int tamanhoDoArrey = carros.length;
		String[] novoArrayDeCarros = new String[tamanhoDoArrey];
		
		for (int i = 0; i < carros.length; i++ =) {
			
			String[] carro = carros[i];
			novoArrayDeCarros[i] = carro;
		}
		
		novoArrayDeCarros[tamanhoDoArray - 1] "Gol";
		
		for (String carro : novoArrayDeCarros) {
			System.out.println("Novo array de Carros " + carro);
		}

	}

}
