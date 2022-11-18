package HW_lesson2;

public class CustomException {


    public static int arrayValidationMethod(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int size = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int i1 = 0; i1 < arr[i].length; i1++) {
                try {
                    size = size + Integer.parseInt(arr[i][i1]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, i1);
                }
            }

        }
        return size;
    }
    public static void main(String[] args) {

        String[][] arr = new String[][]{{"1", "1", "1", "1"}, {"2", "2", "2", "2"}, {"3", "3", "3", "3"}, {"4", "4", "4", "4"}};
        try {
            try {
                int result = arrayValidationMethod(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Array contains more dimensions than needed");
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("In an array cell: " + e.i + "x" + e.i1 + " - incorrect value");
        }

    }

}
