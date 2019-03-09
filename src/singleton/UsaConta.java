package singleton;

public class UsaConta {

    public static void main(String[] args) {
        new UsaConta().criarContas();
    }

    private void criarContas() {

        ContaCorrente.getInstance().setmNumeroconta("12304-1");
        System.out.println(ContaCorrente.getInstance().getmNumeroconta()+" HashCode: "+
                ContaCorrente.getInstance().hashCode());

        ContaCorrente.getInstance().setmNumeroconta("12210-0");
        System.out.println(ContaCorrente.getInstance().getmNumeroconta()+" HashCode: "+
                ContaCorrente.getInstance().hashCode());

    }

}
