package pl.p.lodz.zzpj2020.generics.task2.model;

public class Term implements Comparable<Term>{
    private String value;

    public Term(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public int compareTo(Term o) {
        return this.value.compareTo(o.value);
    }
}
