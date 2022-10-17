package assignment;

public class Invoice {
    public Integer id;
    public String name;
    public String invoiceDate;
    public String usage;
    public Integer amount;

    public Invoice (Integer id, String name, String invoiceDate,String usage, Integer amount){
        this.id=id;
        this.name = name;
        this.invoiceDate = invoiceDate;
        this.usage = usage;
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

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public void payType1(Integer amount){
        if(amount >=0){

        }
    }
}
