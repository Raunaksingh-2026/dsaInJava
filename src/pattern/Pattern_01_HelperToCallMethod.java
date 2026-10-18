package pattern;

public class Pattern_01_HelperToCallMethod {
    void helper(String patternName, int patternHeight) {

        switch (patternName.replace(" ", "").toLowerCase()) {
            case "square":
                new Pattern_02_Square().square(patternHeight);
                break;
            case "hollowrightangledtriangle":
                new Pattern_05_HollowIncreasingTriangle().hollowRightAngledTriangle(patternHeight);
                break;
            case "hollowsquare":
                new Pattern_03_HollowSquare().hollowSquare(patternHeight);
                break;
            case "increasingtriangle":
                new Pattern_04_IncreasingTriangle().increasingTriangle(patternHeight);
                break;

            default:
                System.out.println("Coming Soon...");
        }
    }
}
