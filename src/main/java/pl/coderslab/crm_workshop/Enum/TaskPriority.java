package pl.coderslab.crm_workshop.Enum;

public enum TaskPriority {
LOW("Low", true),
NORMAL("Normal", true),
HIGH("High", true),
NOTACTIVE("Not Active", false);

private String lable;
private boolean activiy;

TaskPriority(String lable, boolean activiy) {
    this.lable = lable;
    this.activiy = activiy;
}

}
