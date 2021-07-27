package tlacuariders.mx.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rodadas")
public class RodadasModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private int id;
	
	@Column(nullable = false)
	private int usuario_id;
	
	@Column(nullable = false, length = 255)
	private String nombre;
	
	@Column(nullable = false, length = 255)
	private String descripcion;
	
	@Column(nullable = false)
	private int condicion;
	
	@Column(nullable = false, length = 255)
	private String direccion_inicio;
	
	@Column(nullable = false, length = 255)
	private String direccion_fin;
	
	@Column(nullable = false)
	private String hora_encuentro;
	
	@Column(nullable = false)
	private int bicis;
	
	@Column(nullable = false)
	private int compania;
	
	@Column(nullable = false)
	private int usuarios_confirmados;
	
	@Column(nullable = false)
	private int usuarios_interesados;
	
	@Column(nullable = false)
	private int turno;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(int usuario_id) {
		this.usuario_id = usuario_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCondicion() {
		return condicion;
	}

	public void setCondicion(int condicion) {
		this.condicion = condicion;
	}

	public String getDireccion_inicio() {
		return direccion_inicio;
	}

	public void setDireccion_inicio(String direccion_inicio) {
		this.direccion_inicio = direccion_inicio;
	}

	public String getDireccion_fin() {
		return direccion_fin;
	}

	public void setDireccion_fin(String direccion_fin) {
		this.direccion_fin = direccion_fin;
	}

	public String getHora_encuentro() {
		return hora_encuentro;
	}

	public void setHora_encuentro(String hora_encuentro) {
		this.hora_encuentro = hora_encuentro;
	}

	public int getBicis() {
		return bicis;
	}

	public void setBicis(int bicis) {
		this.bicis = bicis;
	}

	public int getCompania() {
		return compania;
	}

	public void setCompania(int compania) {
		this.compania = compania;
	}

	public int getUsuarios_confirmados() {
		return usuarios_confirmados;
	}

	public void setUsuarios_confirmados(int usuarios_confirmados) {
		this.usuarios_confirmados = usuarios_confirmados;
	}

	public int getUsuarios_interesados() {
		return usuarios_interesados;
	}

	public void setUsuarios_interesados(int usuarios_interesados) {
		this.usuarios_interesados = usuarios_interesados;
	}

	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}
	
	
}
