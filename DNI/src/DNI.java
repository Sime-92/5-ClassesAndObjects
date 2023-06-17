public class DNI {
    private int number;
    private char letter;

    public DNI() {
        this.number = 0;
        this.letter = '\u0000';
    }

    public DNI(int number, char letter) {
        this.number = number;
        this.letter = letter;
    }

    public DNI(int number) {
        this.number = number;
        this.letter = '\u0000';
    }

    public DNI(String dniString) {
        this.number = Integer.parseInt(dniString.substring(0, dniString.length() - 1));
        this.letter = dniString.charAt(dniString.length() - 1);
    }

    public int getNumber() {
        return number;
    }

    public char getLetter() {
        return letter;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public void setNumberNegative() {
        this.number = -Math.abs(number);
    }

    public boolean correctDNI() {
        return number >= 0 && number <= 99999999 && Character.isLetter(letter);
    }

    public static char letterForDNI(int number) {
        char[] letters = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int index = number % 23;
        return letters[index];
    }

    public static String NifForDNI(int number) {
        char letter = letterForDNI(number);
        return number + "" + letter;
    }

    public String toString() {
        return number + "" + letter;
    }

    public String toFormattedString() {
        String formattedNumber = String.format("%08d", number);
        return formattedNumber.substring(0, 2) + "." + formattedNumber.substring(2, 5) + "." +
                formattedNumber.substring(5, 8) + "-" + letter;
    }
}


