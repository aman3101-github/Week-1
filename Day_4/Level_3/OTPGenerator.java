public class OTPGenerator {

    // Method to generate a 6-digit OTP number using Math.random()
    public static int generateOTP() {
        // Generate a random number between 100000 and 999999 (inclusive)
        return (int) (Math.random() * 900000) + 100000;
    }

    // Method to ensure that the OTP numbers generated are unique
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
					// If any OTP is repeated, return false
                    return false; 
                }
            }
        }
		// All OTPs are unique
        return true; 
    }

    public static void main(String[] args) {
        // Array to store the generated OTP numbers
        int[] otps = new int[10];

        // Generate OTP numbers and store them in the array
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
            System.out.println("Generated OTP " + (i + 1) + ": " + otps[i]);
        }

        // Check if the generated OTPs are unique
        if (areOTPsUnique(otps)) {
            System.out.println("\nAll OTPs are unique.");
        } else {
            System.out.println("\nSome OTPs are duplicates.");
        }
    }
}
