package pattern;

import java.util.Scanner;

public class Pattern_00_Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Pattern_01_HelperToCallMethod helperToCall = new Pattern_01_HelperToCallMethod();

        System.out.println("<-- Welcome To The Pattern World -->");

        System.out.print("Enter The Pattern Name Which You Wants : ");
        String patternName = scanner.nextLine();

        System.out.print("Enter The Pattern Height You Wants     : ");
        int patternHeight = scanner.nextInt();

        helperToCall.helper(patternName, patternHeight);
    }
}
