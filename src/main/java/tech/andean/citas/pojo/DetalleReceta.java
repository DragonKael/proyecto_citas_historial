package tech.andean.citas.pojo;

public class DetalleReceta {
    private int id;
    private int cantidad;
    private int idMedicamento;
    private int idReceta;
    private String dosis;
    private String frecuencia;


	/**
	* Default empty DetalleReceta constructor
	*/
	public DetalleReceta() {
        id=0;
        cantidad=0;
        idMedicamento=0;
        idReceta=0;
        dosis="";
        frecuencia="";
	}

	/**
	* Default DetalleReceta constructor
	*/
	public DetalleReceta(int id, int cantidad, int idMedicamento, int idReceta, String dosis, String frecuencia) {
		this.id = id;
		this.cantidad = cantidad;
		this.idMedicamento = idMedicamento;
		this.idReceta = idReceta;
		this.dosis = dosis;
		this.frecuencia = frecuencia;
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
	* Returns value of cantidad
	* @return
	*/
	public int getCantidad() {
		return cantidad;
	}

	/**
	* Sets new value of cantidad
	* @param
	*/
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	/**
	* Returns value of idMedicamento
	* @return
	*/
	public int getIdMedicamento() {
		return idMedicamento;
	}

	/**
	* Sets new value of idMedicamento
	* @param
	*/
	public void setIdMedicamento(int idMedicamento) {
		this.idMedicamento = idMedicamento;
	}

	/**
	* Returns value of idReceta
	* @return
	*/
	public int getIdReceta() {
		return idReceta;
	}

	/**
	* Sets new value of idReceta
	* @param
	*/
	public void setIdReceta(int idReceta) {
		this.idReceta = idReceta;
	}

	/**
	* Returns value of dosis
	* @return
	*/
	public String getDosis() {
		return dosis;
	}

	/**
	* Sets new value of dosis
	* @param
	*/
	public void setDosis(String dosis) {
		this.dosis = dosis;
	}

	/**
	* Returns value of frecuencia
	* @return
	*/
	public String getFrecuencia() {
		return frecuencia;
	}

	/**
	* Sets new value of frecuencia
	* @param
	*/
	public void setFrecuencia(String frecuencia) {
		this.frecuencia = frecuencia;
	}
}
