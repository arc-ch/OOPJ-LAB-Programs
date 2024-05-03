class Num {
     int number;
    public Num(int number) {
    this.number = number;
    }
    public void showNum() {
    System.out.println("Number: " + number);
    }
    }
    class HexNum extends Num {
    public HexNum(int number) {
    super(number);
    }
    @Override
    public void showNum() {
    System.out.println("Hexadecimal value: " +
    Integer.toHexString(number));
    }
    }
    public class lab5_q10 {
    public static void main(String[] args) {
    Num num = new Num(200);
    num.showNum();
    HexNum hexNum = new HexNum(200);
    hexNum.showNum();
    }
    }