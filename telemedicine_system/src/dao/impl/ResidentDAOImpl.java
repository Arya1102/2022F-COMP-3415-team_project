package dao.impl;

import bean.Resident;
import dao.ResidentDAO;
import dao.baseDAO;

import java.sql.Connection;

/**
 * @Description: ResidentDAOImpl
 * @author: Weikang
 * @version: 1.0
 * @date: 29/09/2022 12:23
 */

public class ResidentDAOImpl extends baseDAO implements ResidentDAO {

    @Override
    public void insert(Connection connection, Resident resident) {

    }

    @Override
    public void delete(Connection connection, int id) {

    }

    @Override
    public void update(Connection connection, Resident resident) {

    }

    @Override
    public Resident getResidentById(Connection connection, int id) {
        return null;
    }
}
