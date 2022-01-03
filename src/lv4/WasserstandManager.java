package lv4;

import java.util.ArrayList;

public class WasserstandManager {

    private ArrayList<Wasserstand> list =new ArrayList<>();

    public void add(Wasserstand w){
        list.add(w);
    }
    public Wasserstand findById(int id){
        for (Wasserstand w:list){
            if(w.getId()==id){
                return w;
            }
        }
        return null;
    }
    public ArrayList<Wasserstand> findAllByGewaesser(String gewaesserName){
        ArrayList<Wasserstand> found = new ArrayList<>();
        for (Wasserstand w:list){
            if(w.getGewaesserName().equals(gewaesserName)){
                found.add(w);
            }
        }
        return found;

    }
    public Wasserstand findLastWasserstand(String gewaesserName){
        int sekunden=0;
        Wasserstand latest=null;
        for(Wasserstand w:list){
            if(w.getGewaesserName().equals(gewaesserName)){
                if (w.getZeitpunkt()>sekunden){
                    latest=w;
                    sekunden = w.getZeitpunkt();
                }
            }
        }
        return latest;
    }
    public Wasserstand findoldestWasserstand(String gewaesserName){
        int sekunden=0;
        Wasserstand oldest=null;
        for(Wasserstand w:list){
            if(w.getGewaesserName().equals(gewaesserName)){
                if (w.getZeitpunkt()<sekunden){
                    oldest=w;
                    sekunden = w.getZeitpunkt();
                }
            }
        }
        return oldest;
    }
    public ArrayList<Wasserstand> findForAlarmierung(){
        ArrayList<Wasserstand> found=new ArrayList<>();
        for(Wasserstand w:list){
            if(w.getMessWert()>=w.getMessWertAlarm()){
                found.add(w);
            }
        }
        return found;
    }
    public ArrayList<Wasserstand> findByZeitpunkt(int von, int bis, String
            gewaesserName){
        ArrayList<Wasserstand> found = new ArrayList<>();
        for(Wasserstand w:list){
            if(w.getGewaesserName().equals(gewaesserName) &&
                    (w.getZeitpunkt()>= von && w.getZeitpunkt() <= bis)){
                found.add(w);

            }
        }
        return found;
    }
    public double calcMittlererWasserstand(String gewaesserName){
        double avgWS=0.0;
        int count=0;
        for (Wasserstand w: list){
            if(w.getGewaesserName().equals(gewaesserName)){
                avgWS +=w.getMessWert();
                count++;
            }
        }
        if (count>0){
            return Math.round(avgWS/count*100)/100D;
        }
        return 0.0;
    }

}
