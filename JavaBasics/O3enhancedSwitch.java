
public class O3enhancedSwitch {
    public static void main(String[] args) {
        String fruit = "orange";
        switch (fruit) {
            case "mango" -> {
                System.out.println("This mango");
                System.out.println("That mango");
        }
            case "banana" -> System.out.println("Yay banana");
            case "apple","orange" -> System.out.println("This laal laal seb");
            case "tomato" -> System.out.println("Aaha tamatar bade mazedar");
            default -> System.out.println("Unknown fruit");
        }
    }
}
