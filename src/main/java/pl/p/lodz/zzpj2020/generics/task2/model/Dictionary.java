package pl.p.lodz.zzpj2020.generics.task2.model;


import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Dictionary<T extends Term, D extends Definition> {

    private Map<T, D> data = new TreeMap<>();

    public void add(T term, D definition) {
        data.put(term, definition);
    }

    public void delete(T term) {
        data.remove(term);
    }

    public Set<T> getAllTerms() {
        return data.keySet();
    }

    public void addAll(Dictionary<T, D> dictionary) {
        data.putAll(dictionary.data);
    }

    public D getDefinition(T term) {
        return data.get(term);
    }

    public boolean doesTermExist(T term) {
        return data.containsKey(term);
    }

    public int getSize() {
        return data.size();
    }
}
