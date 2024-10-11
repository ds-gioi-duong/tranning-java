package conditional;

public class MayAnhDepTrai {
    public static void main(String[] args) {
        // if else
        int number = 10;

        if (number > 0) {
            System.out.println("Positive");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Negative");
        }
        //switch case
        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Other day");
        }
            //.... tuowng tuwj de qua nen skip a

    }
}
