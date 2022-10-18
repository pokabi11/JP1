package assignment;

public class InvoiceVN extends Invoice{
    private String doiTuong;

    public InvoiceVN(Integer id, String fullName, String invoiceDate, Integer amount, String doiTuong) {
        super(id, fullName, invoiceDate, amount);
        this.doiTuong=doiTuong;

    }

    public String getDoiTuong() {
        return doiTuong;
    }

    public void setDoiTuong(String doiTuong) {
        this.doiTuong = doiTuong;
    }

    @Override
    public double payType1() {
        if(getAmount()<50)
            return getAmount() * 1000;
        else if(getAmount() < 100)
            return 50*1000+ (getAmount()-50)*1200;
        else if(getAmount() < 200)
            return 50*1000 + 50 * 1200 + (getAmount()-100)*1500;
        else
            return 50*1000 + 50 * 1200 + 100 * 1500 + (getAmount()-200)*2000;
    }
}
