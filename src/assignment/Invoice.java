package assignment;

public class Invoice {
    private Integer id;
    private String name;
    private String invoiceDate;
    private Integer amount;

    public Invoice (Integer id, String name, String invoiceDate, Integer amount){
        this.id=id;
        this.name = name;
        this.invoiceDate = invoiceDate;
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }


    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public double payType1(){
        return 2000*getAmount();
    }

}
