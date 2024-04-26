import java.util.Scanner; 

public class Lernen {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);

    //Variablen und Datentypen
    int Zahl = 1;  //Datentyp = integer, Variablenname = Zahl
    String Buchstabe = "Hallo"; //Datentyp String, auch einsetzbar mit Zahlen oder anderen Sonderzeichen
    float Dezimalzahl = 1.23f; //Datentyp float

    //Wie man Variablen einsetzt
    System.out.print("Test"); //Ausgabe in der gleichen Zeile -> print
    System.out.println("Test2"); //Ausgabe in der nächsten Zeile -> println

    String Name = "Peter"; //Variable mit String
    String Alter = "36"; //Variable mit String
    System.out.print("Mein Name ist " + Name); //Ausgabe: Mein Name ist Peter
    System.out.println("Mein Alter ist: " + Alter); //Ausgabe: Mein Alter ist 36 

    //Wie man Eingabe einsetzt
		System.out.print("Wähle zwischen Ente oder Hund: "); //print für die gleiche Zeile der Eingabe
		String user = scan.next(); //Eingabe -> scan.next(); ist für string, User ist die Variable 

    float user2 = scan.nextFloat(); //Eingabe mit Dezimalzahlen
    int user3 = scan.nextInt(); //Eingabe mit Zahlen
    String user4 = scan.next(); //Eingabe mit Strings

    //Wie man Mathematik benutzt
    int Zahl1 = 5; //Variable
    int Zahl2 = 8; //Variable
    int Ergebnis = Zahl1 + Zahl2; //Addierte Integer Variablen
    int Ergebnis2 = Zahl1 - Zahl2; //Subtrahierte Integer Variablen
    int Ergebnis3 = Zahl1 / Zahl2; //Dividierende Integer Variablen
    int Ergebnis4 = Zahl1 * Zahl2; //Multiplizierende Interger Variablen
    System.out.println("Zahl 1 = " + Zahl1 + " | Zahl 2 = " + Zahl2); //Ausgabe der beiden Zahlen
    System.out.println("Ergebnis Addition: " + Ergebnis); //Ausgabe 
    System.out.println("Ergebnis Subtraktion: " + Ergebnis2); //Ausgabe
    System.out.println("Ergebnis Division: " + Ergebnis3); //Ausgabe 
    System.out.println("Ergebnis Multiplikation: " + Ergebnis4); //Ausgabe
    

    System.out.print("Zahl 1: "); //Ausgabe 
    int Zahl1Auswahl = scan.nextInt(); //Die Eingabe 
    System.out.println(Zahl1Auswahl); //Ausgabe der Eingabe

    //Wie man switch und case benutzt
    System.out.print("Welcher Monat ist gut: "); //Die Frage in einer Ausgabe
    String Benutzer = scan.next(); //Die Eingabe mit einem String und der Variable Benutzer

    
    switch(Benutzer) { //Die Variable für den Switch nehmen, in dem Fall Benutzer, in dem Fall nur 3 Monate aufgelistet
    case"Jänner":System.out.println("Du findest den Monat Jänner gut");break; //Auswahl bestätigt durch die Eingabe in Zeile 49
    case"Februar":System.out.println("Du findest den Monat Februar gut");break;
    case"März":System.out.println("Du findest den Monat März gut");break;
    default:System.out.println("Dieser Monat ist nicht existent");break;//Um ungültige Eingaben zu erkennen
		
		}
	}
}
