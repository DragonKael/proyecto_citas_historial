package tech.andean.citas.pojo;

public class Medicamento {
    private int id;
    private String nombre;
    private String tipo;
    private String medio;
    private String unidadMedida;
    private String descripcion;


	/**
	* Default empty Medicamento constructor
	*/
	public Medicamento() {
        this.id = 0;
        this.nombre = "";
        this.tipo = "";
        this.medio = "";
        this.unidadMedida = "";
        this.descripcion = "";
	}

	/**
	* Default Medicamento constructor
	*/
	public Medicamento(int id, String nombre, String tipo, String medio, String unidadMedida, String descripcion) {
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.medio = medio;
		this.unidadMedida = unidadMedida;
		this.descripcion = descripcion;
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
	* Returns value of tipo
	* @return
	*/
	public String getTipo() {
		return tipo;
	}

	/**
	* Sets new value of tipo
	* @param
	*/
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	* Returns value of medio
	* @return
	*/
	public String getMedio() {
		return medio;
	}

	/**
	* Sets new value of medio
	* @param
	*/
	public void setMedio(String medio) {
		this.medio = medio;
	}

	/**
	* Returns value of unidadMedida
	* @return
	*/
	public String getUnidadMedida() {
		return unidadMedida;
	}

	/**
	* Sets new value of unidadMedida
	* @param
	*/
	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
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
}
