package src;

public class PartyFactory implements ClothingFactory {

    @Override
    public Shirts generateShirts() {
        return new PartyShirts();
    }

    @Override
    public Pants generatePants() {
        return new PartyPants();
    }

    @Override
    public Shoes generateShoes() {
        return new PartyShoes();
    }
}
