package tech.andean.citas.pojo;

public class Laboratorio {
    private int id;
    private int aforo;
    private String nombre;
    private String descripcion;
    private String creadoEn;


	/**
	* Default empty Laboratorio constructor
	*/
	public Laboratorio() {
        this.id = 0;
        this.aforo = 0;
        this.nombre = "";
        this.descripcion = "";
        this.creadoEn = "";
	}

	/**
	* Default Laboratorio constructor
	*/
	public Laboratorio(int id, int aforo, String nombre, String descripcion, String creadoEn) {
		this.id = id;
		this.aforo = aforo;
		this.nombre = nombre;
		this.descripcion = descripcion;
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
	* Returns value of aforo
	* @return
	*/
	public int getAforo() {
		return aforo;
	}

	/**
	* Sets new value of aforo
	* @param
	*/
	public void setAforo(int aforo) {
		this.aforo = aforo;
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
	* Returns value of descripcion
	* @return
	*/
	public String getDescripcion() {
		return descripcion;
	}

	/**
	* Sets new value of descripcion
	* @param
	*/
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
