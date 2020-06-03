package pl.p.lodz.zzpj2020.generics.task1.service;

import pl.p.lodz.zzpj2020.generics.task1.model.OneWayList;
import pl.p.lodz.zzpj2020.generics.task1.model.Step;

public class StepService extends GenericService<Step>{

    public StepService(OneWayList<Step> repository) {
        super(repository);
    }
}
