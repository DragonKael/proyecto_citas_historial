package tech.andean.citas.pojo;

public class Medico {
    private int id;
    private int idEspecialidad;
    private String codPersonal;
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private String genero;
    private String fechaNacimiento;
    private String email;
    private String direccion;
    private String telefono;
    private String imagen;
    private String creadoEn;
    private boolean activo;



	/**
	* Default empty Medico constructor
	*/
	public Medico() {
        this.id = 0;
        this.idEspecialidad = 0;
        this.codPersonal = "";
        this.nombre = "";
        this.apPaterno = "";
        this.apMaterno = "";
        this.genero = "";
        this.fechaNacimiento = "";
        this.email = "";
        this.direccion = "";
        this.telefono = "";
        this.imagen = "";
        this.creadoEn = "";
        this.activo = true;
	}

	/**
	* Default Medico constructor
	*/
	public Medico(int id, int idEspecialidad, String codPersonal, String nombre, String apPaterno, String apMaterno, String genero, String fechaNacimiento, String email, String direccion, String telefono, String imagen, String creadoEn, boolean activo) {
		this.id = id;
		this.idEspecialidad = idEspecialidad;
		this.codPersonal = codPersonal;
		this.nombre = nombre;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
		this.genero = genero;
		this.fechaNacimiento = fechaNacimiento;
		this.email = email;
		this.direccion = direccion;
		this.telefono = telefono;
		this.imagen = imagen;
		this.creadoEn = creadoEn;
		this.activo = activo;
	}


	/**
	* Returns value of id
	* @return
	*/
	public int getId() {
		return id;
	}

	/**
	* Sets new value of id
	* @param
	*/
	public void setId(int id) {
		this.id = id;
	}

	/**
	* Returns value of idEspecialidad
	* @return
	*/
	public int getIdEspecialidad() {
		return idEspecialidad;
	}

	/**
	* Sets new value of idEspecialidad
	* @param
	*/
	public void setIdEspecialidad(int idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	/**
	* Returns value of codPersonal
	* @return
	*/
	public String getCodPersonal() {
		return codPersonal;
	}

	/**
	* Sets new value of codPersonal
	* @param
	*/
	public void setCodPersonal(String codPersonal) {
		this.codPersonal = codPersonal;
	}

	/**
	* Returns value of nombre
	* @return
	*/
	public String getNombre() {
		return nombre;
	}

	/**
	* Sets new value of nombre
	* @param
	*/
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	* Returns value of apPaterno
	* @return
	*/
	public String getApPaterno() {
		return apPaterno;
	}

	/**
	* Sets new value of apPaterno
	* @param
	*/
	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}

	/**
	* Returns value of apMaterno
	* @return
	*/
	public String getApMaterno() {
		return apMaterno;
	}

	/**
	* Sets new value of apMaterno
	* @param
	*/
	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}

	/**
	* Returns value of genero
	* @return
	*/
	public String getGenero() {
		return genero;
	}

	/**
	* Sets new value of genero
	* @param
	*/
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	* Returns value of fechaNacimiento
	* @return
	*/
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	* Sets new value of fechaNacimiento
	* @param
	*/
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	* Returns value of email
	* @return
	*/
	public String getEmail() {
		return email;
	}

	/**
	* Sets new value of email
	* @param
	*/
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	* Returns value of direccion
	* @return
	*/
	public String getDireccion() {
		return direccion;
	}

	/**
	* Sets new value of direccion
	* @param
	*/
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	* Returns value of telefono
	* @return
	*/
	public String getTelefono() {
		return telefono;
	}

	/**
	* Sets new value of telefono
	* @param
	*/
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	* Returns value of imagen
	* @return
	*/
	public String getImagen() {
		return imagen;
	}

	/**
	* Sets new value of imagen
	* @param
	*/
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	/**
	* Returns value of creadoEn
	* @return
	*/
	public String getCreadoEn() {
		return creadoEn;
	}

	/**
	* Sets new value of creadoEn
	* @param
	*/
	public void setCreadoEn(String creadoEn) {
		this.creadoEn = creadoEn;
	}

	/**
	* Returns value of activo
	* @return
	*/
	public boolean isActivo() {
		return activo;
	}

	/**
	* Sets new value of activo
	* @param
	*/
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
}
