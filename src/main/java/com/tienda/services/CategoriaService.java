
package com.tienda.services;

import com.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    //Se define la firma del metodo para obtener el ArrayList de 
    //registro de tabla categoria, el ArrayList tendra objetos
    //de tipo Categoria. pueden ser todos los registro o solo los 
    //activos
    public List<Categoria> getCategoria(boolean activos);
}
