public class Exercise5 {
    public static void main(String[] args) {
        Switchboard switchboard = new Switchboard();

        Call llamada1 = new Call("123456789", "987654321", 60, 2);
        Call llamada2 = new Call("987654321", "123456789", 120, 3);
        Call llamada3 = new Call("555555555", "444444444", 180, 1);

        switchboard.registerCall(llamada1);
        switchboard.registerCall(llamada2);
        switchboard.registerCall(llamada3);

        switchboard.printAllCalls();

        System.out.println("Número total de llamadas: " + switchboard.getTotalCalls());
        System.out.println("Ingresos totales: " + switchboard.getTotalTurnover());
    }
}

