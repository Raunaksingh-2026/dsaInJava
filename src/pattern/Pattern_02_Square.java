package pattern;

public class Pattern_02_Square {
    void square(int patternHeight) {
        System.out.println("\n**** Square Pattern ****");
        for (int i = 0; i < patternHeight; i++) {
            for (int j = 0; j < patternHeight; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
