package assignment;

public class Fraction {
    int tuSo,mauSo;


    public Fraction(){}
    public Fraction(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }


    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public void inPhanSo(){
        System.out.println(getTuSo()+"/"+getMauSo());
    }

    public void rutGonPhanSo(){
        int ucln = 1;
        for(int i=getMauSo();i>1;i--){
            if(tuSo%i==0 && mauSo%i==0){
                ucln = 1;
                break;
            }
        }
        setTuSo(tuSo/ucln);
        setMauSo(mauSo/ucln);
    }

    public void nghichDao(){
        int tmp = getTuSo();
        if(tmp != 0){
            setTuSo(mauSo);
            setMauSo(tmp);
        }
    }

    public Fraction add(Fraction f){
        Fraction t = new Fraction();
        t.setMauSo(this.getMauSo()*f.getMauSo());
        t.setTuSo(this.getTuSo()*f.getMauSo() + this.getMauSo()*f.getTuSo());
        t.rutGonPhanSo();
        return t;
    }
    public Fraction sub(Fraction f){
        Fraction t = new Fraction();
        t.setMauSo(this.getMauSo()*f.getMauSo());
        t.setTuSo(this.getTuSo()*f.getMauSo() - this.getMauSo()*f.getTuSo());
        t.rutGonPhanSo();
        return t;
    }
    public Fraction mul(Fraction f){

        return new Fraction(this.getTuSo()*f.getTuSo(),this.getMauSo()*f.getMauSo());
    }

    public Fraction div(Fraction f){
        f.nghichDao();
        return this.mul(f);
    }

}
