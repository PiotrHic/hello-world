package GraWybierzNumer;

import java.util.Scanner;

public class Gra {

    /*
    Gra jest prosta - wybieramy numer od 1 do 10,
    jesli uda nam sie to w 2 probach lub mniej - jestesmy super,
    jesli w 3, sredni,
    jesli w 4 slaby
    jesli w wiecej niz 4 - przegrales :D
     */

    public static void main(String[] args) {
        rozpocznijGre();
    }

    public static void rozpocznijGre(){
        Scanner skanerek = new Scanner(System.in);
        System.out.println("Witaj w naszej grze! \n" +
                "Wylosowany zostanie numer od 1 do 10 \n" +
                "Staraj sie go trafić :)");

        int losowy = (int) (1 + (Math.random() * 10));

        int wybor = 0;
        int licznik = 0;
        while(true){
            System.out.println("Wpisz prosze numer od 1 do 10: ");

            if(skanerek.hasNextInt()){
                wybor = skanerek.nextInt();
                skanerek.nextLine();
                if (wybor > 10 || wybor < 1){
                    System.out.println("To nie jest numer z tego zakresu :P");
                    continue;
                }
                licznik ++;
                System.out.println("Wybrałeś numer: " + wybor);
                if(wybor == losowy){
                    System.out.println("Udało się się wylosować odpowiedni numer: " +wybor);
                    break;
                } else{
                    System.out.println("Pudło!");
                }

            } else {
                skanerek.nextLine();
                System.out.println("Wpisz prosze numer od 1 do 10!");

            }
        }

        if(licznik <= 2){
            System.out.println("Jesteś znakomity! Udało Ci się odgadnac cel w " + licznik + " probach");
        } else if (licznik == 3){
            System.out.println("Srednio,3, ale i tak niezle!" + licznik + " -> prob!");
        } else if(licznik == 4){
            System.out.println("Slabo! 4 to za duzo!" + licznik + " -> prob!");
        } else{
            System.out.println("Beznadzieja! " + licznik + " -> prob!");
        }
    }
}

