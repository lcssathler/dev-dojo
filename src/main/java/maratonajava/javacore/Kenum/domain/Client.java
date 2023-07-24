    package maratonajava.javacore.Kenum.domain;

public class Client {

    private String name;
    private ClientType clientType;
    private TypePayment typePayment;

    public Client(String name, ClientType clientType, TypePayment typePayment) {
        this.name = name;
        this.clientType = clientType;
        this.typePayment = typePayment;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", clientType=" + clientType.getClientType() +
                ", typePayment=" + typePayment +
                '}';
    }
}
