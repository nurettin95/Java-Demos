public class Main {

    public static void main(String[] args) {
        //For
        for(int i=2; i<10; i+=2)
        {
            System.out.println(i);
        }
        System.out.println("for döngüsü bitti");

        int i = 1;
        //While
        while(i<10)
        {
            System.out.println(i);
            i+=2;
        }
        System.out.println("while döngüsü bitti");

        //do-while
        int j = 1;
        do{
            System.out.println(j);
            j+=2;
        } while(j<10);
        System.out.println("do-while döngüsü bitti");
    }
}