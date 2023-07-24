package maratonajava.javacore.ZZHdesignpatterns.factory.domain;

public interface Currency {
    String getSymbol();
}

class RealSign implements Currency {
    @Override
    public String getSymbol() {
        return "R$";
    }
}

class UsaSign implements Currency {
    @Override
    public String getSymbol() {
        return "$";
    }
}
