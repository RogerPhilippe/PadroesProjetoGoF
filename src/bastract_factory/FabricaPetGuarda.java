package bastract_factory;

public class FabricaPetGuarda implements Modelo {

    @Override
    public Cachorro getCachorro() { return new Pastor(); }

    @Override
    public Gato getGato() { return new RagDoll(); }
}
