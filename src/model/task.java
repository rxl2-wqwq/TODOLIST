package model;

public class task {
    private String namaTugas;
    private String deadline;
    private boolean selesai;

    public static final String DEFAULT_DEADLINE = "Tidak ditentukan";

    public task(String namaTugas, String deadline) {
        this.namaTugas = namaTugas;
        this.deadline = deadline.isEmpty() ? DEFAULT_DEADLINE : deadline;
        this.selesai = false;
    }

    public void tandaiSelesai() {
        this.selesai = true;
    }

    public String getNamaTugas() {
        return namaTugas;
    }

    public String getDeadline() {
        return deadline;
    }

    public boolean isSelesai() {
        return selesai;
    }
}
