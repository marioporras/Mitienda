package negocioapp;

import java.util.ArrayList;

public class Almacen {
	
private String productos;	
private ArrayList<String> ListaStock;


//CONSTRUCTOR
public Almacen (String misproductos) {
	
misproductos = productos;
ListaStock = new ArrayList<String>();
}

//metodo para añadir un producto a la lista
public void addProducto (String valor_productos) { ListaStock.add (valor_productos);}




}

