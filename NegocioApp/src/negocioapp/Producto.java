package negocioapp;
//
//que almacene el nombre, descripción, id de producto
//(código de números y letras de 10 caracteres), precio, 
//si está de oferta (descuento) o no, el descuento a aplicar 
//(10% o 20%) y el IVA a aplicar (puede ser 4% o 21%). 
//

//ESTADO
public class Producto {
	String nombre;
	String descripcion;
	String idProducto;
	float precio;
	boolean oferta;
	static private int descuento10 = 10;
	static private int descuento20 = 20;
//CONSTRUCTOR
public Producto (String miNombre, String miDescripcion, String miIdProducto,float miPrecio,boolean miOferta) {
	miNombre = nombre;
	miDescripcion = descripcion;
	miIdProducto = idProducto;
	miPrecio = precio;
	miOferta = oferta;
}
 

//Metodo para aplicar el iva
public void calcularIva() {
	
	int iva;
	
	iva = precio/100*21;
}



//Metodo para aplicar un descuento
public void descuento(boolean descuento) {
	if (descuento) precio.aplicarDescuento();
	//multiplicamos el precio*0.20;

}

public void aplicarDescuento() {
	int 

	
}

}

