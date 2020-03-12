package tech.andean.citas.pojo;

public class Receta {
    private int id;
    private int idAtencion;
    private boolean interno;
    private String tiempoTratamiento;


	/**
	* Default empty Receta constructor
	*/
	public Receta() {
        this.id = 0;
        this.idAtencion = 0;
        this.interno = true;
        this.tiempoTratamiento = "";
	}

	/**
	* Default Receta constructor
	*/
	public Receta(int id, int idAtencion, boolean interno, String tiempoTratamiento) {
		this.id = id;
		this.idAtencion = idAtencion;
		this.interno = interno;
		this.tiempoTratamiento = tiempoTratamiento;
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
	* Returns value of idAtencion
	* @return
	*/
	public int getIdAtencion() {
		return idAtencion;
	}

	/**
	* Sets new value of idAtencion
	* @param
	*/
	public void setIdAtencion(int idAtencion) {
		this.idAtencion = idAtencion;
	}

	/**
	* Returns value of interno
	* @return
	*/
	public boolean isInterno() {
		return interno;
	}

	/**
	* Sets new value of interno
	* @param
	*/
	public void setInterno(boolean interno) {
		this.interno = interno;
	}

	/**
	* Returns value of tiempoTratamiento
	* @return
	*/
	public String getTiempoTratamiento() {
		return tiempoTratamiento;
	}

	/**
	* Sets new value of tiempoTratamiento
	* @param
	*/
	public void setTiempoTratamiento(String tiempoTratamiento) {
		this.tiempoTratamiento = tiempoTratamiento;
	}
}
