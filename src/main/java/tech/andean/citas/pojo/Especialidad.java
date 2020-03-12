package tech.andean.citas.pojo;

public class Especialidad {
    private int id;
    private int idCategoria;
    private int idLaboratorio;
    private String nombre;
    private String creadoEn;


	/**
	* Default empty Especialidad constructor
	*/
	public Especialidad() {
        id=0;
        idCategoria=0;
        idLaboratorio=0;
        nombre="";
        creadoEn="";
	}

	/**
	* Default Especialidad constructor
	*/
	public Especialidad(int id, int idCategoria, int idLaboratorio, String nombre, String creadoEn) {
		this.id = id;
		this.idCategoria = idCategoria;
		this.idLaboratorio = idLaboratorio;
		this.nombre = nombre;
		this.creadoEn = creadoEn;
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
	* Returns value of idCategoria
	* @return
	*/
	public int getIdCategoria() {
		return idCategoria;
	}

	/**
	* Sets new value of idCategoria
	* @param
	*/
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	/**
	* Returns value of idLaboratorio
	* @return
	*/
	public int getIdLaboratorio() {
		return idLaboratorio;
	}

	/**
	* Sets new value of idLaboratorio
	* @param
	*/
	public void setIdLaboratorio(int idLaboratorio) {
		this.idLaboratorio = idLaboratorio;
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
}
