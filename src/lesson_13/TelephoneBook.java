package lesson_13;

import java.util.ArrayList;
import java.util.List;

public class TelephoneBook {
    List<Record> records;

    public TelephoneBook() {
        records = new ArrayList<Record>();
    }
    public void addRecord(Record r) {
        records.add(r);
    }
    public  Record findRecord(String name) {
        for (Record r : records) {
            if (r.getName().equalsIgnoreCase(name)) {
                return r;
            }
        }
        return null;
    }

    public List<Record> findAllRecords(String name){
        List<Record> listRecords = new ArrayList<>();
        for (Record r : records) {
            if (r.getName().equals(name)) {
                listRecords.add(r);
            }
        }
        return listRecords;
    }

    @Override
    public String toString() {
        return records.toString();
    }
}
