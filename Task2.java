package Task2;

import java.io.FileWriter;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("w z y x F");
        for (int w = 0; w < 2; w++) {
            for (int z = 0; z < 2; z++) {
                for (int y = 0; y < 2; y++) {
                    for (int x = 0; x < 2; x++) {
                            System.out.println(w + " " + z + " " + y + " " + x
                            + " " + (IsTrue(w == 1, z == 1, y == 1, x == 1)? "1" : "0"));
                    }
                }
            }
        }
    }
    static boolean IsTrue(boolean w, boolean z, boolean y, boolean x){
        return ( !(w == true) | z) & ((!y) & x);
    }
}
