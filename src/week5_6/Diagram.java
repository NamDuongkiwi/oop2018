package week5_6;

import java.util.ArrayList;

public class Diagram {
    ArrayList<Layer> diagram = new ArrayList<>();

    public Diagram(ArrayList<Layer> diagram) {
        this.diagram = diagram;
    }

    void removeCircle(){
        for(Layer layer : diagram){
            layer.deleteCircle();
        }
    }
}
