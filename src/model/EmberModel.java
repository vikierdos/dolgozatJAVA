package model;

import java.util.ArrayList;

public class EmberModel {
    private int kor;
    private String nev;
    private ArrayList<String> nyelvek;

    public EmberModel(int kor, String nev, ArrayList<String> nyelvek) {
        this.kor = kor;
        this.nev = nev;
        this.nyelvek = nyelvek;
    }
    
    
    public EmberModel(int kor, String nev) {
        ArrayList<String> nyelv;
        nyelv = new ArrayList<>();
        nyelv.add("magyar");
        
        this(kor, nev, nyelv);
        
    }

    public String bemutatkozas() {
        String txt = "Szia, " + nev + " vagyok, és " + kor + " éves.\n";
        
        if(this.nyelvek.size() < 1){
            return txt;
        }
        if(this.nyelvek.size() == 1){
            txt += "Ezen a nyelven beszélek: " +nyelvek.get(0)+"\n";
            return txt;
        }
        else{
            
        }
        txt += "Ezeken a nyelveken beszélek: ";
        for (int i = 0; i < this.nyelvek.size()-1; i++) {
            txt += nyelvek.get(i) + ", ";
        }
        txt += nyelvek.get(this.nyelvek.size()-1) + "\n";
        return txt;
        
    }
    
    public void nyelvTanulas(String nyelv){
        this.nyelvek.add(nyelv);
    }
    
    public void szuletesNap(){
        kor++;
    }
}
