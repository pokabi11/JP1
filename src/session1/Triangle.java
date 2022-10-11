package session1;

public class Triangle {
    int var1;
    int var2;
    int var3;

    public int getVar1() {
        return var1;
    }

    public void setVar1(int var1) {
        this.var1 = var1;
    }

    public int getVar2() {
        return var2;
    }

    public void setVar2(int var2) {
        this.var2 = var2;
    }

    public int getVar3() {
        return var3;
    }

    public void setVar3(int var3) {
        this.var3 = var3;
    }

    public int chuvi(){
        return var1+var2+var3;
    }
    public void outputchuvi(){
        System.out.println("Chu vi tam giác là:"+chuvi());
    }

    public double dientich(){
        double p = (double)chuvi()/2;
        return Math.sqrt(p*(p-var1)*(p-var2)*(p-var3));
    }
    public void outputdientich(){
        System.out.println("Diện tích tam giác là:"+dientich());
    }
}
