package org.example.persistencia;

import Modelo.Instrumento;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class InstruDao implements InterfazDao{
    public InstruDao() {
    }

    @Override
    public boolean insertar(Object obj) throws SQLException {
        String sqlInsert="INSERT INTO instrumentos(Nombre,Clasificacion,Tipo,Instrumentista,url) VALUES(?,?,?,?,?)";
        int rowCount=0;
        PreparedStatement pstm=ConexionSingleton.getInstance("instrumentos.db").getConnection().prepareStatement(sqlInsert);
        pstm.setString(1,((Instrumento)obj).getNombre());
        pstm.setString(2,((Instrumento)obj).getClasificacion());
        pstm.setString(3,((Instrumento)obj).getTipo());
        pstm.setString(4,((Instrumento)obj).getFamoso());
        pstm.setString(5,((Instrumento)obj).getUrl());
        rowCount= pstm.executeUpdate();
        return rowCount>0;
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate="UPDATE instrumentos SET Nombre=?,Clasificacion=?,Tipo=?,Instrumentista=?, url=? WHERE id=?;";
        int rowCount=0;
        PreparedStatement pstm=ConexionSingleton.getInstance("instrumentos.db").getConnection().prepareStatement(sqlUpdate);
        pstm.setString(1,((Instrumento)obj).getNombre());
        pstm.setString(2,((Instrumento)obj).getClasificacion());
        pstm.setString(3,((Instrumento)obj).getTipo());
        pstm.setString(4,((Instrumento)obj).getFamoso());
        pstm.setString(5,((Instrumento)obj).getUrl());
        pstm.setInt(6,((Instrumento)obj).getId());
        rowCount= pstm.executeUpdate();
        return rowCount>0;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        String sqlDelete="DELETE FROM instrumentos WHERE id=?;";
        int rowCout=0;
        PreparedStatement pstm= ConexionSingleton.getInstance("instrumentos.db").getConnection().prepareStatement(sqlDelete);
        pstm.setInt(1,Integer.parseInt(id));
        rowCout =pstm.executeUpdate();
        return rowCout>0;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sql ="SELECT * FROM instrumentos";
        ArrayList<Instrumento> resultado=new ArrayList<>();

        Statement stm=ConexionSingleton.getInstance("instrumentos.db").getConnection().createStatement();
        ResultSet rst= stm.executeQuery(sql);
        while (rst.next()){
            resultado.add(new Instrumento(rst.getInt(1), rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6)));

            return resultado;
        }
        return null;
    }

    @Override
    public Object buscarPorId(String id) throws SQLException {
        String sql ="SELECT * FROM libros WHERE id=?";
        Instrumento instrumento=null;

        PreparedStatement pstm = ConexionSingleton.getInstance("instrumentos.db").getConnection().prepareStatement(sql);
        pstm.setInt(1,Integer.parseInt(id));
        ResultSet rst= pstm.executeQuery();
        if (rst.next()) {
            instrumento = new Instrumento(rst.getInt(1), rst.getString(2), rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6));
            return instrumento;
        }
        return null;
    }
}
