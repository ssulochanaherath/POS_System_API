package lk.ijse.posapi.entity.java.lk.ijse.posapi.dao.impl;

import lk.ijse.posapi.dao.custom.CustomerDAO;
import lk.ijse.posapi.entity.Customer;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAOImpl implements CustomerDAO {
    static String SAVE_CUSTOMER = "INSERT INTO customer (customerId,customerName,customerAddress,customerTel) VALUES (?,?,?,?)";
    static String UPDATE_CUSTOMER = "UPDATE customer SET customerName=?,customerAddress=?,customerTel=? WHERE customerId=?";
    static String GET_CUSTOMER = "SELECT * FROM customer";
    static String DELETE_CUSTOMER = "DELETE FROM customer WHERE customerId=?";
    @Override
    public boolean save(Customer entity, Connection connection) throws SQLException {
        try {
            var preparedStatement = connection.prepareStatement(SAVE_CUSTOMER);
            preparedStatement.setString(1,entity.getCustomerId());
            preparedStatement.setString(2,entity.getCustomerName());
            preparedStatement.setString(3,entity.getCustomerAddress());
            preparedStatement.setString(4,entity.getCustomerTel());
            return preparedStatement.executeUpdate() != 0;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }

    }

    @Override
    public boolean update(String id, Customer entity, Connection connection) {
        try {
            var preparedStatement = connection.prepareStatement(UPDATE_CUSTOMER);
            preparedStatement.setString(1,entity.getCustomerName());
            preparedStatement.setString(2, entity.getCustomerAddress());
            preparedStatement.setString(3, entity.getCustomerTel());
            preparedStatement.setString(4,id);
            return preparedStatement.executeUpdate() != 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Customer> get(Connection connection) throws SQLException {
        List<Customer> customers = new ArrayList<>();
        try {
            var preparedStatement = connection.prepareStatement(GET_CUSTOMER);
            var resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                var customer = new Customer();
                customer.setCustomerId(resultSet.getString("customerId"));
                customer.setCustomerName(resultSet.getString("customerName"));
                customer.setCustomerAddress(resultSet.getString("customerAddress"));
                customer.setCustomerTel(resultSet.getString("customerTel"));
                customers.add(customer);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return customers;
    }

    @Override
    public boolean delete(String id, Connection connection) {
        try {
            var preparedStatement = connection.prepareStatement(DELETE_CUSTOMER);
            preparedStatement.setString(1,id);
            return preparedStatement.executeUpdate() != 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
