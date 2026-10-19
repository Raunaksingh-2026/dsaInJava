package pattern;

public class Pattern_06_DecreasingTriangle {
    void decreasingTriangle(int pattenHeight) {
        for (int i = 1; i <= pattenHeight; i++) {
            for (int j = 1; j <= pattenHeight-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
