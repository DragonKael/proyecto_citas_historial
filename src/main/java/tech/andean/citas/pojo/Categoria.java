package tech.andean.citas.pojo;

public class Categoria {
    private int id;
    private String nombre;
    private String creadoEn;


	/**
	* Default empty Categoria constructor
	*/
	public Categoria() {
        this.id=0;
        this.nombre="";
        this.creadoEn="";
	}

	/**
	* Default Categoria constructor
	*/
	public Categoria(int id, String nombre, String creadoEn) {
		this.id = id;
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
