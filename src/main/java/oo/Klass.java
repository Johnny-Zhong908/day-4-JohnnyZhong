package oo;

public class Klass {
    private int number;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Klass klass = (Klass) obj;
        return number == klass.number;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(number);
    }
}
