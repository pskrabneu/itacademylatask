package by.itacademy.jd.main;

import static by.itacademy.jd.entity.criteria.SearchCriteria.Oven;
import static by.itacademy.jd.entity.criteria.SearchCriteria.TabletPC;

import by.itacademy.jd.entity.Appliance;
import by.itacademy.jd.entity.criteria.Criteria;
import by.itacademy.jd.service.ApplianceService;
import by.itacademy.jd.service.ServiceFactory;

public class Main {

    public static void main(String[] args) {
        Appliance appliance;

        ServiceFactory factory = ServiceFactory.getInstance ();
        ApplianceService service = factory.getApplianceService ();

        ///--------------///

        // Oven
        Criteria criteriaOven = new Criteria (Oven.class.getSimpleName ());
        criteriaOven.add (Oven.CAPACITY.toString (), 3);

        appliance = service.find (criteriaOven);
        PrintApplianceInfo.print (appliance);

        ///--------------///

        criteriaOven = new Criteria (Oven.class.getSimpleName ());
        criteriaOven.add (Oven.HEIGHT.toString (), 200);
        criteriaOven.add (Oven.DEPTH.toString (), 300);

        appliance = service.find (criteriaOven);

        PrintApplianceInfo.print (appliance);

        ///--------------///

        // TabletPC
        Criteria criteriaTabletPC = new Criteria (TabletPC.class.getSimpleName ());
        criteriaTabletPC.add (TabletPC.COLOR.toString (), "BLUE");
        criteriaTabletPC.add (TabletPC.DISPLAY_INCHES.toString (), 14);
        criteriaTabletPC.add (TabletPC.MEMORY_ROM.toString (), 4);

        appliance = service.find (criteriaTabletPC);

        PrintApplianceInfo.print (appliance);
    }
}
