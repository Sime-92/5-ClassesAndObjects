public class Main {
    public static void main(String[] args) {
        DNI dni1 = new DNI();
        System.out.println("Number: " + dni1.getNumber());
        System.out.println("Letter: " + dni1.getLetter());

        DNI dni2 = new DNI(18888888, 'X');
        System.out.println("Number: " + dni2.getNumber());
        System.out.println("Letter: " + dni2.getLetter());

        dni2.setNumberNegative();
        System.out.println("Number: " + dni2.getNumber());

        DNI dni3 = new DNI(12345678);
        System.out.println("Number: " + dni3.getNumber());
        System.out.println("Letter: " + dni3.getLetter());

        DNI dni4 = new DNI("18888888X");
        System.out.println(dni4.toString()); //
        System.out.println(dni4.toFormattedString());

        System.out.println(dni4.correctDNI());

        char letter = DNI.letterForDNI(18888888);
        System.out.println("Letter for DNI: " + letter);

        String nif = DNI.NifForDNI(18888888);
        System.out.println("NIF for DNI: " + nif);
    }
}
