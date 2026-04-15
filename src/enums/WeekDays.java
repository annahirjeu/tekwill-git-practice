package enums;

public class WeekDays {
    private final static String MONDAY = "MONDAY";
    private final static String THURSDAY = "THURSDAY";


    void showWorkingDays() {
        System.out.println(Days.MONDAY + THURSDAY + " WEDNESDAY");
    }

    void setPartTimeDays() {
        System.out.println(MONDAY + THURSDAY + "FRIDAY");
    }

    void sendWarnEmails(Days day) {
        System.out.println("Send email to " + Admins.ADMIN_EMAIL);
    }
}
