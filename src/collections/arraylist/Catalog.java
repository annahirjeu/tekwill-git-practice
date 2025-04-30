package collections.arraylist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Catalog {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> grades = new HashMap<>();

        ArrayList<Integer> xzxz = new ArrayList<>();
        xzxz.add(9);
        xzxz.add(10);
        xzxz.add(7);
        xzxz.add(9);
        xzxz.add(8);

        ArrayList<Integer> gradesIon = new ArrayList<>();
        gradesIon.add(8);
        gradesIon.add(9);
        gradesIon.add(5);
        gradesIon.add(8);
        gradesIon.add(10);
        gradesIon.add(8);

        ArrayList<Integer> gradesMaria = new ArrayList<>();
        gradesMaria.add(9);
        gradesMaria.add(8);
        gradesMaria.add(9);
        gradesMaria.add(10);
        gradesMaria.add(9);

        grades.put("Anna", xzxz);
        grades.put("Ion", gradesIon);
        grades.put("Maria", gradesMaria);

        for (String name : grades.keySet()) {
            ArrayList<Integer> gradeList = grades.get(name);
            System.out.println("Elevul cu numele: " + name + " are notele: " + gradeList);

            int sum = 0;
            for (Integer grade : gradeList) {
                sum += grade;
            }
            double media = (double) sum / gradeList.size();
            System.out.println("Media este: " + media);

        }

    }
}
