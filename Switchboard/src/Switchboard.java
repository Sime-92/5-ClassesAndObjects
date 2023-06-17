class Switchboard {
    private Call[] calls;
    private int totalCalls;
    private double totalTurnover;

    public Switchboard() {
        calls = new Call[100]; // Suponiendo un máximo de 100 llamadas
        totalCalls = 0;
        totalTurnover = 0.0;
    }

    public void registerCall(Call call) {
        calls[totalCalls] = call;
        totalCalls++;
        totalTurnover += calculateCost(call);
    }

    public void printAllCalls() {
        System.out.println("Todas las llamadas:");
        for (int i = 0; i < totalCalls; i++) {
            System.out.println("Llamada " + (i + 1) + ":");
            printCallData(calls[i]);
            System.out.println();
        }
    }

    public void printCallData(int callNumber) {
        if (callNumber >= 1 && callNumber <= totalCalls) {
            System.out.println("Llamada " + callNumber + ":");
            printCallData(calls[callNumber - 1]);
        } else {
            System.out.println("Número de llamada inválido.");
        }
    }

    private void printCallData(Call call) {
        System.out.println("Número de origen: " + call.getSourceNumber());
        System.out.println("Número de destino: " + call.getDestinationNumber());
        System.out.println("Duración: " + call.getDuration() + " segundos");
        System.out.println("Banda horaria: " + call.getTimeBand());
        System.out.println("Costo: " + calculateCost(call));
    }

    private double calculateCost(Call call) {
        double costoPorSegundo;
        if (call.getTimeBand() == 1) {
            costoPorSegundo = 0.20;
        } else if (call.getTimeBand() == 2) {
            costoPorSegundo = 0.25;
        } else {
            costoPorSegundo = 0.30;
        }

        if (call.getDestinationNumber().startsWith("0")) {
            return call.getDuration() * costoPorSegundo;
        } else {
            return call.getDuration() * 0.15;
        }
    }

    public int getTotalCalls() {
        return totalCalls;
    }

    public double getTotalTurnover() {
        return totalTurnover;
    }
}
