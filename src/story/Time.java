package story;

public enum Time {
    EVENING("Вечером"),
    ONLY_RIGHT_NOW("Только теперь");

    private final String time;
    Time(String time)
    {
        this.time = time;
    }

    public String getName() {
        return this.time;
    }
}
