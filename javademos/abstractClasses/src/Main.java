public class Main {
    public static void main(String[] args) {

    WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
    womanGameCalculator.hesapla();
    womanGameCalculator.gameOver();

    GameCalculator gameCalculator = new GameCalculator() {
        @Override
        public void hesapla() {

        }
    };
//Abstrack sınıflar asla newlenemez!! Newlenebilmesi için bizim onu fonksiyonunu(operasyonunu) aynen yukarıdaki gibi ezmemiz gerekmekte.
//Ama kullanımı önerilmez.

        GameCalculator gameCalculator1 = new WomanGameCalculator(); //bu yapılabilir.

    }
}