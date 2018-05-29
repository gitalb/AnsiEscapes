
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.alb.util.AnsiEscapes.*;

/*
 * The MIT License
 *
 * Copyright 2018 andreaalbertini.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
/**
 *
 * @author andreaalbertini
 */
public class AnsiTest {

    /**
     * Carattere associato al comando sinistra.
     */
    public static final char SX = 'a';
    /**
     * Carattere associato al comando destra.
     */
    public static final char DX = 'd';
    /**
     * Posizione massima (a destra)
     */
    public static final int MAX = 10;
    /**
     * Posizione minima (a sinistra)
     */
    public static final int MIN = 0;

    public static void main(String[] args) {
        clearScreen(); // pulisce lo schermo
        reset();//resettatutti gli attributi del terminale
        try {
            int read = 0;
            int pos = 1;
            while ((read = getKey()) != 'q') {
                clearScreen();
                moveTo(1, pos);
                System.out.print("X");
                if (read == DX) {
                    pos = pos + 1;
                    if (pos > MAX) {
                        pos = MAX;
                    }
                } else if (read == SX) {
                    pos = pos - 1;
                    if (pos < MIN) {
                        pos = MIN;
                    }
                }
                Thread.sleep(100);
            }
        } catch (IOException ex) {
            System.out.println("Errore di IO");
        } catch (InterruptedException ex) {
        }
    }
}
