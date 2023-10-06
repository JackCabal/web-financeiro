package dao;

import connection.Conexao;
import entities.ObjRegistro;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import model.DataModel;

public class RegistroDao {

    public ArrayList<ObjRegistro> list() throws SQLException {
        String sql = "SELECT *FROM Registro";
        Connection conexao = new Conexao().getConnection();
        PreparedStatement stmt = conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        DataModel dm = new DataModel();
        ArrayList<ObjRegistro> registros = new ArrayList();
        while (rs.next()) {
            Date data = rs.getDate("Data");
            LocalDate dateConverted = dm.convertDateForLocalDate(data);
            ObjRegistro registro = new ObjRegistro(rs.getInt("ID"), rs.getInt("CostCenter"), rs.getInt("Value"), rs.getInt("TypeCost"), dateConverted, rs.getString("Description"));
            registros.add(registro);
        }

        stmt.close();
        conexao.close();
        return registros;

    }
}
