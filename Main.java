// uri1061 - Durée de l'événement

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Entrée du début de l'événement
        System.out.print("Jour ");
        int jourDebut = sc.nextInt();
        int heuresDebut = sc.nextInt();
        sc.next();
        int minutesDebut = sc.nextInt();
        sc.next();
        int secondesDebut = sc.nextInt();

        // Entrée de la fin de l'événement
        System.out.print("Jour ");
        int jourFin = sc.nextInt();
        int heuresFin = sc.nextInt();
        sc.next();
        int minutesFin = sc.nextInt();
        sc.next();
        int secondesFin = sc.nextInt();

        // Conversion en secondes
        int debutTotal = (jourDebut * 86400) + (heuresDebut * 3600) + (minutesDebut * 60) + secondesDebut;
        int finTotal = (jourFin * 86400) + (heuresFin * 3600) + (minutesFin * 60) + secondesFin;

        // Calcul de la durée totale en secondes
        int dureeTotal = finTotal - debutTotal;

        // Conversion en jours, heures, minutes et secondes
        int jours = dureeTotal / 86400;
        dureeTotal %= 86400;

        int heures = dureeTotal / 3600;
        dureeTotal %= 3600;

        int minutes = dureeTotal / 60;
        int secondes = dureeTotal % 60;

        // Affichage du résultat
        System.out.println(jours + " jour(s)");
        System.out.println(heures + " heure(s)");
        System.out.println(minutes + " minute(s)");
        System.out.println(secondes + " seconde(s)");

        sc.close();
    }
}
