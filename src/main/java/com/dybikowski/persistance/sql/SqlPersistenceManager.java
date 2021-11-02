package com.dybikowski.persistance.sql;

import com.dybikowski.persistance.Persistable;
import com.dybikowski.persistance.PersistenceManager;
import com.dybikowski.persistance.QuerySpec;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

public class SqlPersistenceManager implements PersistenceManager {

    @Override
    public Persistable create(Persistable persistable) throws IllegalAccessException, SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public void update(Persistable persistable) throws IllegalAccessException, SQLException, ClassNotFoundException, NoSuchFieldException {

    }

    @Override
    public void delete(Persistable persistable) throws NoSuchFieldException, SQLException, ClassNotFoundException, IllegalAccessException {

    }

    @Override
    public List<Persistable> find(QuerySpec querySpec) throws SQLException, ClassNotFoundException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        return null;
    }
}
