# AnsiEscapes
Utility Java per l'utilizzo di ANSI ESCAPES. Implementa i colori a 3/4 bit (i colori a 16 o 256 bit non sono supportati) e alcuni comandi (solo quelli supportati dalla maggior parte dei terminali).

#Installazione
Scaricare l'archivio zip `AnsiEscapesSample.zip` che contiene la seguente struttura:

~~~
src
|--> MyColoredTest.java:  esempio di utilizzo
|--> org
      |--> alb
            |--> util
                  |--> AnsiEscapes.class
~~~

Copiare la cartella `org` nella propria cartella di lavoro (oppure aggiungerla alla `CLASSPATH`). 

#Utilizzo
La classe `AnsiEscapes` esporta solo membri statici, è suffciente invocare i metodi e utilizzare le costanti facendo riferimento alla classe. Esempio:

~~~java
AnsiEscapes.clearScreen(); // pulisce lo schermo
AnsiEscapes.setForegroundColor(AnsiEscapes.COLOR_RED); // setta il colore rosso
System.out.print("Hello world"); // stampa "Hello world" in rosso
AnsiEscapes.setForegroundColor(AnsiEscapes.COLOR_BLUE); // setta il colore rosso
System.out.print("Hello world"); // stampa "Hello world" in blu
AnsiEscapes.reset();//resettatutti gli attributi del terminale
~~~

Per comodità è pure possibile importare tutti i membri statici di `AnsiEscapes`:

~~~java
import static org.alb.util.AnsiEscapes.*;

public class AnsiTest {

    public static void main(String[] args) {
        clearScreen(); // pulisce lo schermo
        moveTo(10, 10);
        setForegroundColor(COLOR_RED); // setta il colore rosso
        System.out.println("Hello world"); // stampa "Hello world" in rosso
        setForegroundColor(COLOR_BLUE); // setta il colore rosso
        System.out.println("Hello world"); // stampa "Hello world" in blu
        reset();//resettatutti gli attributi del terminale
    }
}
~~~

#Documentazione
La documentazione in formato Javadoc della classe `AnsiEscapes` si trova nell'archivio `AnsiEscapesDoc.zip`.


