package lv4;

import java.util.ArrayList;

public class EventKalender {
    private ArrayList<Event>events;

    public EventKalender() {
        this.events = new ArrayList<>();
    }
    //parm event das hizugefügt werden soll
    public void add(Event event){
        events.add(event);
    }
    //liefert Event mit dem angegebenen Titel retour
    public Event getByTitle(String title){
        for (Event event: events){
            if(event.getTitle().equals(title)){
                return event;
            }
        }
        return null;
    }
    //leifert alle Events am ort retour
    public ArrayList<Event> getByOrt(String ort){
        ArrayList<Event> found = new ArrayList<>();
        for (Event event: events){
            if(event.getOrt().equals(ort)){
                found.add(event);
            }
        }
        return found;

    }
    public ArrayList<Event> getByEintrittsPreis(double min, double max){
        ArrayList<Event> found = new ArrayList<>();
        for (Event event: events){
            if(event.getEintrittspreis()>=min && event.getEintrittspreis()<=max){
                found.add(event);
            }
        }
        return found;

    }
    public Event getMostExpensiveByOrt(String ort){
        //Zwischenspeicher für maximalen Preis
        double maxPreis=0.0;
        Event mostExpensive=null;

        for (Event event: events){
            if(event.getOrt().equals(ort)){
                if(event.getEintrittspreis()>maxPreis){
                    maxPreis=event.getEintrittspreis();
                    mostExpensive=event;
                }
            }
        }
        return mostExpensive;

    }
    public double getAvgPreisByOrt(String ort){
        double sum=0.0;
        int count=0;
        for (Event event:events){
            if(event.getOrt().equals(ort)){
                sum +=event.getEintrittspreis();
                count++;
            }
        }
        if (count>0){
            return Math.round(sum/count*100)/100D;
        }
        return 0.0;
    }

}
