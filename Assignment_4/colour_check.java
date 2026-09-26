import java.util.Scanner;

class InvalidCharacterException extends Exception {
    public InvalidCharacterException(String message) {
        super(message);
    }
}
class Colour {
    public String character;

    public Colour(String character) throws InvalidCharacterException {
        if (!character.equalsIgnoreCase("V") &&
            !character.equalsIgnoreCase("I") &&
            !character.equalsIgnoreCase("B") &&
            !character.equalsIgnoreCase("G") &&
            !character.equalsIgnoreCase("Y") &&
            !character.equalsIgnoreCase("O") &&
            !character.equalsIgnoreCase("R")) {

            throw new InvalidCharacterException("Character not in Rainbow");
        }

        this.character = character;
    }
    public void displayColour() {
        if (character.equalsIgnoreCase("V"))
            System.out.println("Violet");
        else if (character.equalsIgnoreCase("I"))
            System.out.println("Indigo");
        else if (character.equalsIgnoreCase("B"))
            System.out.println("Blue");
        else if (character.equalsIgnoreCase("G"))
            System.out.println("Green");
        else if (character.equalsIgnoreCase("Y"))
            System.out.println("Yellow");
        else if (character.equalsIgnoreCase("O"))
            System.out.println("Orange");
        else if (character.equalsIgnoreCase("R"))
            System.out.println("Red");
    }
}
class myMain6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a character to check - ");
            String character = sc.nextLine();
            Colour colour = new Colour(character);
            colour.displayColour();
        }
        catch (InvalidCharacterException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (Exception e){
            System.err.println("Exception e.");
        }
    }
}