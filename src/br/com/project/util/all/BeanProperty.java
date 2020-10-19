package br.com.project.util.all;

import java.io.Serializable;

/**
 * Usada para estabelecer o ambiente que o projeto est� sendo executado(Produ��o ou teste)
 * @author alex
 *
 */
public class BeanProperty implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String springTest = "";

	public BeanProperty(String springTest) {
		System.setProperty("springTest", springTest);
		this.springTest = springTest;
	}

	public String getSpringTest() {
		return springTest;
	}

}
