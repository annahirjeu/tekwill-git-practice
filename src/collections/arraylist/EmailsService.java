package collections.arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmailsService {
    public static void main(String[] args) {
        List<String> emails= new ArrayList<>();
        emails.add("anna@gmail.com");
        emails.add("fdsd@ds.ds");
        emails.add("fdfdf@dsds.dsds");
        emails.add("dsds@dsdd.dsds");
        emails.add("dsds@dsd.s");
        emails.add("anna@gmail.com");

        Set<String> emails1 = new HashSet<>(emails);
/*        emails.add("anna@gmail.com");
        emails.add("fdsd@ds.ds");
        emails.add("fdfdf@dsds.dsds");
        emails.add("dsds@dsdd.dsds");
        emails.add("dsds@dsd.s");
        emails.add("anna@gmail.com");*/

        System.out.println("Sending emails to: " + emails1);

    }
}
