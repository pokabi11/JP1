package session1;

public class Fraction {
    int tuso, mauso;

    public int getTuso() {
        return tuso;
    }

    public void setTuso(int tuso) {
        this.tuso = tuso;
    }

    public int getMauso() {
        return mauso;
    }

    public void setMauso(int mauso) {
        this.mauso = mauso;
    }

    public void inPhanSo(){
        System.out.println("Phân số"+tuso+mauso);
    }
    public int timUSCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }
    public void rutGonPhanSo() {
        int i = timUSCLN(this.getTuso(), this.getMauso());
        this.setTuso(this.getTuso() / i);
        this.setMauso(this.getMauso() / i);
    }

    public void nghichDaoPhanSo(){
        int tuSoMoi=this.mauso;
        int mauSoMoi=this.tuso;
    }

}
