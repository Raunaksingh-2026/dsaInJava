package pattern;

public class Pattern_01_HelperToCallMethod {
    void helper(String patternName, int patternHeight) {

        switch (patternName.replace(" ", "").toLowerCase()) {
            case "square":
                new Pattern_02_Square().square(patternHeight);
                break;
            case "hollowrightangledtriangle":
                new Pattern_03_HollowRightAngledTriangle().hollowRightAngledTriangle(patternHeight);
                break;
             case "hollowsquare":
                new Pattern_04_HollowSquare().hollowSquare(patternHeight);
                break;

            default:
                System.out.println("Coming Soon...");
        }
    }
}
