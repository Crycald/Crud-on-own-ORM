package com.dybikowski.persistance.sql;

import com.dybikowski.persistance.Persistable;
import com.dybikowski.persistance.PersistenceManager;
import com.dybikowski.persistance.QuerySpec;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

public class SqlPersistenceManager implements PersistenceManager {

    @Override
    public Persistable create(Persistable persistable) throws SQLException, ClassNotFoundException, IllegalAccessException {
        Field[] persistableFields = persistable.getClass().getDeclaredFields();
        String tableName = persistable.getClass().getSimpleName();
        StringBuilder queryBuilder = new StringBuilder();
        StringBuilder valueBuilder = new StringBuilder();
        StringBuilder fieldBuilder = new StringBuilder();

        queryBuilder.append("INSERT INTO ").append(tableName);

        for (Field index : persistableFields) {
            index.trySetAccessible();
            fieldBuilder.append(index.getName()).append(", ");
            String fieldValue = index.get(persistable).toString();

            if (index.getType().isAssignableFrom(String.class)) {
                valueBuilder.append("\"").append(fieldValue).append("\"").append(", ");
            } else {
                valueBuilder.append(fieldValue).append(", ");
            }
        }
        queryBuilder.append(" (").append(fieldBuilder.substring(0, fieldBuilder.length() - 2)).append(")");
        queryBuilder.append(" VALUES ").append("(").append(valueBuilder.substring(0, valueBuilder.length() - 2)).append(");");

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
