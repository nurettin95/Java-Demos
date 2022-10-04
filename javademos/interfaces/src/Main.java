public class Main {
    public static void main(String[] args) {
      //ICustomerDal customerDal = new OracleCustomerDal();
      //interfaceler newlenemez. İnterfaceler onu implemente eden classın referansını tutabilir.
        //bir class birden fazla interfacesi implement edebilir.

        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        //customerManager.customerDal = new OracleCustomerDal(); //veritabanı olarak oracle seçtik.
        customerManager.add();

    }
}