package net.seska.normality.block;

public enum Wood {
    OAK("_oak"),
    BIRCH("_birch"),
    SPRUCE("_spruce"),
    JUNGLE("_jungle"),
    DARK_OAK("_dark_oak"),
    ACACIA("_acacia"),
    WARPED("_warped"),
    CRIMSON("_crimson"),
    MANGROVE("_mangrove"),
    CHERRY("_cherry"),
    BAMBOO("_bamboo"),
    HOLLY("_holly"),
    CHANTERELLE("_chanterelle"),
    ENOKI("_enoki");


    public final String name;

    Wood(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName();
    }

    public String getName() {
        return name;
    }



}
