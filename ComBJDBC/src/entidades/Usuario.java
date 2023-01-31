
package entidades;

public class Usuario {
   private Integer clave;
   private String nombre;
   private String mail;
   private Integer edad;

    public Usuario() {
    }

    public Usuario(Integer clave, String nombre, String mail, Integer edad) {
        this.clave = clave;
        this.nombre = nombre;
        this.mail = mail;
        this.edad = edad;
    }

    public Integer getClave() {
        return clave;
    }

    public void setClave(Integer clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuario{" + "clave=" + clave + ", nombre=" + nombre + ", mail=" + mail + ", edad=" + edad + '}';
    }
   
   
}
