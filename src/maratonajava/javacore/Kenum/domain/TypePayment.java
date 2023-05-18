package maratonajava.javacore.Kenum.domain;

public enum TypePayment {
    DEBIT {
        @Override
        public double calculateDiscount(double value) {
            return value - (value * 0.1);
        }
    },
    CREDIT {
        @Override
        public double calculateDiscount(double value) {
            return value - (value * 0.05);
        }
    };

    public double calculateDiscount(double value) {
        return 0;
    }
}