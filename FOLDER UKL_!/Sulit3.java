import java.util.HashMap;


public class star {

    public static void main(String[] args) {

        int[] array = {1, 2, 2, 3, 3, 3, 4};

        HashMap<Integer, Integer> frekuensiMap = new HashMap<>();


        for (int elemen : array) {

            frekuensiMap.put(elemen, frekuensiMap.getOrDefault(elemen, 0) + 1);

        }


        frekuensiMap.forEach((k, v) -> System.out.println(k + " muncul " + v + " kali"));

    }
}