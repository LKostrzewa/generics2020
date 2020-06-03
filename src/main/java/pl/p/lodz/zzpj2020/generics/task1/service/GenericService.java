package pl.p.lodz.zzpj2020.generics.task1.service;

import pl.p.lodz.zzpj2020.generics.task1.model.OneWayList;
import pl.p.lodz.zzpj2020.generics.task1.model.Step;

public abstract class GenericService<T extends Step> {

    private OneWayList<T> repository;

    public GenericService(OneWayList<T> repository) {
        this.repository = repository;
    }

    public String getDescription(int n) {
        return repository.getElement(n).getDescription();
    }

    public String getAll() {
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < repository.getSize(); i++) {
            res.append(getDescription(i)).append("\n");
        }
        return res.toString();
    }

    public void concatList(OneWayList<T> list) {
        repository.addAll(list);
    }
}
