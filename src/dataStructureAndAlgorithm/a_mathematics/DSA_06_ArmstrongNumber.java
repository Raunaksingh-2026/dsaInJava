package dataStructureAndAlgorithm.a_mathematics;

public class DSA_06_ArmstrongNumber {

    // Method to check whether a number is an Armstrong number
    public boolean isArmstrong(long number) {

        // Store copies of the original number for separate operations
        long number1 = number;
        long number2 = number;

        // Variables to count digits and store their powered sum
        int countDigit = 0;
        long newNumber = 0;

        // Special case: Zero is an Armstrong number
        if(number == 0){
            return true;
        }

        // Count the total number of digits
        while(number1 > 0){

            int lastDigit = (int) number1 % 10;
            countDigit ++;
            number1 = number1 / 10;
        }

        // Calculate the sum of each digit raised to countDigit
        while(number2 > 0){

            int lastDigit = (int) number2 % 10;

            // Initialize the digit power to 1
            long digitPower = 1;

            // Calculate the power using integer multiplication
            for (int i = 0; i < countDigit; i++) {
                digitPower *= lastDigit;
            }

            // Add the powered digit to the total sum
            newNumber = newNumber + digitPower;

            number2 = number2 / 10;
        }
        // Return true if the calculated sum matches the original number
        return newNumber == number;
    }

}
