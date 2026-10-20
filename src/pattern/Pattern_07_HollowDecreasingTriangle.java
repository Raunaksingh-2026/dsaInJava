package pattern;

public class Pattern_07_HollowDecreasingTriangle {
    void hollowDecreasingTriangle(int patternHeight){
        for (int i = 1; i <= patternHeight; i++) {
            for (int j = 1; j <= patternHeight-i; j++) {
                if (i == 1 | j == 1 || j >= patternHeight-i) {
                    System.out.print("* ");
                }else System.out.print("  ");

            }
            System.out.println();
        }
    }
}
