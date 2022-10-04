public class ProductValidator {
    //ana class static olamaz. ama class içinde başka bir class oluşturunca olur.

    static{
        System.out.println("Static Yapıcı blok çalıştı.");
    }
    public ProductValidator()
    {
        System.out.println("Yapıcı blok çalıştı.");
    }
    public static boolean isValid(Product product){
        if(product.price > 0 && !product.name.isEmpty()){
            return  true;
        }
        else{
            return false;
        }
    }

    public void birsey()
    {

    }

    public static class BaskaBirClass{
        public static void Sil()
        {

        }
    }
}
//inner class