public class PrimitivaMain {
    public static void main(String[] args) {
        PrimitivaTicket ticket = new PrimitivaTicket(8);
        System.out.println(ticket.toString());

        int[] preselectedNumbers = {5, 10, 15, 20, 25, 30, 35, 40, 45};
        PrimitivaBlock block = new PrimitivaBlock(preselectedNumbers);
        System.out.println(block.toString());
    }
}
