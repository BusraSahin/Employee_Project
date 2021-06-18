package dao;
import Entity.BaseEntity;

public interface BaseDaoD {

    BaseEntity save (BaseEntity entity);
    void delete (BaseEntity entity);
    BaseEntity list (BaseEntity entity);
    BaseEntity Update (BaseEntity entity);
}
