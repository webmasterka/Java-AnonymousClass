package klasyanonimowe;

public class Main {
    public static void main(String[] args) {
        ZachowaniePoKliknieciu z = () -> {
            System.out.println("Jestem z klasy anonimowej");
        };

        Przycisk p = new Przycisk();
        p.dodajAkcje(new ZachowaniePoKliknieciu() {
            @Override
            public void akcja() {
                System.out.println("Jestem z klasy anonimowej");
            }
        });
        ZachowaniePoKliknieciu2 z2 = (int a, int b) -> {
            System.out.println(a + b);
        };

        p.dodajAkcje2(5, 10, z2);
    }
}



interface ZachowaniePoKliknieciu
{
    void akcja();
}

interface ZachowaniePoKliknieciu2
{
    void akcja2(int a, int b);
}
class Przycisk
{
    public void dodajAkcje(ZachowaniePoKliknieciu z) {
        z.akcja();
    }

    public void dodajAkcje2(int a, int b, ZachowaniePoKliknieciu2 z) {

        z.akcja2(a, b);
    }

}