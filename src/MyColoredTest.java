//importo tutti i metodi statici della classe AnsiEscapes. In questo modo posso
//utilizzare le costanti e i metodi senza dover fare riferimento alla classe AnsiEscapes.
//Ad esempio posso usare "clearScreen()" invece di "AnsiEscapes.clearScreen()"
import static org.alb.util.AnsiEscapes.*;

public class MyColoredTest{
    public static void main(String[] args){
        clearScreen(); // pulisce lo schermo
        moveTo(10, 10);//sposta il cursore alla riga 10, colonna 10
        setForegroundColor(COLOR_RED); // setta il colore rosso
        setBold();//attiva grassetto
        System.out.println("Hello world"); // stampa "Hello world" in rosso e grassetto
        reset();//reset bold e colori
        setForegroundColor(COLOR_BLUE); // setta il colore rosso
        moveTo(11, 10);//sposta il cursore alla coordinata 11,10
        System.out.println("Hello world"); // stampa "Hello world" in blu
        reset();//resetta tutti gli attributi del terminale
    }
}
