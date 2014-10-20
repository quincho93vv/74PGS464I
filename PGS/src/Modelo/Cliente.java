package Modelo;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Cliente")
public class Cliente {
@DatabaseField
    private double altura;
    @DatabaseField
    private String nombre;
    @DatabaseField(id = true)
    private String id_cliente;
    @ForeignCollectionField
    private ForeignCollection<Seguimiento> seguimientos;
    @DatabaseField
    private String nacimiento;
    @DatabaseField
    private String direccion;
    @DatabaseField
    private String ocupacion;
    @DatabaseField
    private String telefono_habitacion;
    @DatabaseField
    private String celular;
    @DatabaseField
    private String telefono_trabajo;
    @DatabaseField
    private String telefono_emergencia;
    @DatabaseField
    private String email;
    @DatabaseField
    private String tipo_sangre;
    @DatabaseField
    private String condi_fisico;
    @DatabaseField
    private String estado_salud;
    @DatabaseField
    private String aval_medico;
    @DatabaseField
    private String info_del_medico;

    public Cliente() {
    }

    public Cliente(String nombre, String id_cliente, String nacimiento, String direccion, String ocupacion,
            String telefono_habitacion, String celular, String telefono_trabajo, String telefono_emergencia,
            String email, String tipo_sangre, String condi_fisico, String estado_salud, String aval_medico,
            String info_del_medico, Double altura) {
        this.nombre = nombre;
          this.altura= altura;
        this.id_cliente = id_cliente;
        this.nacimiento = nacimiento;
        this.direccion = direccion;
        this.ocupacion = ocupacion;
        this.telefono_habitacion = telefono_habitacion;
        this.celular = celular;
        this.telefono_trabajo = telefono_trabajo;
        this.telefono_emergencia = telefono_emergencia;
        this.email = email;
        this.tipo_sangre = tipo_sangre;
        this.condi_fisico = condi_fisico;
        this.estado_salud = estado_salud;
        this.aval_medico = aval_medico;
        this.info_del_medico = info_del_medico;
    }

    public double getAltura() {
        return altura;
    }

    public ForeignCollection<Seguimiento> getSeguimientos() {
        return seguimientos;
    }

    public void setDatosCliente(String name, String id_cliente) {
        this.nombre = name;
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String name) {
        this.nombre = name;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getTelefono_habitacion() {
        return telefono_habitacion;
    }

    public void setTelefono_habitacion(String telefono_habitacion) {
        this.telefono_habitacion = telefono_habitacion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefono_trabajo() {
        return telefono_trabajo;
    }

    public void setTelefono_trabajo(String telefono_trabajo) {
        this.telefono_trabajo = telefono_trabajo;
    }

    public String getTelefono_emergencia() {
        return telefono_emergencia;
    }

    public void setTelefono_emergencia(String telefono_emergencia) {
        this.telefono_emergencia = telefono_emergencia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }

    public String getCondi_fisico() {
        return condi_fisico;
    }

    public void setCondi_fisico(String condi_fisico) {
        this.condi_fisico = condi_fisico;
    }

    public String getEstado_salud() {
        return estado_salud;
    }

    public void setEstado_salud(String estado_salud) {
        this.estado_salud = estado_salud;
    }

    public String getAval_medico() {
        return aval_medico;
    }

    public void setAval_medico(String aval_medico) {
        this.aval_medico = aval_medico;
    }

    public String getInfo_del_medico() {
        return info_del_medico;
    }

    public void setInfo_del_medico(String info_del_medico) {
        this.info_del_medico = info_del_medico;
    }

    @Override
    public String toString() {
        return "Cliente{" + "altura=" + altura + ", nombre=" + nombre +
                ", id_cliente=" + id_cliente + ", nacimiento=" + nacimiento + 
                ", direccion=" + direccion + ", ocupacion=" + ocupacion +
                ", telefono_habitacion=" + telefono_habitacion + ", celular=" + 
                celular + ", telefono_trabajo=" + telefono_trabajo +
                ", telefono_emergencia=" + telefono_emergencia + ", email=" + email +
                ", tipo_sangre=" + tipo_sangre + ", condi_fisico=" + condi_fisico + ", estado_salud=" + 
                estado_salud + ", aval_medico=" + aval_medico + ", info_del_medico=" + info_del_medico + '}';
    }
    
    
}
