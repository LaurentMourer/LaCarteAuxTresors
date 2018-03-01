package domain;

public enum Item {
    TREASURE("T"),
    MOUNTAIN("M"),
    ADVENTURER("A");

    private final String item;

    Item(String item) {
        this.item = item;
    }
}
