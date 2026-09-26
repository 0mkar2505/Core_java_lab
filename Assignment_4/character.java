class VowelException extends Exception {
    public VowelException(String message) {
        super(message);
    }
}

class BlankException extends Exception {
    public BlankException(String message) {
        super(message);
    }
}

class ExitException extends Exception {
    public ExitException(String message) {
        super(message);
    }
}

class myMain8 {
    public static void main(String[] args) {

        try {
            if (args.length < 1) {
                throw new BlankException("Blank Character given");
            }

            String input = args[0];

            if (input.equalsIgnoreCase("X")) {
                throw new ExitException("Exit Character given");
            }

            if (input.equalsIgnoreCase("A") ||
                input.equalsIgnoreCase("E") ||
                input.equalsIgnoreCase("I") ||
                input.equalsIgnoreCase("O") ||
                input.equalsIgnoreCase("U")) {

                throw new VowelException("Vowel Character given");
            }

            System.out.println("Valid Character given");
        }

        catch (BlankException e) {
            System.out.println(e.getMessage());
        }

        catch (VowelException e) {
            System.out.println(e.getMessage());
        }

        catch (ExitException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }
}