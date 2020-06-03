package pl.p.lodz.zzpj2020.generics.task1.service;

import pl.p.lodz.zzpj2020.generics.task1.model.ComplexStep;
import pl.p.lodz.zzpj2020.generics.task1.model.OneWayList;

public class ComplexStepService extends GenericService<ComplexStep> {
    public ComplexStepService(OneWayList<ComplexStep> repository) {
        super(repository);
    }
}
