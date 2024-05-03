public class q5 {
    public static void main(String args[]) {
        String s = "IRRESPONSIBLE";
        
        // Iterate through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            boolean isRepeated = false;
            
            // Check if the current character is repeated elsewhere in the string
            for (int j = 0; j < s.length(); j++) {
                if (i != j && currentChar == s.charAt(j)) {
                    isRepeated = true;
                    break;
                }
            }
            
            // If the character is not repeated, print and break the loop
            if (!isRepeated) {
                System.out.println(currentChar);
                break;
            }
        }
    }
}
