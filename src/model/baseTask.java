package model;

public class baseTask {
    protected String namaTugas;
    protected String deadline;

    public baseTask(String namaTugas, String deadline) {
        this.namaTugas = namaTugas;
        this.deadline = deadline;
    }

    public String getNamaTugas() {
        return namaTugas;
    }

    public String getDeadline() {
        return deadline;
    }
}
