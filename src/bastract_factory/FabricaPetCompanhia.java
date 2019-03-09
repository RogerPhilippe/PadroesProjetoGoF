package bastract_factory;

public class FabricaPetCompanhia implements Modelo {

    @Override
    public Cachorro getCachorro() { return new Shitzu(); }

    @Override
    public Gato getGato() { return new Persa(); }

}
