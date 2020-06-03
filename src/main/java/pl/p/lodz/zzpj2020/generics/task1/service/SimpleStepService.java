package pl.p.lodz.zzpj2020.generics.task1.service;

import pl.p.lodz.zzpj2020.generics.task1.model.OneWayList;
import pl.p.lodz.zzpj2020.generics.task1.model.SimpleStep;

public class SimpleStepService extends GenericService<SimpleStep> {
    public SimpleStepService(OneWayList<SimpleStep> repository) {
        super(repository);
    }
}
