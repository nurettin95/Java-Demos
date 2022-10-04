public class CustomerManager {

    private ICustomerDal customerDal;
    public CustomerManager(ICustomerDal customerDal){
        this.customerDal = customerDal;
    }

    public void add()
    {
        // iş kodları yazılır.

        //OracleCustomerDal oracleCustomerDal = new OracleCustomerDal(); yaparsak bağımlı oluruz.
        customerDal.Add();
    }
}
