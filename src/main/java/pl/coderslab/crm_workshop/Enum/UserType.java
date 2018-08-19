package pl.coderslab.crm_workshop.Enum;

public enum UserType {
    WORKER("Worker"),
    MENAGER("Menager");

    private String label;

    UserType(String label) {
        this.label = label;
    }
}
