package utils;

import model.task;

public class taskFormatter {
    public static String format(task t) {
        return (t.isSelesai() ? "[✓] " : "[ ] ") 
               + t.getNamaTugas() 
               + " - " 
               + t.getDeadline();
    }
}
