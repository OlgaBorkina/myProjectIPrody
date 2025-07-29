package lesson_13;

public class Main {
    public static void main(String[] args) {
        Record r1 = new Record("Vasya", 789456);
        Record r2 = new Record("Petya", 456789);
        Record r3 = new Record("Oleg", 32156456);
        Record r4 = new Record("Kirill", 231456);
        Record r5 = new Record("Slava", 4859678);
        Record r6 = new Record("Slava", 123456);


        TelephoneBook tb = new TelephoneBook();
        tb.addRecord(r1);
        tb.addRecord(r2);
        tb.addRecord(r3);
        tb.addRecord(r4);
        tb.addRecord(r5);
        tb.addRecord(r6);
        System.out.println(tb);

        System.out.println(tb.findRecord("Oleg"));
        System.out.println(tb.findAllRecords("Slava"));

    }
}
