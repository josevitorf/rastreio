package br.com.correios.api;


import br.com.correios.api.rastreio.CorreiosRastreioApi;
import br.com.correios.credentials.CorreiosCredenciais;

public class CorreiosApi {

	/**
	 * @return API de rastreio de pacotes pelos seus respectivos codigos de rastreio.
	 */
	public CorreiosRastreioApi rastreios(CorreiosCredenciais credenciais) {
		return new CorreiosRastreioApi(credenciais);
	}

}