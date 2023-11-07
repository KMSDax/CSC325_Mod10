package src;

import java.util.Scanner;

public class Driver {

    private static Application configureApplication() {

        //Crates app and factory object
        Application app;
        //set factory object to null in order for if statement to work intellij recommendation
        ClothingFactory factory = null;
        System.out.println("Pick an option\nProfessional\nCasual\nParty");
        Scanner s = new Scanner(System.in);
        String choice = s.next();

        if (choice.contains("Professional")) {
            factory = new ProfessionalFactory();
        } else if (choice.contains("Casual")) {
            factory = new CasualFactory();
        } else if (choice.contains("Party")) {
            factory = new PartyFactory();
        }
        //assert != null because intellij recommendation
        assert factory != null;
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.revealContent();
    }
}
