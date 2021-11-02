class Month {

    public static String ToText(final int  x) {
        String name;
        switch (x) {
            case 1:
                name = "stycznia";
                return name;
            case 2:
                name = "lutego";
                return name;
            case 3:
                name = "marca";
                return name;
            case 4:
                name = "kwietnia";
                return name;
            case 5:
                name = "maja";
                return name;
            case 6:
                name = "czerwca";
                return name;
            case 7:
                name = "lipca";
                return name;
            case 8:
                name = "sierpnia";
                return name;
            case 9:
                name = "wrzesnia";
                return name;
            case 10:
                name = "pazdziernika";
                return name;
            case 11:
                name = "listopada";
                return name;
            case 12:
                name = "grudnia";
                return name;
        }
        return name = " ";
    }
}
