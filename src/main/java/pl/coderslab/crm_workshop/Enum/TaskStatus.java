package pl.coderslab.crm_workshop.Enum;

public enum TaskStatus {
    TO_DO("To Do"),
    IN_PROGRES("In Progres"),
    DONE("Done");

    private String lable;

     TaskStatus(String lable) {
        this.lable = lable;
    }

    public String getLable() {
        return lable;
    }
}
