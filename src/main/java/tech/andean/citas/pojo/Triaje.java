package tech.andean.citas.pojo;

public class Triaje {
    private int id;
    private double peso;
    private double talla;
    private double presionSanguinea;
    private String nivel;
    private String color;
    private String categoria;
    private String tiempoAtencion;
    private String detalles;


	/**
	* Default empty Triaje constructor
	*/
	public Triaje() {
        this.id = 0;
        this.peso = 0;
        this.talla = 0;
        this.presionSanguinea = 0;
        this.nivel = "";
        this.color = "";
        this.categoria = "";
        this.tiempoAtencion = "";
        this.detalles = "";
	}

	/**
	* Default Triaje constructor
	*/
	public Triaje(int id, double peso, double talla, double presionSanguinea, String nivel, String color, String categoria, String tiempoAtencion, String detalles) {
		this.id = id;
		this.peso = peso;
		this.talla = talla;
		this.presionSanguinea = presionSanguinea;
		this.nivel = nivel;
		this.color = color;
		this.categoria = categoria;
		this.tiempoAtencion = tiempoAtencion;
		this.detalles = detalles;
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
	* Returns value of peso
	* @return
	*/
	public double getPeso() {
		return peso;
	}

	/**
	* Sets new value of peso
	* @param
	*/
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	* Returns value of talla
	* @return
	*/
	public double getTalla() {
		return talla;
	}

	/**
	* Sets new value of talla
	* @param
	*/
	public void setTalla(double talla) {
		this.talla = talla;
	}

	/**
	* Returns value of presionSanguinea
	* @return
	*/
	public double getPresionSanguinea() {
		return presionSanguinea;
	}

	/**
	* Sets new value of presionSanguinea
	* @param
	*/
	public void setPresionSanguinea(double presionSanguinea) {
		this.presionSanguinea = presionSanguinea;
	}

	/**
	* Returns value of nivel
	* @return
	*/
	public String getNivel() {
		return nivel;
	}

	/**
	* Sets new value of nivel
	* @param
	*/
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	/**
	* Returns value of color
	* @return
	*/
	public String getColor() {
		return color;
	}

	/**
	* Sets new value of color
	* @param
	*/
	public void setColor(String color) {
		this.color = color;
	}

	/**
	* Returns value of categoria
	* @return
	*/
	public String getCategoria() {
		return categoria;
	}

	/**
	* Sets new value of categoria
	* @param
	*/
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	/**
	* Returns value of tiempoAtencion
	* @return
	*/
	public String getTiempoAtencion() {
		return tiempoAtencion;
	}

	/**
	* Sets new value of tiempoAtencion
	* @param
	*/
	public void setTiempoAtencion(String tiempoAtencion) {
		this.tiempoAtencion = tiempoAtencion;
	}

	/**
	* Returns value of detalles
	* @return
	*/
	public String getDetalles() {
		return detalles;
	}

	/**
	* Sets new value of detalles
	* @param
	*/
	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}
}
