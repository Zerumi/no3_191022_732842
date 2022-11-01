public enum Time implements INameable {
    EVENING("Вечером"),
    RIGHT_NOW("Только теперь");

    private String time;
    Time(String time)
    {
        this.time = time;
    }

    @Override
    public String getName() {
        return this.time;
    }

    @Override
    public void setName(String name) {

    }
}
