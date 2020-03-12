package tech.andean.citas.pojo;

public class Historia {
    private int id;
    private int idPaciente;
    private int idUsuario;
    private int idAntecedente;
    private String nombreClinica;
    private String creadoEn;



	/**
	* Default empty Historia constructor
	*/
	public Historia() {
        this.id = id;
		this.idPaciente = 0;
		this.idUsuario = 0;
		this.idAntecedente = 0;
		this.nombreClinica = "";
		this.creadoEn = "";
	}

	/**
	* Default Historia constructor
	*/
	public Historia(int id, int idPaciente, int idUsuario, int idAntecedente, String nombreClinica, String creadoEn) {
		super();
		this.id = id;
		this.idPaciente = idPaciente;
		this.idUsuario = idUsuario;
		this.idAntecedente = idAntecedente;
		this.nombreClinica = nombreClinica;
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
	* Returns value of idPaciente
	* @return
	*/
	public int getIdPaciente() {
		return idPaciente;
	}

	/**
	* Sets new value of idPaciente
	* @param
	*/
	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	/**
	* Returns value of idUsuario
	* @return
	*/
	public int getIdUsuario() {
		return idUsuario;
	}

	/**
	* Sets new value of idUsuario
	* @param
	*/
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	/**
	* Returns value of idAntecedente
	* @return
	*/
	public int getIdAntecedente() {
		return idAntecedente;
	}

	/**
	* Sets new value of idAntecedente
	* @param
	*/
	public void setIdAntecedente(int idAntecedente) {
		this.idAntecedente = idAntecedente;
	}

	/**
	* Returns value of nombreClinica
	* @return
	*/
	public String getNombreClinica() {
		return nombreClinica;
	}

	/**
	* Sets new value of nombreClinica
	* @param
	*/
	public void setNombreClinica(String nombreClinica) {
		this.nombreClinica = nombreClinica;
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
