package model;

public class task extends baseTask {
    private boolean selesai;

    public static final String DEFAULT_DEADLINE = "Tidak ditentukan";

    public task(String namaTugas, String deadline) {
        super(namaTugas, deadline.isEmpty() ? DEFAULT_DEADLINE : deadline);
        this.selesai = false;
    }

    public void tandaiSelesai() {
        this.selesai = true;
    }

    public String getNamaTugas() {
        return namaTugas;
    }

    @Override
    public String getDeadline() {
        return deadline;
    }

    public boolean isSelesai() {
        return selesai;
    }
}
