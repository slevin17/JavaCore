package HW_lesson2;

public class MyArrayDataException extends Exception {
    public int i;
    public int i1;

    MyArrayDataException(int i, int i1) {
        this.i = i;
        this.i1 = i1;

    }

}
