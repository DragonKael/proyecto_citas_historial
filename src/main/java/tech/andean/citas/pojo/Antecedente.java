package tech.andean.citas.pojo;

public class Antecedente {
    private int id;
    private String alergias;
    private String enfermedades;
    private String medicamentos;
    private String creadoEn;

    public Antecedente(){
        this.id=0;
        this.alergias="";
        this.enfermedades="";
        this.medicamentos="";
        this.creadoEn="";
    }

    public Antecedente(int id,String alergias,String enfermedades,String medicamentos,String creadoEn){
        this.id=id;
        this.alergias=alergias;
        this.enfermedades=enfermedades;
        this.medicamentos=medicamentos;
        this.creadoEn=creadoEn;
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
	* Returns value of alergias
	* @return
	*/
	public String getAlergias() {
		return alergias;
	}

	/**
	* Sets new value of alergias
	* @param
	*/
	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}

	/**
	* Returns value of enfermedades
	* @return
	*/
	public String getEnfermedades() {
		return enfermedades;
	}

	/**
	* Sets new value of enfermedades
	* @param
	*/
	public void setEnfermedades(String enfermedades) {
		this.enfermedades = enfermedades;
	}

	/**
	* Returns value of medicamentos
	* @return
	*/
	public String getMedicamentos() {
		return medicamentos;
	}

	/**
	* Sets new value of medicamentos
	* @param
	*/
	public void setMedicamentos(String medicamentos) {
		this.medicamentos = medicamentos;
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
