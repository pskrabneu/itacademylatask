package by.itacademy.jd.service;

import by.itacademy.jd.entity.Appliance;
import by.itacademy.jd.entity.criteria.Criteria;

public interface ApplianceService {

    Appliance find(Criteria criteria);
}
