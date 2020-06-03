package pl.p.lodz.zzpj2020.generics.task1;

import pl.p.lodz.zzpj2020.generics.task1.model.ComplexStep;
import pl.p.lodz.zzpj2020.generics.task1.model.OneWayList;
import pl.p.lodz.zzpj2020.generics.task1.model.SimpleStep;
import pl.p.lodz.zzpj2020.generics.task1.model.Step;
import pl.p.lodz.zzpj2020.generics.task1.service.ComplexStepService;
import pl.p.lodz.zzpj2020.generics.task1.service.SimpleStepService;
import pl.p.lodz.zzpj2020.generics.task1.service.StepService;

public class Main {
    private static OneWayList<Step> stepOneWayList = new OneWayList<>();
    private static OneWayList<SimpleStep> simpleStepOneWayList = new OneWayList<>();
    private static OneWayList<ComplexStep> complexStepOneWayList = new OneWayList<>();

    public static void main (String[] args) {
        prepare();
        StepService stepService = new StepService(stepOneWayList);
        System.out.println(stepService.getDescription(1));
        System.out.println(stepService.getAll());

        OneWayList<Step> stepOneWayListTmp = new OneWayList<>();
        stepOneWayListTmp.add(new Step("step4"));
        stepOneWayListTmp.add(new Step("step5"));

        stepService.concatList(stepOneWayListTmp);
        System.out.println(stepService.getAll());
        System.out.println("---------------------");

        SimpleStepService simpleStepService = new SimpleStepService(simpleStepOneWayList);

        System.out.println(simpleStepService.getDescription(1));
        System.out.println(simpleStepService.getAll());

        System.out.println("---------------------");

        ComplexStepService complexStepService = new ComplexStepService(complexStepOneWayList);

        System.out.println(complexStepService.getDescription(1));
        System.out.println(complexStepService.getAll());
    }

    private static void prepare() {
        stepOneWayList.add(new Step("step1"));
        stepOneWayList.add(new Step("step2"));
        stepOneWayList.add(new Step("step3"));

        simpleStepOneWayList.add(new SimpleStep("step1"));
        simpleStepOneWayList.add(new SimpleStep("step2"));
        simpleStepOneWayList.add(new SimpleStep("step3"));

        complexStepOneWayList.add(new ComplexStep("step1"));
        complexStepOneWayList.add(new ComplexStep("step2"));
        complexStepOneWayList.add(new ComplexStep("step3"));
    }
}
