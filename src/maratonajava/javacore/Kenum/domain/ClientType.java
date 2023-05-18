package maratonajava.javacore.Kenum.domain;

public enum ClientType {
    FISICAL_PERSON(1, "Fisical Person"),
    LEGAL_PERSON(2, "Legal Person");

    public int clientCode;
    public String clientType;
    private ClientType(int clientCode, String clientType) {
        this.clientCode = clientCode;
        this.clientType = clientType;
    }

    public static ClientType clientReport(String clientType) {
        for (ClientType client : values()) {
            if (client.getClientType().equals(clientType)) {
                return client;
            }
        }
        return null;
    }
    public int getClientCode() {
        return clientCode;
    }

    public String getClientType() {
        return clientType;
    }
}
