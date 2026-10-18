package pattern;

public class Pattern_05_HollowIncreasingTriangle {
    void hollowRightAngledTriangle(int patternHeight) {
        System.out.println("\n**** Hollow Right Angled Triangle ****");
        for (int i = 0; i < patternHeight; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j || j == 0 || i == (patternHeight - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
