/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.evaluacion.DAO;

import co.evaluacion.conexion.Conexion;
import co.evaluacion.excepciones.ExcepcionGeneral;
import co.evalucacion.modelo.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author Jorge Ramirez
 */
public class EmpleadoDAOImple implements EmpleadoDAO {
private final String INSERTAR ="INSERT INTO empleado (noDocumento, tipoDocumento, nombre, sueldo) VALUES (?,?,?,?)";
      private Connection conexion;
      private PreparedStatement sentencia;
      private ResultSet resultado;
    @Override
    public void insertar(Empleado o) {
        try{
           conexion =  new Conexion().getConnection();
           sentencia =  conexion.prepareStatement(INSERTAR, Statement.RETURN_GENERATED_KEYS);
           sentencia.setString(1, o.getNoDocumento());
           sentencia.setString(2, o.getTipoDocumento());
           sentencia.setString(3, o.getNombre());
           sentencia.setDouble(4, o.getSueldo());
           
           if(sentencia.executeUpdate()==0)
           {
               throw new ExcepcionGeneral("no se inserto ningun registro");
           }
           resultado = sentencia.getGeneratedKeys();
           if(resultado.next())
           {
               o.setId(resultado.getInt(1));
           }
       }catch (SQLException sqle)
       {
           throw new ExcepcionGeneral (sqle.getMessage());
       }
       finally{
           cerrarConexiones();
       }
        
    }
    private void cerrarConexiones(){
        try{
            if(resultado != null){
                resultado.close();
            }
            if(sentencia != null){
                sentencia.close();
            }
            if(conexion != null){
                conexion.close();
            }
        }catch(SQLException sqle)
        {
            
        }
    }    
    
    @Override
    public Empleado obtenerPorId(Integer k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Empleado> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
