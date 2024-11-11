package subsystem2;

public class CepApi {
    //Singleton
    private static CepApi instance = new CepApi();
    private CepApi(){
        super();
    }
    public static CepApi getInstance(){
        return instance;
    }

    //Methods
    public String getCidade(String cep){
        return "Santos";
    }
    public String getEstado(String cep){
        return "SP";
    }
}
