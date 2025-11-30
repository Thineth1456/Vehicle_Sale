package edu.icet.repository.custom.Impl;

import edu.icet.dto.Cart;
import edu.icet.repository.custom.CartRepository;
import edu.icet.util.CrudUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CartRepositoryImpl implements CartRepository {
    @Override
    public List<Cart> getCartList(String id) throws SQLException {
        ResultSet resultSet = CrudUtil.execute("SELECT * FROM cart WHERE id =? ", id);
        ArrayList<Cart> carts = new ArrayList<>();
        while (resultSet.next()){
            carts.add(new Cart(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3)));
        }

        return carts;
    }



    @Override
    public boolean save(Cart cart) throws SQLException {
        return CrudUtil.execute("INSERT INTO cart VALUES(?,?,?)",cart.getId(),cart.getCustomerId(),cart.getVehicleId());
    }

    @Override
    public boolean delete(String id) throws SQLException {
        return CrudUtil.execute("DELETE FROM cart WHERE id = ?",id);
    }

    @Override
    public List<Cart> getAll() throws SQLException {
        return List.of();
    }

    @Override
    public boolean update(Cart cart) throws SQLException {
        return false;
    }
}
