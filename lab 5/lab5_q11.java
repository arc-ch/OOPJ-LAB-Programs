class Num {
    protected int number;
    public Num(int number) {
    this.number = number;
    }
    public void showNum() {
    System.out.println("Number: " + number);
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
    public class lab5_q11 {
    public static void main(String[] args) {
    Num num = new Num(250);
    num.showNum();
    OctNum octNum = new OctNum(250);
    octNum.showNum();
    }
    }