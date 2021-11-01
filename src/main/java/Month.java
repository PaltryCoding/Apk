class Month {

    public static String ToText(final int  x) {
        String name;
        switch (x) {
            case 1:
                name = "Stycznia";
                return name;
            case 2:
                name = "Lutego";
                return name;
            case 3:
                name = "Marca";
                return name;
            case 4:
                name = "Kwietnia";
                return name;
            case 5:
                name = "Maja";
                return name;
            case 6:
                name = "Czerwca";
                return name;
            case 7:
                name = "Lipca";
                return name;
            case 8:
                name = "Sierpnia";
                return name;
            case 9:
                name = "Wrzesnia";
                return name;
            case 10:
                name = "Pazdziernika";
                return name;
            case 11:
                name = "Listopada";
                return name;
            case 12:
                name = "Grudnia";
                return name;
        }
        return name = " ";
    }
}
