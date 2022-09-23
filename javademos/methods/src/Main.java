public class Main {

    public static void main(String[] args) {

       sayiBulmaca();
    }

    public static void sayiBulmaca()
    {
        int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak = 5;
        boolean varMi = false;

        for(int sayi : sayilar){
            if(sayi==aranacak){
                varMi = true;
                break; // döngüyü bitir artık arama
            }
        }
        //String mesaj="";
        if(varMi){
            //mesaj = "Sayı mevcuttur: " + aranacak;
            //mesajVer(mesaj);
            mesajVer("Sayı mevcuttur: " + aranacak);
        }
        else{
            mesajVer("Sayı mevcut değildir: " + aranacak);
        }
    }

    //camel casing (Deve yazımı)
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}