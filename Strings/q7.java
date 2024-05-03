public class q7 {
    public static void main(String[] args) {
        String str = "Hello World";
        char toRemove = 'o';
        
        String result = str.replaceAll(Character.toString(toRemove), "");
        
        System.out.println("After removing '" + toRemove + "': " + result);
    }
}
