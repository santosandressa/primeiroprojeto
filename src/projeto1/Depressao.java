package projeto1;

public class Depressao extends Pessoa{
	
	private int ideaisSuicidas;
	private int tristezaConstante;
	
	
	public Depressao(String nome, int idade, String telefone, int suadoenca, int ideaisSuicidas,
			int tristezaConstante) {
		super(nome, idade, telefone, suadoenca);
		this.ideaisSuicidas = ideaisSuicidas;
		this.tristezaConstante = tristezaConstante;
	}
	
	public int getIdeaisSuicidas() {
		return ideaisSuicidas;
	}


	public void setIdeaisSuicidas(int ideaisSuicidas) {
		this.ideaisSuicidas = ideaisSuicidas;
	}


	public int getTristezaConstante() {
		return tristezaConstante;
	}


	public void setTristezaConstante(int tristezaConstante) {
		this.tristezaConstante = tristezaConstante;
	}
	
	public void riscoVida() {

		if (this.getIdeaisSuicidas() == 1 && this.getTristezaConstante() == 1) {
			System.out.println(
					"\nSe voc� teve pensamentos su�cidas procure algu�m imediatamente, como um m�dico, um amigo, algu�m que voc� confie. ");
			System.out.println("\nProcure por ajuda - Centro de Valoriza��o da Vida ");
			System.out.println("Dispon�vel 24 horas por telefone e no seguinte hor�rio por chat: ");
			System.out.println("Dom - 17h � 01h");
			System.out.println("Seg a Qui - 09h � 01h");
			System.out.println("Sex - 15h �s 23h");
			System.out.println("S�b - 16h � 01h");
		}

		if (this.getIdeaisSuicidas() == 1 && this.getTristezaConstante() == 2) {
			System.out.println(
					"\nSe voc� teve pensamentos su�cidas procure algu�m imediatamente, como um m�dico, um amigo, algu�m que voc� confie. ");
			System.out.println("\nCentro de Valoriza��o da Vida ");
			System.out.println("Dispon�vel 24 horas por telefone e no seguinte hor�rio por chat: ");
			System.out.println("Dom - 17h � 01h");
			System.out.println("Seg a Qui - 09h � 01h");
			System.out.println("Sex - 15h �s 23h");
			System.out.println("S�b - 16h � 01h");
		}

		if (this.getIdeaisSuicidas() == 1 && this.getTristezaConstante() == 3) {
			System.out.println(
					"\nSe voc� teve pensamentos su�cidas procure algu�m imediatamente, como um m�dico, um amigo, algu�m que voc� confie. ");
			System.out.println("\nCentro de Valoriza��o da Vida ");
			System.out.println("Dispon�vel 24 horas por telefone e no seguinte hor�rio por chat: ");
			System.out.println("Dom - 17h � 01h");
			System.out.println("Seg a Qui - 09h � 01h");
			System.out.println("Sex - 15h �s 23h");
			System.out.println("S�b - 16h � 01h");
		}

		if (this.getIdeaisSuicidas() == 2 && this.getTristezaConstante() == 1) {
			System.out.println(
					"\nVoc� pode ter algum n�vel de depres�o, converse com algu�m de sua confian�a, e \nProcure por ajuda m�dica para um diagn�stico mais preciso.");
		}

		if (this.getIdeaisSuicidas() == 2 && this.getTristezaConstante() == 2) {
			System.out.println(
					"\nVoc� pode estar como uma tristeza passageira, \nRespire fundo que tudo isso vai passar. "
							+ "\nCaso os sintomas permanecem, procure por ajuda m�dica para um diagn�stico mais preciso.");
		}
		if (this.getIdeaisSuicidas() == 2 && this.getTristezaConstante() == 3) {
			System.out.println(
					"\nVoc� pode ter uma forma leve de depress�o. Procure por ajuda m�dica para um diagn�stico mais preciso.");
		}

		if (this.getIdeaisSuicidas() == 3 && this.getTristezaConstante() == 1) {
			System.out.println(
					"\nSe voc� teve pensamentos su�cidas procure algu�m imediatamente, como um m�dico, um amigo, algu�m que voc� confie. ");
			System.out.println("\nCentro de Valoriza��o da Vida ");
			System.out.println("Dispon�vel 24 horas por telefone e no seguinte hor�rio por chat: ");
			System.out.println("Dom - 17h � 01h");
			System.out.println("Seg a Qui - 09h � 01h");
			System.out.println("Sex - 15h �s 23h");
			System.out.println("S�b - 16h � 01h");
		}

		if (this.getIdeaisSuicidas() == 3 && this.getTristezaConstante() == 2) {
			System.out.println(
					"\nSe voc� teve pensamentos su�cidas recentemente procure algu�m, como um m�dico, um amigo, algu�m que voc� confie. ");
			System.out.println("\nCentro de Valoriza��o da Vida ");
			System.out.println("Dispon�vel 24 horas por telefone e no seguinte hor�rio por chat: ");
			System.out.println("Dom - 17h � 01h");
			System.out.println("Seg a Qui - 09h � 01h");
			System.out.println("Sex - 15h �s 23h");
			System.out.println("S�b - 16h � 01h");
		}

		if (this.getIdeaisSuicidas() == 3 && this.getTristezaConstante() == 3) {
			System.out.println(
					"\nSe voc� teve pensamentos su�cidas procure algu�m imediatamente, como um m�dico, um amigo, algu�m que voc� confie. ");
			System.out.println("\nCentro de Valoriza��o da Vida ");
			System.out.println("Dispon�vel 24 horas por telefone e no seguinte hor�rio por chat: ");
			System.out.println("Dom - 17h � 01h");
			System.out.println("Seg a Qui - 09h � 01h");
			System.out.println("Sex - 15h �s 23h");
			System.out.println("S�b - 16h � 01h");
		}

	}
	
}