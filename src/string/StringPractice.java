package string;

public class StringPractice {

    public static void main(String[] args) {
        UsualClass usualObject = new UsualClass(80);
        System.out.println("Initial object hash - " + usualObject.hashCode());

        usualObject.setValue(90);
        System.out.println("Object's hash after changes - " + usualObject.hashCode());


        String stringObject = new String("Hello");

        System.out.println("initial stringObject = " + stringObject);
        System.out.println("inital object hash = " + stringObject.hashCode());
        stringObject.concat(" You");

        System.out.println("stringObject after concat = " + stringObject);
        System.out.println("object hash = " + stringObject.hashCode());

        stringObject = stringObject.concat(" friend");
        System.out.println("stringObject after concat and reassign = " + stringObject);
        System.out.println("object hash = " + stringObject.hashCode());

        stringObject = stringObject + " stranger";
        System.out.println("stringObject after + and reassign = " + stringObject);
        System.out.println("object hash = " + stringObject.hashCode());

        String str1 = "String value";
        System.out.println("str1 = " + str1);
        System.out.println("str1 hash = " + str1.hashCode());
        str1 = str1.concat(" in java");
        System.out.println("str1 = " + str1);
        System.out.println("str1 hash = " + str1.hashCode());
        String str2 = "String value";
        System.out.println("str2 = " + str2);
        System.out.println("str2 hash = " + str2.hashCode());


    }

}
