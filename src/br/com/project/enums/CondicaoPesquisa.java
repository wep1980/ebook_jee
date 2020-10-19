package br.com.project.enums;

/**
 * Lista para montar o combo de condi��o de pesquisa
 * @author alex
 *
 */
public enum CondicaoPesquisa{

	CONTEM("Cont�m"), INICIA_COM("Inicia com"), TERMINA_COM("Termina com"), IGUAL_A(
			"Igual");

	private String condicao;

	private CondicaoPesquisa(String condicao) {

		this.condicao = condicao;
	}

	@Override
	public String toString() {
		return this.condicao;
	}

	public void setCondicao(String condicao) {
		this.condicao = condicao;
	}

	public String getCondicao() {
		return condicao;
	}
}
