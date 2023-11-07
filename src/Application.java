package src;

public class Application {
    private Shirts shirts;
    private Pants pants;
    private Shoes shoes;

    //Generates type of clothing for the evening depending on choice of factory

    public Application(ClothingFactory factory) {
        shirts = factory.generateShirts();
        pants = factory.generatePants();
        shoes = factory.generateShoes();
    }

    //displays content based on factory getter
    public void revealContent() {
        shirts.typeOfTop();
        pants.typeOfPants();
        shoes.typeOfShoes();
    }
}
