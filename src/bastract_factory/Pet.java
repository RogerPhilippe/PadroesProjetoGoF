package bastract_factory;

abstract class Pet {

    private String mNome;

    public Pet(String nome) {this.mNome = nome;}

    public String toString() { return mNome; }

}
