package lesson_13;

import java.util.Objects;

public class Record {
    String name;
    Integer numberPhone;

    public Record(String name, Integer numberPhone) {
        this.name = name;
        this.numberPhone = numberPhone;
    }
    public String getName() {
        return name;
    }
    public Integer getNumberPhone() {
        return numberPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Record record = (Record) o;
        return Objects.equals(name, record.name) && Objects.equals(numberPhone, record.numberPhone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numberPhone);
    }

    @Override
    public String toString() {
        return "{name='" + name + '\'' +
                ", numberPhone=" + numberPhone +
                '}';
    }
}
