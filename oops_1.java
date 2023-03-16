class studet {
    private int roll;
    private String name;

    private boolean isvalid(int roll) {
        if (roll <= 0) {
            return false;
        }
        return true;
    }

    public void takeinput(int roll, String name) {
        if (!isvalid(roll)) {
            System.out.println("invalid date");
            return;
        }
        this.roll = roll;
        this.name = name;
    }

    public void print() {
        System.out.println("id : " + roll);
        System.out.println("name : " + name);
    }
}

public class oops_1 {
    public static void main(String[] args) {
        studet anmol;
        anmol = new studet();
        anmol.takeinput(1001, "anmol");
        anmol.print();
        studet nimish;
        nimish = new studet();
        nimish.takeinput(1001, "nimish");
        nimish.print();

    }

}
