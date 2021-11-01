class Day {
    public static String ToText(final int x) {
        String name;
        switch (x) {
            case 1:
                name = "poniedzialek";
                return name;
            case 2:
                name = "wtorek";
                return name;
            case 3:
                name = "sroda";
                return name;
            case 4:
                name = "czwartek";
                return name;
            case 5:
                name = "piatek";
                return name;
            case 6:
                name = "sobota";
                return name;
            case 7:
                name = "niedziela";
                return name;
        }
        return null;
    }
}
