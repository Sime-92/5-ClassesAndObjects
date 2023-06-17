import java.util.*;

class PrimitivaBlock {
    private int[] numbers;

    public PrimitivaBlock(int quantity) {
        if (quantity < 6)
            quantity = 6;
        else if (quantity > 49)
            quantity = 49;

        Set<Integer> numberSet = new HashSet<>();
        Random random = new Random();
        while (numberSet.size() < quantity) {
            int number = random.nextInt(49) + 1;
            numberSet.add(number);
        }

        numbers = new int[numberSet.size()];
        int index = 0;
        for (int number : numberSet) {
            numbers[index] = number;
            index++;
        }
    }

    public PrimitivaBlock(int[] numbers) {
        this.numbers = Arrays.copyOf(numbers, numbers.length);
    }

    public String toString() {
        return Arrays.toString(numbers).replaceAll("[\\[\\]]", "");
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, numbers.length);
    }
}

