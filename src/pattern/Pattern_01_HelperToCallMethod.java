package pattern;

public class Pattern_01_HelperToCallMethod {
    void helper(String patternName, int patternHeight) {

        switch (patternName.toLowerCase()) {
            case "square":
                new Pattern_02_Square().square(patternHeight);
                break;
            default:
                System.out.println("Coming Soon...");
        }
    }
}
