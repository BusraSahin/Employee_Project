package dao;
import Entity.BaseEntity;

public interface BaseDao {

    BaseEntity save (BaseEntity entity );

    void delete (BaseEntity entity);

    BaseEntity liste (BaseEntity entity);

    BaseEntity update (BaseEntity entity );

}

