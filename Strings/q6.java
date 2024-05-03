public class q6 {
    public static void main(String[] args) {
        String str = "12345";
        
        if (str.matches("[0-9]+")) {
            System.out.println("String contains only digits.");
        } else {
            System.out.println("String contains non-digit characters.");
        }
    }
}
