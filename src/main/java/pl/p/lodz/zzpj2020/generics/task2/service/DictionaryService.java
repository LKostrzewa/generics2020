package pl.p.lodz.zzpj2020.generics.task2.service;

import pl.p.lodz.zzpj2020.generics.task2.model.Definition;
import pl.p.lodz.zzpj2020.generics.task2.model.Dictionary;
import pl.p.lodz.zzpj2020.generics.task2.model.Term;

public class DictionaryService {

    private Dictionary<Term, Definition> repository;

    public DictionaryService(Dictionary<Term, Definition> repository) {
        this.repository = repository;
    }

    public String getAllTerms() {
        StringBuilder res = new StringBuilder();
        for(Term term : repository.getAllTerms()) {
            res.append(term.getValue()).append("\n");
        }
        return res.toString();
    }

    public String getDefinition(Term term) {
        return repository.getDefinition(term).getValue();
    }

    public void addDictionary(Dictionary<Term, Definition> dictionary) {
        repository.addAll(dictionary);
    }
}
