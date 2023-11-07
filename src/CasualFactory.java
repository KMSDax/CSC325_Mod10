package src;

public class CasualFactory implements ClothingFactory {

    @Override
    public Shirts generateShirts() {
        return new CasualShirts();
    }

    @Override
    public Pants generatePants() {
        return new CasualPants();
    }

    @Override
    public Shoes generateShoes() {
        return new CasualShoes();
    }
}
