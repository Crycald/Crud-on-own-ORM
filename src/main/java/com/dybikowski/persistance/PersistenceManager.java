package com.dybikowski.persistance;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

public interface PersistenceManager {

    Persistable create(Persistable persistable) throws IllegalAccessException, SQLException, ClassNotFoundException;

    void update(Persistable persistable) throws IllegalAccessException, SQLException, ClassNotFoundException, NoSuchFieldException;

    void delete(Persistable persistable) throws NoSuchFieldException, SQLException, ClassNotFoundException, IllegalAccessException;

    List<Persistable> find(QuerySpec querySpec) throws SQLException, ClassNotFoundException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException;
}
