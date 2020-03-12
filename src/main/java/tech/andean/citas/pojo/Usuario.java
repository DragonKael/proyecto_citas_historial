package tech.andean.citas.pojo;

public class Usuario {
    private int id;
    private String nombreUsuario;
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private String email;
    private String clave;
    private String creadoEn;
    private boolean activo;
    private boolean administrador;


	/**
	* Default empty Usuario constructor
	*/
	public Usuario() {
        this.id = 0;
        this.nombreUsuario = "";
        this.nombre = "";
        this.apPaterno = "";
        this.apMaterno = "";
        this.email = "";
        this.clave = "";
        this.creadoEn = "";
        this.activo = true;
        this.administrador = false;
	}

	/**
	* Default Usuario constructor
	*/
	public Usuario(int id, String nombreUsuario, String nombre, String apPaterno, String apMaterno, String email, String clave, String creadoEn, boolean activo, boolean administrador) {
		this.id = id;
		this.nombreUsuario = nombreUsuario;
		this.nombre = nombre;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
		this.email = email;
		this.clave = clave;
		this.creadoEn = creadoEn;
		this.activo = activo;
		this.administrador = administrador;
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
	* Returns value of nombreUsuario
	* @return
	*/
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	/**
	* Sets new value of nombreUsuario
	* @param
	*/
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
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
	* Returns value of clave
	* @return
	*/
	public String getClave() {
		return clave;
	}

	/**
	* Sets new value of clave
	* @param
	*/
	public void setClave(String clave) {
		this.clave = clave;
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

	/**
	* Returns value of administrador
	* @return
	*/
	public boolean isAdministrador() {
		return administrador;
	}

	/**
	* Sets new value of administrador
	* @param
	*/
	public void setAdministrador(boolean administrador) {
		this.administrador = administrador;
	}
}
