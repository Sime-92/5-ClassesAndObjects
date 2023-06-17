class Call {
    private String sourceNumber;
    private String destinationNumber;
    private int duration;
    private int timeBand;

    public Call(String sourceNumber, String destinationNumber, int duration, int timeBand) {
        this.sourceNumber = sourceNumber;
        this.destinationNumber = destinationNumber;
        this.duration = duration;
        this.timeBand = timeBand;
    }

    public String getSourceNumber() {
        return sourceNumber;
    }

    public String getDestinationNumber() {
        return destinationNumber;
    }

    public int getDuration() {
        return duration;
    }

    public int getTimeBand() {
        return timeBand;
    }
}
