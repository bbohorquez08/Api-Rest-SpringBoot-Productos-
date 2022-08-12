/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.unicauca.product.domain.service;

import co.unicauca.product.domain.entity.Product;
import java.util.List;


/**
* Interfaz de operaciones de la bd de productos
*
* @author bbohorquez
*
*/
public interface IProductService {
    public List<Product> findAll();

    public Product findById(Long id);

    public Product create(Product product);

    public Product update(Long id, Product product);

    public void deleteById(Long id);
}
