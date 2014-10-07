package DAO;

import Modelo.Cliente;
import Modelo.Padecimiento;
import Modelo.Seguimiento;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import java.util.List;
import java.sql.SQLException;
import java.util.Observable;

public class DAO extends Observable {

    private Dao<Seguimiento, String> daoSeguimiento;
    private Dao<Cliente, String> daoCliente;
    private Dao<Padecimiento, String> daoPadecimiento;
    private JdbcConnectionSource connection;
    private static String databaseUrl = "jdbc:mysql://localhost:3306/gym";

    public DAO() throws Exception {
        connection = new JdbcConnectionSource(databaseUrl);
        connection.setUsername("pablo");
        connection.setPassword("20dejulio");
        daoSeguimiento = DaoManager.createDao(connection, Seguimiento.class);
        daoCliente = DaoManager.createDao(connection, Cliente.class);
        daoPadecimiento = DaoManager.createDao(connection, Padecimiento.class);
    }

    public void setCliente(Cliente c) {
        try {
            daoCliente.createOrUpdate(c);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void setSeguimiento(Seguimiento seg) {
        try {
            daoSeguimiento.createOrUpdate(seg);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void deleteCliente(String id_cliente) {
        try {
            daoCliente.deleteById(id_cliente);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void setPadecimiento(Padecimiento p) {
        try {
            daoPadecimiento.createOrUpdate(p);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Cliente getCliente(String id_cliente) {
        Cliente c = null;
        try {
            c = daoCliente.queryForId(id_cliente);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return c;
    }

    public List<Seguimiento> getSeguimientos(String id_cliente) {
        List<Seguimiento> list = null;
        try {
            list = daoSeguimiento.queryForEq("id_cliente", id_cliente);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }

    public Padecimiento getPadecimiento(String id_cliente) {
        Padecimiento p = null;
        try {
            p = daoPadecimiento.queryForId(id_cliente);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return p;
    }

    public String[] RecuperaAtributosCliente(String at) {//recupera datos como strings para llenar combobox
        String[] hash = null;
        try {
            switch (at) {
                case "E-mail":
                     hash = daoCliente.query(
                             daoCliente.queryBuilder().where().isNotNull("email").prepare()
                     ).stream().
                            map((a) -> {
                                return a.getEmail();
                            }).
                            toArray(String[]::new);
                    break;
                case "Nombre":
                   hash = daoCliente.query( daoCliente.queryBuilder().where().isNotNull("nombre").prepare() ).stream().
                            map((a) -> {
                                return a.getNombre();
                            }).
                            toArray(String[]::new);
                    break;
                case "Cedula":
                    hash = daoCliente.query( daoCliente.queryBuilder().where().isNotNull("id_cliente").prepare()).stream().
                            map((a) -> {
                                return a.getId_cliente();
                            }).
                            toArray(String[]::new);
                    break;
                default:
                    break;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return hash;
    }

    public void cerrarConexion() {
        try {
            connection.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
