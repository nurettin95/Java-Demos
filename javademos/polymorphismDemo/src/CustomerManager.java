public class CustomerManager {
    private BaseLogger logger;

    public CustomerManager(BaseLogger logger){
        this.logger = logger;
    }
    public void add(){
        System.out.println("Müşteri eklendi");
         /*DatabaseLogger logger = new DatabaseLogger();
    logger.log("Log mesajı");*/ //bağımlı bir sistem
        this.logger.log("log mesajı");
    }

}
