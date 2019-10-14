package ba.unsa.etf.rpr.tut1;
import java.util.*;

public class Sat {

    int sati, minute, sekunde;

     public Sat(int sati, int minute, int sekunde) {
        postavi(sati, minute, sekunde);
    }

    public void postavi(int sati, int minute, int sekunde) {
        this.sati = sati;
        this.minute = minute;
        this.sekunde = sekunde;
    }

    public void sljedeci() {
        this.sekunde++;
        if (this.sekunde == 60) {
            this.sekunde = 0;
            this.minute++;
        }
        if (this.minute == 60) {
            this.minute = 0;
            this.sati++;
        }
        if (this.sati == 24) sati = 0;
    }

    public void prethodni() {
        this.sekunde--;
        if (this.sekunde == -1) {
            this.sekunde = 59;
            this.minute--;
        }
        if (this.minute == -1) {
            this.minute = 59;
            this.sati--;
        }
        if (this.sati == -1) this.sati = 23;
    }

    public void pomjeriZa(int pomak) {
        if (pomak > 0) for (int i = 0; i < pomak; i++) this.sljedeci();
        else for (int i = 0; i < -pomak; i++) this.prethodni();
    }

    //geteri
    int DajSate() {
        return this.sati;
    }

    int DajMinute() {
        return this.minute;
    }

    int DajSekunde() {
        return this.sekunde;
    }

    public void ispisi() {
        System.out.println(this.DajSate() + ":" + this.DajMinute() + ":" + this.DajSekunde());
    }
}