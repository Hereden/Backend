package tlacuariders.mx.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pedidos")
public class PedidosModel {
	@Id
	@Column(nullable = false)
	private int id;
	
	@Column(nullable = false)
	private int num_pedido;
	
	@Column(nullable = false)
	private int articulo_id;
	
	@Column(nullable = false)
	private int cantidad;
	
	@Column(nullable = false)
	private float precio_total;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNum_pedido() {
		return num_pedido;
	}

	public void setNum_pedido(int num_pedido) {
		this.num_pedido = num_pedido;
	}

	public int getArticulo_id() {
		return articulo_id;
	}

	public void setArticulo_id(int articulo_id) {
		this.articulo_id = articulo_id;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getPrecio_total() {
		return precio_total;
	}

	public void setPrecio_total(float precio_total) {
		this.precio_total = precio_total;
	}
	
	
}
