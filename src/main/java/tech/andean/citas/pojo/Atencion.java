package tech.andean.citas.pojo;

public class Atencion {
    private int id;
    private int idReserva;
    private int idTriaje;
    private String diagnostico;
    private String horaAtencion;

	public Atencion() {
        this.id=0;
        this.idReserva=0;
        this.idTriaje=0;
        this.diagnostico="";
        this.horaAtencion="";
	}

	public Atencion(int id, int idReserva, int idTriaje, String diagnostico, String horaAtencion) {
		this.id = id;
		this.idReserva = idReserva;
		this.idTriaje = idTriaje;
		this.diagnostico = diagnostico;
		this.horaAtencion = horaAtencion;
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
	* Returns value of idReserva
	* @return
	*/
	public int getIdReserva() {
		return idReserva;
	}

	/**
	* Sets new value of idReserva
	* @param
	*/
	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	/**
	* Returns value of idTriaje
	* @return
	*/
	public int getIdTriaje() {
		return idTriaje;
	}

	/**
	* Sets new value of idTriaje
	* @param
	*/
	public void setIdTriaje(int idTriaje) {
		this.idTriaje = idTriaje;
	}

	/**
	* Returns value of diagnostico
	* @return
	*/
	public String getDiagnostico() {
		return diagnostico;
	}

	/**
	* Sets new value of diagnostico
	* @param
	*/
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	/**
	* Returns value of horaAtencion
	* @return
	*/
	public String getHoraAtencion() {
		return horaAtencion;
	}

	/**
	* Sets new value of horaAtencion
	* @param
	*/
	public void setHoraAtencion(String horaAtencion) {
		this.horaAtencion = horaAtencion;
	}
}
