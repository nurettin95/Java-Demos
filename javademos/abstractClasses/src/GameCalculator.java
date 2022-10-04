public abstract class GameCalculator {

    public abstract void hesapla();
    //kim bu sınıfı imlepente ediyorsa hesaplayı içermek zorunda ama hesaplayı overlading etmek zorunda. yani hesapla fonk. yazmak zorunda.

    public final void gameOver() //final eklenince overloding yapılmasını engelliyoruz. Olduğu gibi kullanılmak zorunda.
    {
        System.out.println("Oyun bitti.");
    }
}
