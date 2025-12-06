package controller;

import model.task;
import java.util.ArrayList;

public class taskManager {
    private ArrayList<task> daftarTugas = new ArrayList<>();

    public void tambahTugas(String namaTugas, String deadline) {
        daftarTugas.add(new task(namaTugas, deadline));
    }

    public void hapusTugas(int indeks) {
        if (indeks >= 0 && indeks < daftarTugas.size()) {
            daftarTugas.remove(indeks);
        }
    }

    public void tandaiSelesai(int indeks) {
        if (indeks >= 0 && indeks < daftarTugas.size()) {
            daftarTugas.get(indeks).tandaiSelesai();
        }
    }

    public ArrayList<task> getSemuaTugas() {
        return daftarTugas;
    }
}
