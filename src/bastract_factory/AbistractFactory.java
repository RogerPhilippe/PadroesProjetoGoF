package bastract_factory;

import java.util.Scanner;

public class AbistractFactory {

    private Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        new AbistractFactory().executar();

    }

    private void executar() {

        System.out.println("Informe 1-Pet-de-Companhia ou 2-Pet-de-Guarda");
        byte opc = teclado.nextByte();
        Modelo modelo = null;

        switch (opc) {
            case 1:
                System.out.println("Pet para companhia.");
                modelo = new FabricaPetCompanhia();
                break;
            case 2:
                System.out.println("Pet para guarda.");
                modelo = new FabricaPetGuarda();
                break;
        }

        System.out.println("Cachorro: "+modelo.getCachorro()+"\nGato: "+modelo.getGato());

    }

}
