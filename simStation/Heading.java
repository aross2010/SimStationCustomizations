package simStation;

public enum Heading {
    NORTH, EAST, SOUTH, WEST;


    public static Heading parse(String heading) {
        if (heading.equalsIgnoreCase("north")) return NORTH;
        else if (heading.equalsIgnoreCase("east")) return EAST;
        else if (heading.equalsIgnoreCase("south")) return SOUTH;
        else if (heading.equalsIgnoreCase("west")) return WEST;
        else return null;
    }

    public static Heading random() {
        // TODO - return random heading
        return WEST;
    }



}
