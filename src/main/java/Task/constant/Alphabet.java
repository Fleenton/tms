package Task.constant;

public enum Alphabet {
    ENGLISHALPHABET("abcdefghijklmnopqrstuvwxyz");

    Alphabet(String abc) {
        value = abc;
    }

    private String value;

    public String getValue() {
        return value;
    }
}
