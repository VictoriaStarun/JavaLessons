public class firstProg {

    static void calc(double param1, double param2, String operation) {

        switch (operation) {
            case "+":
                System.out.println(param1 + param2);
                break;
            case "-":
                System.out.println(param1 - param2);
                break;
            case "*":
                System.out.println(param1 * param2);
                break;
            case "/":
                System.out.println(param1 / param2);
                break;
            default:
                System.out.println("Something went wrong :(");
                break;
        }
    }

    public static void main (String[] args) {
        calc(1,3,"+");
        calc(0,15,"-");
        calc(5,10,"*");
        calc(12,4,"/");
        calc(1,1, "?");
    }
}