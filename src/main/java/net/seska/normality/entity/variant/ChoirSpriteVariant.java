package net.seska.normality.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum ChoirSpriteVariant {
    ROSE(0),
    ULTRAMARINE(1),
    CHARTREUSE(2),
    SPRING_GREEN(3),
    VIOLET(4),
    CAPRI(5),
    PRIMROSE(6);

    private static final ChoirSpriteVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(ChoirSpriteVariant::getId)).toArray(ChoirSpriteVariant[]::new);
    private final int id;
    ChoirSpriteVariant(int id) {this.id = id; }
    public int getId() {return this.id;}
    public static ChoirSpriteVariant byId(int id) {return BY_ID[id % BY_ID.length];}
}
