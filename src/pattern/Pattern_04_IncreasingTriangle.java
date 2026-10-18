package pattern;

public class Pattern_04_IncreasingTriangle {
    void increasingTriangle(int pattenHeight) {
        for (int i = 1; i <= pattenHeight; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
