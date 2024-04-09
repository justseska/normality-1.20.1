package net.seska.normality.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum MouseVariant {
    MEADOW(0),
    HOUSE(1),
    SABLE(2),
    ALBINO(3),
    RUMPWHITE(4),
    EVEN_MARKED(5),
    BLACK_TAN(6),
    DUTCH(7);


    private static final MouseVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(MouseVariant::getId)).toArray(MouseVariant[]::new);
    private final int id;
    MouseVariant(int id) {this.id = id; }
    public int getId() {return this.id;}
    public static MouseVariant byId(int id) {return BY_ID[id % BY_ID.length];}
}
