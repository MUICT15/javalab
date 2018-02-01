import java.util.Scanner;

class CardTester{
    public static void main(String[] args){
        System.out.println("Select type of testing");
        System.out.println("1 = normal , 2 = bonus");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        if(input == 1) {
            Card card1 = new Card("5J");
            Card card2 = new Card("6S");
            Card card3 = new Card("3K");

            System.out.println(card1.getDescription());
            System.out.println(card2.getDescription());
            System.out.println(card3.getDescription());
        }else if(input == 2){
            bonus();
        }
    }

    public static void bonus(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input ('q' to end)");
        boolean stop = false;
        while (stop == false){
            String input = scan.nextLine();
            System.out.println(input);
            if(input != "q"){
                Card card = new Card(input);
                System.out.println(card.getDescription());
            }else {
                stop = true;
            }
            return;
        }
    }
}