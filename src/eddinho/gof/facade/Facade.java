package eddinho.gof.facade;

import subsystem1.CrmService;
import subsystem2.CepApi;

public class Facade {
    public void migrateClient(String nome, String cep){
        String cidade = CepApi.getInstance().getCidade(cep);
        String estado = CepApi.getInstance().getEstado(cep);

        CrmService.writeClient(nome, cep, cidade, estado);
    }
}
