package OOP;

public class HCN {
    private int cd, cr;

    public HCN(int cd, int cr) {
        this.cd = cd;
        this.cr = cr;
    }

    public HCN() {
    }

    public int getCd() {
        return cd;
    }

    public void setCd(int cd) {
        this.cd = cd;
    }

    public int getCr() {
        return cr;
    }

    public void setCr(int cr) {
        this.cr = cr;
    }

    public int getTinhDT() {
        return cd * cr;
    }

    public int getTinhCV() {
        return (cd + cr) * 2;
    }

    @Override
    public String toString() {
        return "HCN{" +
                "cd=" + cd +
                ", cr=" + cr +
                '}';
    }

    public static void main(String[] args) {
        HCN hCN1=new HCN(3,4);
        System.out.println(hCN1);
        System.out.println("diện tích " +hCN1.getTinhDT());
        System.out.println("chu vi " + hCN1.getTinhCV());
    }
}
