package src;

public class ProfessionalFactory implements ClothingFactory {

    @Override
    public Shirts generateShirts() {
        return new ProfessionalShirts();
    }

    @Override
    public Pants generatePants() {
        return new ProfessionalPants();
    }

    @Override
    public Shoes generateShoes() {
        return new ProfessionalShoes();
    }
}
