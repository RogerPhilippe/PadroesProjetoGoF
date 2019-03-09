package singleton;

public class ContaCorrente {

    private ContaCorrente() {}

    private String mNumeroconta;

    private static ContaCorrente instance;

    public static ContaCorrente getInstance() {
        if (instance == null) {
            instance = new ContaCorrente();
        }
        return instance;
    }

    public void setmNumeroconta(String numeroconta) {
        this.mNumeroconta = numeroconta;
    }

    public String getmNumeroconta() {
        return this.mNumeroconta;
    }

}
