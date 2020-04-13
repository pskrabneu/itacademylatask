package by.itacademy.jd.service.impl;

import by.itacademy.jd.dao.*;
import by.itacademy.jd.entity.Appliance;
import by.itacademy.jd.entity.criteria.Criteria;
import by.itacademy.jd.service.ApplianceService;
import by.itacademy.jd.service.validation.Validator;

public class ApplianceServiceImpl implements ApplianceService {

    @Override
    public Appliance find(Criteria criteria) {

        if (!Validator.criteriaValidator (criteria)) {
            return null;
        }

        DAOFactory factory = DAOFactory.getInstance ();
        ApplianceDAO applianceDAO = factory.getApplianceDAO ();

        Appliance appliance = applianceDAO.find (criteria);

        // add code here

        return appliance;
    }
}

// add your own classes
