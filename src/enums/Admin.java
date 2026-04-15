package enums;

public enum Admin {
    ADMIN_EMAIL("ion@gmail.com", "Chisinau", 12345678),
    ADMIN2_EMAIL("admin@gmail.com", "Balti", 12345678),
    DEV_EMAIL("vasile@gmail.com", "Comrat");

    public final String email;
    public final String address;

    Admin(String mail, String address, long phone) {
        email = mail;
        this.address = address;
    }

    Admin(String mail, String address) {
        email = mail;
        this.address = address;
    }

    static Admin getEmailsByAddress(String address) {
        for (Admin admin : values()) {
            if (admin.address.equals(address)) return admin;
        }
        return null;
    }

}
