package projeto1;

public class insanidadeMental extends Pessoa {

	private int pensamento;
	private int qualDasCoisas;

	public insanidadeMental(String nome, int idade, String telefone, int suadoenca, int pensamento, int qualDasCoisas) {
		super(nome, idade, telefone, suadoenca);
		this.pensamento = pensamento;
		this.qualDasCoisas = qualDasCoisas;
	}

	public int getPensamento() {
		return pensamento;
	}

	public void setPensamento(int pensamento) {
		this.pensamento = pensamento;
	}

	public int getQualDasCoisas() {
		return qualDasCoisas;
	}

	public void setQualDasCoisas(int qualDasCoisas) {
		this.qualDasCoisas = qualDasCoisas;
	}

	public void diagnostico() {
		if (this.pensamento == 1 && this.qualDasCoisas == 2) {
			System.out.println(
					"Nivel de sanidade normal, a pessoa em quest�o deve ter mais contato com amigos e familia");
		} else if (this.pensamento == 1 && this.qualDasCoisas == 1) {
			System.out.println("A pessoa em quest�o tem um nivel alto de INSANIDADE MENTAL e deve ser verificado");
		} else if (this.pensamento == 1 && this.qualDasCoisas == 3) {
			System.out.println("Pessoa com leve insanidade e tra�os de psiopata, deve ser verificado");
		} else if (this.pensamento == 2 && this.qualDasCoisas == 2) {
			System.out.println("A pessoa em quest�o tem a sanidade perfeitamente normal");
		} else if (this.pensamento == 2 && this.qualDasCoisas == 1) {
			System.out.println("A pessoa em quest�o se considera normal, mas odeia pessoas deve ser verificado");
		} else if (this.pensamento == 2 && this.qualDasCoisas == 3) {
			System.out.println(
					"A pessoa tem alta probabilidade de ser um PSICOPATA, psicopatas se consideram pessoas comuns, por�m s�o altamente manipuladores");
		} else if (this.pensamento == 3 && this.qualDasCoisas == 3) {
			System.out.println("As respostas da pessoa s�o confusas, isso deve ser verificado");
		} else if (this.pensamento == 3 && this.qualDasCoisas == 2) {
			System.out.println(
					"A pessoa em quest�o tem leve insanidade, e pode star perfeitamente normal com pouco tempo de tratamento");
		} else if (this.pensamento == 3 && this.qualDasCoisas == 1) {
			System.out.println(
					"NIVEL AUTISSIMO DE INSANIDADE, A PESSOA DEVE SER ISOLADA DOS DEMAIS E TRATADA IMEDIATAMENTE");
		}

	}

}