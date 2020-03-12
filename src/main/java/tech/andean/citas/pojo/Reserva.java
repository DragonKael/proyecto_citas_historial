package tech.andean.citas.pojo;

public class Reserva {
    private int id;
    private int idMedico;
    private int idUsuario;
    private int idHistoria;
    private int idEspecialidad;
    private String titulo;
    private String nota;
    private String mensaje;
    private String fechaCita;
    private String horaCita;
    private String creadoEn;
    private String estado;
    private String pago;
    private double precio;
    private boolean enWeb;


	/**
	* Default empty Reserva constructor
	*/
	public Reserva() {
        this.id = 0;
        this.idMedico = 0;
        this.idUsuario = 0;
        this.idHistoria = 0;
        this.idEspecialidad = 0;
        this.titulo = "";
        this.nota = "";
        this.mensaje = "";
        this.fechaCita = "";
        this.horaCita = "";
        this.creadoEn = "";
        this.estado = "";
        this.pago = "";
        this.precio = 0;
        this.enWeb = false;
	}

	/**
	* Default Reserva constructor
	*/
	public Reserva(int id, int idMedico, int idUsuario, int idHistoria, int idEspecialidad, String titulo, String nota, String mensaje, String fechaCita, String horaCita, String creadoEn, String estaod, String pago, double precio, boolean enWeb) {
		this.id = id;
		this.idMedico = idMedico;
		this.idUsuario = idUsuario;
		this.idHistoria = idHistoria;
		this.idEspecialidad = idEspecialidad;
		this.titulo = titulo;
		this.nota = nota;
		this.mensaje = mensaje;
		this.fechaCita = fechaCita;
		this.horaCita = horaCita;
		this.creadoEn = creadoEn;
		this.estado = estaod;
		this.pago = pago;
		this.precio = precio;
		this.enWeb = enWeb;
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
	* Returns value of idMedico
	* @return
	*/
	public int getIdMedico() {
		return idMedico;
	}

	/**
	* Sets new value of idMedico
	* @param
	*/
	public void setIdMedico(int idMedico) {
		this.idMedico = idMedico;
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
	* Returns value of idHistoria
	* @return
	*/
	public int getIdHistoria() {
		return idHistoria;
	}

	/**
	* Sets new value of idHistoria
	* @param
	*/
	public void setIdHistoria(int idHistoria) {
		this.idHistoria = idHistoria;
	}

	/**
	* Returns value of idEspecialidad
	* @return
	*/
	public int getIdEspecialidad() {
		return idEspecialidad;
	}

	/**
	* Sets new value of idEspecialidad
	* @param
	*/
	public void setIdEspecialidad(int idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	/**
	* Returns value of titulo
	* @return
	*/
	public String getTitulo() {
		return titulo;
	}

	/**
	* Sets new value of titulo
	* @param
	*/
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	* Returns value of nota
	* @return
	*/
	public String getNota() {
		return nota;
	}

	/**
	* Sets new value of nota
	* @param
	*/
	public void setNota(String nota) {
		this.nota = nota;
	}

	/**
	* Returns value of mensaje
	* @return
	*/
	public String getMensaje() {
		return mensaje;
	}

	/**
	* Sets new value of mensaje
	* @param
	*/
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	/**
	* Returns value of fechaCita
	* @return
	*/
	public String getFechaCita() {
		return fechaCita;
	}

	/**
	* Sets new value of fechaCita
	* @param
	*/
	public void setFechaCita(String fechaCita) {
		this.fechaCita = fechaCita;
	}

	/**
	* Returns value of horaCita
	* @return
	*/
	public String getHoraCita() {
		return horaCita;
	}

	/**
	* Sets new value of horaCita
	* @param
	*/
	public void setHoraCita(String horaCita) {
		this.horaCita = horaCita;
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

	/**
	* Returns value of estado
	* @return
	*/
	public String getEstado() {
		return estado;
	}

	/**
	* Sets new value of estado
	* @param
	*/
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	* Returns value of pago
	* @return
	*/
	public String getPago() {
		return pago;
	}

	/**
	* Sets new value of pago
	* @param
	*/
	public void setPago(String pago) {
		this.pago = pago;
	}

	/**
	* Returns value of precio
	* @return
	*/
	public double getPrecio() {
		return precio;
	}

	/**
	* Sets new value of precio
	* @param
	*/
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	* Returns value of enWeb
	* @return
	*/
	public boolean isEnWeb() {
		return enWeb;
	}

	/**
	* Sets new value of enWeb
	* @param
	*/
	public void setEnWeb(boolean enWeb) {
		this.enWeb = enWeb;
	}
}
