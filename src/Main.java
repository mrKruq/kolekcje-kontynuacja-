import java.util.*;

public class Main {
    /**
     * wylosuj liste - losuje liste liczb calkowitych z zakresu 1,100
     * @param ileElementow - liczba wylosowanych elementow
     * @return -Array z liczbami wylosowanym
     */
    private static ArrayList<Integer> wylosujListe(int ileElementow){
        ArrayList<Integer> listaLiczbWylosowanychBezPowtorzen = new ArrayList<>();
        for (int i = 0; i < ileElementow; i++) {
            int liczba = (int)(Math.random()*100+1);
            while(listaLiczbWylosowanychBezPowtorzen.contains(liczba)){
                liczba = (int)(Math.random()*100+1);
            }
            listaLiczbWylosowanychBezPowtorzen.add(liczba);
        }
        return listaLiczbWylosowanychBezPowtorzen;
    }

    /**
     * @param listaDoWypisania
     */
    private static void wypiszListe(List<Integer> listaDoWypisania){
        System.out.println("Wypisywana lista:");
        for (int i = 0; i < listaDoWypisania.size(); i++) {
            System.out.println(listaDoWypisania.get(i));
        }
    }

    private static ArrayList<Integer> wstawLiczbyDoListy(int ileElementow){

        ArrayList<Integer>listaLiczbZKlawiatury = new ArrayList<>();
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj 6 liczb:");
        for (int i = 0; i < ileElementow; i++) {
            int liczba = klawiatura.nextInt();
            listaLiczbZKlawiatury.add(liczba);
        }
        return listaLiczbZKlawiatury;
    }
    private static LinkedList<Integer> zwrocElementyZObuList(ArrayList<Integer>listaLiczbZKlawiatury, ArrayList<Integer>listaLiczbWylosowanychBezPowtorzen){
        LinkedList<Integer> trafione = new LinkedList<>();
        for (Integer wpisana:listaLiczbZKlawiatury) {
            if(listaLiczbWylosowanychBezPowtorzen.contains(wpisana)){
                trafione.add(wpisana);
            }
        }
        return trafione;
    }


    public static void main(String[] args) {
        ArrayList<Integer> losowe = wylosujListe(6);
        wypiszListe(losowe);
        ArrayList<Integer> wpisane = wstawLiczbyDoListy(6);
        wypiszListe(wpisane);
        LinkedList<Integer> trafione = zwrocElementyZObuList(losowe,wpisane);
        wypiszListe(trafione);
    }
}