package aditi;

public class Arrays {
    public static void main(String[] args) {
        // Both are valid syntax
        //int[] marks = new int[3];
        //int marks[] = new int[3];
        int marks[] = {97,98,95};
        /* marks[0] = 97; // phy
        marks[1] = 98; // chem
        marks[2] = 95; // eng*/
        // System.out.println(marks); // This will print a garbage value
        /* System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);*/

        // by loop
        for (int i=0;i<3;i++){
            System.out.println(marks[i]);
        }
    }
}
