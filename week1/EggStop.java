
public class EggStop {
    public static void main(String[] args) {
        pentagon();
        space();
        pentagon();
        line();
        pentagonStop();
        line();
    }

    public static void space() {
        System.out.println("\n\n\n");
    }
    public static void pentagon() {
        System.out.println("  ________");
        System.out.println(" /        \\");
        System.out.println("/          \\");
        System.out.println("\\          /");
        System.out.println(" \\________/");
    }


    public static void line() {
        System.out.println("+-----------+");
    }

    public static void pentagonStop(){
        System.out.println("  ________");
        System.out.println(" /        \\");
        System.out.println("/          \\");
        System.out.println("|   STOP   |");
        System.out.println("\\          /");
        System.out.println(" \\________/");
    }
}