package entities;

public enum EmployeeStatus {
    ACTIVE(1),IN_ACTIVE(0),TERMINATED(-1);

    private final int value;

    EmployeeStatus(int value){
        this.value=value;
    }


    public int value() {
        return value;
    }
}
