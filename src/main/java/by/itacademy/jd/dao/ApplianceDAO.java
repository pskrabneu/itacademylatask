package by.itacademy.jd.dao;

import by.itacademy.jd.entity.Appliance;
import by.itacademy.jd.entity.criteria.Criteria;

public interface ApplianceDAO {
    Appliance find(Criteria criteria);
}
