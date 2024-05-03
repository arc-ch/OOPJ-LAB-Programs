class Num {
    protected int number;
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
    class OctNum extends Num {
    public OctNum(int number) {
    super(number);
    }
    @Override
    public void showNum() {
    System.out.println("Octal value: " +
    Integer.toOctalString(number));
    }
    }
    public class lab5_q12 {
    public static void main(String[] args) {
    Num num = new Num(250);
    num.showNum();
    HexNum hexNum = new HexNum(250);
    hexNum.showNum();
    OctNum octNum = new OctNum(250);
    octNum.showNum();
    }
    }