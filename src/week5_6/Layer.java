package week5_6;

import java.util.ArrayList;
import java.util.Iterator;

public class Layer {
    ArrayList<Shape> layer = new ArrayList<>();

    public Layer(ArrayList<Shape> layer) {
        this.layer = layer;
    }

    public void deleteTriangle() {
        for(int i = 0; i < layer.size(); i++) {
            if(layer.get(i) instanceof Triangle) {
                layer.remove(layer.get(i));
                i--;
            }
        }
    }
    public  void removeCircle(){
        for(int i = 0; i < layer.size(); i++) {
            if(layer.get(i) instanceof Circle) {
                layer.remove(layer.get(i));
                i--;
            }
        }
    }
    public void out(){
        Iterator i = layer.iterator();
        for(Shape shape : layer){
            System.out.println(i.next());

        }
    }

}
