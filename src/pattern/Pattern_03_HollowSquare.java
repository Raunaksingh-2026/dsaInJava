package pattern;

public class Pattern_03_HollowSquare {
    void hollowSquare(int patternHeight) {
        System.out.println("\n**** Hollow Square ****");
        for (int i = 1; i <= patternHeight; i++) {
            for (int j = 1; j <= patternHeight; j++) {
                if (i == 1 || i == patternHeight ||
                        j == 1 || j == patternHeight) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
