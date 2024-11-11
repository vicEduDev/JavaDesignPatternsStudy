package subsystem1;

public class CrmService {

    private CrmService(){
        super();
    }

    public static void writeClient(String nome, String cep, String cidade, String estado){
        System.out.println("Client succesfully saved on the CRM system!!!");
        System.out.println("name: "+nome);
        System.out.println("cep: "+cep);
        System.out.println("city: "+cidade);
        System.out.println("state: "+estado);
    }
}
