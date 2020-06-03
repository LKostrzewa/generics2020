package pl.p.lodz.zzpj2020.generics.task2;

import pl.p.lodz.zzpj2020.generics.task2.model.*;
import pl.p.lodz.zzpj2020.generics.task2.service.DictionaryService;

public class Main {

    private static Dictionary<Term, Definition> dictionary = new Dictionary<>();
    private static Dictionary<Term, Definition> dictionary2 = new Dictionary<>();

    public static void main(String[] args) {
        prepare();
        DictionaryService dictionaryService = new DictionaryService(dictionary);

        System.out.println(dictionaryService.getAllTerms());
        System.out.println(dictionaryService.getDefinition(new Term("rock")));

        dictionaryService.addDictionary(dictionary2);
        System.out.println(dictionaryService.getAllTerms());

    }

    private static void prepare() {
        dictionary.add(new MusicTerm("rock"), new Definition("Rock to ..."));
        dictionary.add(new LegalTerm("wykroczenie"), new Definition("wykroczenie to ..."));
        dictionary.add(new LiteratureTerm("powiesc"), new Definition("powiesc to ..."));

        dictionary2.add(new Term("informatyka"), new Definition("informatyka to ..."));
    }
}
