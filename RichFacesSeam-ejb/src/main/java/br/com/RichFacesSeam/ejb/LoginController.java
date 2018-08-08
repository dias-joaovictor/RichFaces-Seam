package br.com.RichFacesSeam.ejb;

import javax.ejb.Local;

@Local
public interface LoginController {

	boolean isCadastrado(String Email, String Senha);

}
