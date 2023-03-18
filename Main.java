public class Main {
    public static void main(String[] args) {

        // 1
        System.out.print("1. ");
        for (int i = 1; i <= 13; i+=2) {
            System.out.print(i + " ");
        }

        System.out.println("");

        System.out.print("2. ");
        // 2
        for (int i = 24; i > 12; i-=2) {
            System.out.print(i + " ");
        }

        System.out.println("");

        // 3
        System.out.print("3. ");
        int bil1 = 0;
        int bil2 = 1;
        do {
            System.out.print( bil1 + " " + bil2 + " ");
            bil1 += bil2;
            bil2 += bil1;
        } while (bil2 <= 13);

        System.out.println("");

        // 4
        System.out.println("4. ");
        for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <= 4; b++) {
                System.out.print(a + " ");
            }
            System.out.println("");
        }

        System.out.println("");

        // 5
        System.out.println("5. ");
        for (int a = 1; a <= 4; a++) {
            String word = "A";
            for (int b = 1; b <= 4; b++) {
                System.out.print(word + " ");
                if (word == "A") {
                    word = "B";
                } else {
                    word = "A";
                }
            }
            System.out.println("");
        }
        
        // 6
        System.out.println("6. ");
        for (int a = 1; a <= 4; a++) {
            String word = "A";
            for (int b = 4; b >= a; b--) {
                System.out.print(word + " ");
                if (word == "A") {
                    word = "B";
                } else {
                    word = "A";
                }
            }
            System.out.println("");
        }
    }
}