package lv4;

import java.util.Objects;

public class Event {

    private String title;
    private String ort;
    private double eintrittspreis;

    public Event(String title, String ort, double eintrittspreis) {
        this.title = title;
        this.ort = ort;
        this.eintrittspreis = eintrittspreis;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public double getEintrittspreis() {
        return eintrittspreis;
    }

    public void setEintrittspreis(double eintrittspreis) {
        this.eintrittspreis = eintrittspreis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Event event = (Event) o;
        return Objects.equals(title, event.title) && Objects.equals(ort, event.ort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, ort);
    }

    @Override
    public String toString() {
        return "Event{" +
                "title='" + title + '\'' +
                ", ort='" + ort + '\'' +
                ", eintrittspreis=" + eintrittspreis +
                '}';
    }
}
