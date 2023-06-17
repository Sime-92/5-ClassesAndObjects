import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

class PrimitivaTicket {
    private PrimitivaBlock[] blocks;

    public PrimitivaTicket(int numBlocks) {
        blocks = new PrimitivaBlock[numBlocks];
        for (int i = 0; i < numBlocks; i++) {
            blocks[i] = new PrimitivaBlock(6);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (PrimitivaBlock block : blocks) {
            sb.append(block.toString()).append("\n");
        }
        return sb.toString().trim();
    }

    public void printUsedNumbers() {
        Set<Integer> usedNumbers = new HashSet<>();
        for (PrimitivaBlock block : blocks) {
            int[] numbers = block.getNumbers();
            for (int number : numbers) {
                usedNumbers.add(number);
            }
        }
        System.out.println(usedNumbers.toString().replaceAll("[\\[\\]]", ""));
    }
}
