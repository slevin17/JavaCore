package HW_lesson3;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    private ArrayList<T> edibleSpheres;

    public Box(T... edibleSpheres) {
        this.edibleSpheres = new ArrayList<T>(Arrays.asList(edibleSpheres));
    }

    public void add(T... edibleSpheres) {
        this.edibleSpheres.addAll(Arrays.asList(edibleSpheres));
    }

    public void remove(T... edibleSpheres) {
        for (T edibleSphere: edibleSpheres) this.edibleSpheres.remove(edibleSpheres);
    }

    public ArrayList<T> getEdibleSpheres() {
        return new ArrayList<T>(edibleSpheres);
    }

    public void clear() {
        edibleSpheres.clear();
    }

    public double getWeight() {
        if (edibleSpheres.size() == 0) return 0;
        double weight = 0;
        for (T edibleSphere: edibleSpheres) weight += edibleSphere.getWeight();
        return weight;
    }

    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }

    public void transfer(Box<? super T> box) {
        box.edibleSpheres.addAll(this.edibleSpheres);
        clear();
    }
}