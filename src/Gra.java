import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Gra {

    private static ArrayList<Integer> wylosowane = new ArrayList<>();
    private ArrayList<Integer> wpisane = new ArrayList<>();
    private LinkedList<Integer> trafione = new LinkedList<>();

    private void wylosujLiczby(int ile) {
        while (wylosowane.size()<6) {
            int liczba = (int) (Math.random() * 100 + 1);
            while (wylosowane.contains(liczba)) {
                liczba = (int) (Math.random() * 100 + 1);
            }
            wylosowane.add(liczba);
        }
    }

    private void wpiszZKlawiatury(int ile) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj 6 liczb:");
        for (int i = 0; i < ile; i++) {
            int liczba = klawiatura.nextInt();
            wpisane.add(liczba);
        }
    }

    private void wypiszKolekcje(List<Integer> lista) {
        System.out.println("Wypisywana lista:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + ", ");
        }
    }

    private void sprawdz() {
        for (Integer wpisana:wpisane) {
            if (wylosowane.contains(wpisana)) {
                trafione.add(wpisana);
            }
        }
    }
    public void zagraj(){
        wylosujLiczby(6);
        wpiszZKlawiatury(6);
        sprawdz();
        System.out.println("Wylosowane");
        wypiszKolekcje(wylosowane);
        System.out.println("Wpisane");
        wypiszKolekcje(wpisane);
        System.out.println("Trafione");
        wypiszKolekcje(trafione);
    }
}
