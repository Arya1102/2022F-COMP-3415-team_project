package dao;

import bean.MedicationProvider;

import java.sql.Connection;

/**
* @Description: MedicationProviderDAO
* @author: Weikang
* @date: 2022/9/29 12:05
*/

public interface MedicationProviderDAO {
    void insert(Connection connection, MedicationProvider mp);

    void delete(Connection connection, int id);

    void update(Connection connection, MedicationProvider mp);

    MedicationProvider getMedicationProviderById(Connection connection, int id);
}
