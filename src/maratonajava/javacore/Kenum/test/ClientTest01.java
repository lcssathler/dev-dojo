package maratonajava.javacore.Kenum.test;

import maratonajava.javacore.Kenum.domain.Client;
import maratonajava.javacore.Kenum.domain.ClientType;
import maratonajava.javacore.Kenum.domain.TypePayment;

public class ClientTest01 {
    public static void main(String[] args) {
        Client client1 = new Client("Luis", ClientType.FISICAL_PERSON, TypePayment.DEBIT);
        Client client2 = new Client("Luis", ClientType.LEGAL_PERSON, TypePayment.CREDIT);

        System.out.println(client1);
        System.out.println(client2);
        System.out.println(TypePayment.CREDIT.calculateDiscount(10));
        ClientType clientType = ClientType.valueOf("FISICAL_PERSON");
        System.out.println("Code: " + clientType.getClientCode());
        System.out.println("Client Type: " + clientType.getClientType());
        ClientType clientType2 = ClientType.clientReport("Legal Person");
        System.out.println(clientType2);
    }
}
