class Staff {
    String code, name;
    public void showData() {
    System.out.println("This is a Staff Class");
    }
    }
    class Teacher extends Staff {
    private String subject, publication;
    public Teacher(String code, String name, String subject, String
    publication) {
    this.code = code;
    this.name = name;
    this.subject = subject;
    this.publication = publication;
    }
    @Override
    public void showData() {
    super.showData();
    System.out.println("Code: " + code);
    System.out.println("Name: " + name);
    System.out.println("Subject: " + subject);
    System.out.println("Publication: " + publication);
    }
    }
    class Officer extends Staff {
    private String grade;
    public Officer(String code, String name, String grade) {
    this.code = code;
    this.name = name;
    this.grade = grade;
    }
    @Override
    public void showData() {
    super.showData();
    System.out.println("Code: " + code);
    System.out.println("Name: " + name);
    System.out.println("Grade: " + grade);
    }
    }
    class Typist extends Staff {
    private int speed;
    public Typist(String code, String name, int speed) {
    this.code = code;
    this.name = name;
    this.speed = speed;
    }
    @Override
    public void showData() {
    super.showData();
    System.out.println("Code: " + code);
    System.out.println("Name: " + name);
    System.out.println("Speed: " + speed);
    }
    }
    class RegularTypist extends Typist {
    private int remuneration;
    public RegularTypist(String code, String name, int speed, int
    remuneration) {
    super(code, name, speed);
    this.remuneration = remuneration;
    }
    //@Override
    public void showData() {
    super.showData();
    System.out.println("Remuneration: " + remuneration);
    }
    }
    class CasualTypist extends Typist {
    private int dailyWages;
    public CasualTypist(String code, String name, int speed, int
    dailyWages) {
    super(code, name, speed);
    this.dailyWages = dailyWages;
    }
    @Override
    public void showData() {
    super.showData();
    System.out.println("Daily Wages: " + dailyWages);
    }
    }
    public class lab5_q7 {
    public static void main(String[] args) {
    Staff s = new Staff();
    s.showData();
    Teacher t = new Teacher("T001", "Archit", "DBMS", "Paperback");
    t.showData();
    Officer o = new Officer("O001", "Ritesh", "Grade e");
    o.showData();
    Typist ty = new Typist("TY001", "Rakesh", 60);
    ty.showData();
    RegularTypist rt = new RegularTypist("RT001", "Adarsh", 70, 5000);
    rt.showData();
    CasualTypist ct = new CasualTypist("CT001", "Rahemat", 50, 1000);
    ct.showData();
    }
    }