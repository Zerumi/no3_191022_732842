package story;

public enum Actions {
    EXIST("существует"),
    MATERIALIZE("материализуется"),
    FLYING("летит"),
    SWIMMING("плывет"),
    STAYING("располагается");

    private final String actionDescribe;
    Actions(String actionDescribe) {
        this.actionDescribe = actionDescribe;
    }

    public String getActionDescribe() {
        return actionDescribe;
    }
}
