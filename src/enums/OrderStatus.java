package enums;

public enum OrderStatus {
    INITIALISED(1, "Order is received"),
    ACTIVE(2, "Order is accepted"),
    PROCESSING(3, "Order is at cooker"),
    PROCESSED(4, "Order is done"),
    FINISHED(5, "Order is delivered");

    private int statusIndex;
    private String message;

    OrderStatus(int index, String message) {
        this.statusIndex = index;
        this.message = message;
    }

    void setStatusIndex(int index) {
        statusIndex = index;
    }

    int getStatusIndex() {
        return statusIndex;
    }

    static OrderStatus getByIndex(int index) {
        for (OrderStatus orderStatus : values()) {
            if (orderStatus.statusIndex == index) return orderStatus;
        }
        return null;
    }

}
