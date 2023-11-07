package src;

public interface ClothingFactory {
//generate Clothing factory methods to retrieve shirt/pants/shoes generic without a specific type
    Shirts generateShirts();

    Pants generatePants();

    Shoes generateShoes();
}
