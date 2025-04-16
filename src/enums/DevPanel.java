package enums;

public class DevPanel {

    static void sendEmailToAdmin() {
        System.out.println("Send email to: " + Admin.ADMIN_EMAIL.name());
    }

    public static void main(String[] args) {
        byte b = 10;
        Byte b1 = Byte.valueOf(b);
        Byte b2 = Byte.valueOf(b);
        Byte b3 = Byte.valueOf((byte) 10);

        Long l1 = Long.valueOf(100);
        Long l2 = Long.valueOf(100);
        Long l3 = Long.valueOf(1000);

    }

}
