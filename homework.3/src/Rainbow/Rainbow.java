package Rainbow;

public class Rainbow {
    private static final String RED = "красный";   //num 1
    private static final String ORANGE = "оранжевый";   //num 2
    private static final String YELLOW = "желтый";   //num 3
    private static final String GREEN = "зелёный";   //num 4
    private static final String PALE_BLUE = "голубой";   //num 5
    private static final String BLUE = "синий";   //num 6
    private static final String VIOLET = "фиолетовый";   //num 7
    private static final String Red = "красно-";
    private static final String Orange = "оранжево-";
    private static final String Yellow = "желто-";
    private static final String Green = "зелёно-";
    private static final String Pale_blue = "голубо-";
    private static final String Blue = "сине-";
    private static final String Violet = "фиолетово-";

    public static void getColor(int num){
        switch (num){
            case 1:
                System.out.println(RED);
                break;
            case 2:
                System.out.println(ORANGE);
                break;
            case 3:
                System.out.println(YELLOW);
                break;
            case 4:
                System.out.println(GREEN);
                break;
            case 5:
                System.out.println(PALE_BLUE);
                break;
            case 6:
                System.out.println(BLUE);
                break;
            case 7:
                System.out.println(VIOLET);
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                getRED(num);
                break;
            case 21:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
                getORANGE(num);
                break;
            case 31:
            case 32:
            case 34:
            case 35:
            case 36:
            case 37:
                getYELLOW(num);
                break;
            case 41:
            case 42:
            case 43:
            case 45:
            case 46:
            case 47:
                getGREEN(num);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 56:
            case 57:
                getPALE_BLUE(num);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 67:
                getBLUE(num);
                break;
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
                getVIOLET(num);
                break;
            default:
                System.out.println("wrong color");
        }
    }

    public static void getRED(int num){
        switch (num){
            case 12:
                System.out.println(Red + ORANGE);
                break;
            case 13:
                System.out.println(Red + YELLOW);
                break;
            case 14:
                System.out.println(Red + GREEN);
                break;
            case 15:
                System.out.println(Red + PALE_BLUE);
                break;
            case 16:
                System.out.println(Red + BLUE);
                break;
            case 17:
                System.out.println(Red + VIOLET);
                break;
        }
    }

    public static void getORANGE(int num){
        switch (num){
            case 21:
                System.out.println(Orange + RED);
                break;
            case 23:
                System.out.println(Orange + YELLOW);
                break;
            case 24:
                System.out.println(Orange + GREEN);
                break;
            case 25:
                System.out.println(Orange + PALE_BLUE);
                break;
            case 26:
                System.out.println(Orange + BLUE);
                break;
            case 27:
                System.out.println(Orange + VIOLET);
                break;
        }
    }

    public static void getYELLOW(int num){
        switch (num){
            case 31 :
                System.out.println(Yellow + RED);
                break;
            case 32 :
                System.out.println(Yellow + ORANGE);
                break;
            case 34 :
                System.out.println(Yellow + GREEN);
                break;
            case 35 :
                System.out.println(Yellow + PALE_BLUE);
                break;
            case 36 :
                System.out.println(Yellow + BLUE);
                break;
            case 37 :
                System.out.println(Yellow + VIOLET);
                break;
        }
    }

    public static void getGREEN(int num){
        switch (num){
            case 41 :
                System.out.println(Green + RED);
                break;
            case 42 :
                System.out.println(Green + ORANGE);
                break;
            case 43 :
                System.out.println(Green + YELLOW);
                break;
            case 45 :
                System.out.println(Green + PALE_BLUE);
                break;
            case 46 :
                System.out.println(Green + BLUE);
                break;
            case 47 :
                System.out.println(Green + VIOLET);
                break;
        }
    }

    public static void getPALE_BLUE(int num){
        switch (num){
            case 51 :
                System.out.println(Pale_blue + RED);
                break;
            case 52 :
                System.out.println(Pale_blue + ORANGE);
                break;
            case 53 :
                System.out.println(Pale_blue + YELLOW);
                break;
            case 54 :
                System.out.println(Pale_blue + GREEN);
                break;
            case 56 :
                System.out.println(Pale_blue + BLUE);
                break;
            case 57 :
                System.out.println(Pale_blue + VIOLET);
                break;
        }
    }

    public static void getBLUE(int num){
        switch (num){
            case 61 :
                System.out.println(Blue + RED);
                break;
            case 62 :
                System.out.println(Blue + ORANGE);
                break;
            case 63 :
                System.out.println(Blue + YELLOW);
                break;
            case 64 :
                System.out.println(Blue + GREEN);
                break;
            case 65 :
                System.out.println(Blue + PALE_BLUE);
                break;
            case 67 :
                System.out.println(Blue + VIOLET);
                break;
        }
    }

    public static void getVIOLET(int num){
        switch (num){
            case 71 :
                System.out.println(Violet + RED);
                break;
            case 72 :
                System.out.println(Violet + ORANGE);
                break;
            case 73 :
                System.out.println(Violet + YELLOW);
                break;
            case 74 :
                System.out.println(Violet + GREEN);
                break;
            case 75 :
                System.out.println(Violet + PALE_BLUE);
                break;
            case 76 :
                System.out.println(Violet + BLUE);
                break;
        }
    }
}
