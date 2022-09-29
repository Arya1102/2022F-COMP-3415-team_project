package dao;

import bean.Resident;

import java.sql.Connection;

/**
 * @Description: ResidentDAO
 * @author: Weikang
 * @date: 2022/9/29 12:04
 */

public interface ResidentDAO{
    void insert(Connection connection, Resident resident);

    void delete(Connection connection, int id);

    void update(Connection connection, Resident resident);

    Resident getResidentById(Connection connection, int id);
}
