public class Main {
    public static void main(String[] args) {

        String mesaj = "    Bugün hava çok güzel.   ";
        System.out.println(mesaj);
        /*
        System.out.println("Eleman sayısı : " + mesaj.length());
        System.out.println("5. eleman : " + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!")); // birleştir
        System.out.println(mesaj);
        System.out.println(mesaj.startsWith("B")); // B ile başladığı için true döndürdü
        System.out.println(mesaj.endsWith(".")); // . ile mi bitiyor.

        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);

        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf('e'));*/

        String yeniMesaj = mesaj.replace(' ','-'); //boşluklar yerine - koydu.
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2)); //mesajın 2. indexinden parçala
        System.out.println(mesaj.substring(2,4)); // 2 den başla 4 e kadar kes. 4 dahil değil.

        for (String kelime : mesaj.split(" ")) //boşluğa göre ayır
        {
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase()); //bütün harfleri küçük harflere çevirir.
        System.out.println(mesaj.toUpperCase()); //bütün harfleri büyük harflere çevirir.
        System.out.println(mesaj.trim()); //başınaki ve sonundaki boşlukları atar.

    }
}