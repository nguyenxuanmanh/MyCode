/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import com.sun.webkit.ContextMenu;
import entities.TbAdmin;
import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NK
 */
public class AdminDAO implements IAdmin {

    Connection connection;
    PreparedStatement pstm;
    ResultSet rs;

    private Connection setCon() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        connection = DriverManager.getConnection(
                "jdbc:sqlserver://localhost:1433;database=eShopDB", "sa", "123");
        return connection;
    }

    @Override
    public boolean checkLogin(String email, String pass) {
        try {
            setCon();
            String query = "SELECT * FROM TbAdmin WHERE email=? AND password=?";
            pstm = connection.prepareStatement(query);
            pstm.setString(1, email);
            pstm.setString(2, pass);
            rs = pstm.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public List<TbAdmin> findAll() {
        List<TbAdmin> list = new ArrayList<>();

        try {
            setCon();
            String query = "SELECT * FROM TbAdmin";
            pstm = connection.prepareStatement(query);
            rs = pstm.executeQuery();;
            while (rs.next()) {
                TbAdmin a = new TbAdmin();
                a.setAdminID(rs.getString(1));
                a.setAdminName(rs.getString(2));
                a.setGender(rs.getBoolean(3));
                a.setEmail(rs.getString(4));
                a.setPhone(rs.getString(5));
                a.setPassword(rs.getString(6));
                a.setAddress(rs.getString(7));
                a.setRole(rs.getString(8));
                a.setStatus(rs.getBoolean(9));
                a.setInsertAt(rs.getDate(10));
                a.setUpdateAt(rs.getDate(11));
                list.add(a);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

    @Override
    public boolean update(TbAdmin tbAdmin) {
        try {
            setCon();
            String query = "Update TbAdmin Set AdminName=? Email=? ,Phone=? ,Address=? ,Role=? WHERE AdminID=?";
            pstm = connection.prepareStatement(query);
            pstm.setString(1, tbAdmin.getAdminName());
            pstm.setString(2, tbAdmin.getEmail());
            pstm.setString(3, tbAdmin.getPhone());
            pstm.setString(4, tbAdmin.getAddress());
            pstm.setString(5, tbAdmin.getRole());
            pstm.setString(6, tbAdmin.getAdminID());
            pstm.executeUpdate();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    public List<TbAdmin> findByAdmin(String name) {
        List<TbAdmin> list = new ArrayList<>();
        try {
            setCon();
            String query = "SELECT * FROM TbAdmin WHERE AdminName LIKE ?";
            pstm = connection.prepareStatement(query);
            pstm.setString(1, "%" + name + "%");
            rs = pstm.executeQuery();
            while (rs.next()) {
                TbAdmin tbAdmin = new TbAdmin();
                tbAdmin.setAdminID(rs.getString(1));
                tbAdmin.setAdminName(rs.getString(2));
                tbAdmin.setGender(rs.getBoolean(3));
                tbAdmin.setPhone(rs.getString(4));
                tbAdmin.setPassword(rs.getString(5));
                tbAdmin.setAddress(rs.getString(6));
                tbAdmin.setRole(rs.getString(7));
                tbAdmin.setStatus(rs.getBoolean(8));
                tbAdmin.setInsertAt(rs.getDate(9));
                tbAdmin.setUpdateAt(rs.getDate(10));

                list.add(tbAdmin);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public boolean create(String id, String name, boolean gender, String email,
            String phone, String password, String address, String role,
            boolean status, Date insertat, Date updateat) {
        try {
            setCon();
            String query = "Insert INTO TbAdmin VALUES(?,?,?,?,?,?,?,?)";
            pstm = connection.prepareStatement(query);
            pstm.setString(1, id);
            pstm.setString(2, name);
            pstm.setBoolean(3, gender);
            pstm.setString(4, email);
            pstm.setString(4, phone);
            pstm.setString(5, password);
            pstm.setString(6, address);
            pstm.setString(7, role);
            pstm.setBoolean(8, status);

            pstm.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    @Override
    public boolean delete(String id) {
        try {
            setCon();
            String query = "Delete FROM TbAdmin WHERE AdminID=?";
            pstm = connection.prepareStatement(query);
            pstm.setString(1, id);
            pstm.executeUpdate();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    @Override
    public boolean search(String email, String address) {
        try {
            setCon();
            String query = "Search FROM TbAdmin WHERE Email=? ,Adress=?";
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    @Override
    public boolean addwl(String id, String name, boolean type, Date insertat, Date updateat) {
        try {
            setCon();
            String query = "Insert INTO TbWishList VALUES(?,?,?)";
            pstm = connection.prepareStatement(query);
            pstm.setString(1, id);
            pstm.setString(2, name);
            pstm.setBoolean(3, type);

            pstm.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

   
    @Override
    public boolean removewl(String id) {
        try {
            setCon();
            String query = "Remove FROM TbWishList WHERE WLID=?";
            pstm = connection.prepareStatement(query);
            pstm.setString(1, id);
            pstm.executeUpdate();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

   
}
