package controller;

import model.EmberModel;
import view.View;

public class Controller {
    private EmberModel model;
    private View view;

    public Controller() {
        this.model = new EmberModel(19, "Jancsi");
        this.view = new View();
        
        this.view.megjelenit(this.model.bemutatkozas());
        
        
        this.view.megjelenit("Születésnap:\n");
        this.model.szuletesNap();
        this.view.megjelenit(this.model.bemutatkozas());
        
        this.view.megjelenit("Nyelv tanulás:\n");
        this.model.nyelvTanulas("angol");
        this.view.megjelenit(this.model.bemutatkozas());
        
    }
    
    
    
}
