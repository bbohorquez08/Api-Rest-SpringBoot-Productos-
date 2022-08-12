/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.product.domain.service;

import co.unicauca.product.access.dao.IProductDao;
import co.unicauca.product.domain.entity.Product;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* Implementación de la Interfaz IProductService
*
* @author bbohorquez
*
*/

@Service
public class ProductImplService implements IProductService {
    
    /**
     * Inyección de producto Dao
     * 
     */
    @Autowired
    private IProductDao productDao;
    
    /**
     * Servicio para buscar todos los productos
     *
     * @return Listado de productos
     */
    @Override
    @Transactional(readOnly = true) // Para que esté sincronizada con la bd
    public List<Product> findAll() {
        return (List<Product>) productDao.findAll();
    }

    /**
     * Busca un producto por su Id
     *
     * @param id identificador del producto
     * @return objeto de tipo producto
     */
    @Override // Para que esté sincronizada con la bd
    public Product findById(Long id) {
        Product prod = productDao.findById(id).orElse(null);
        return prod;
    }

    /**
     * Crea un nuevo producto
     *
     * @param product producto a crear en la bd
     * @return Producto creado
     */
    @Override
    @Transactional
    public Product create(Product product) {
        return productDao.save(product);
    }

    /**
     * Modifica o edita un producto
     *
     * @param id, identificador del producto a modificar
     * @param product producto con los datos a editar
     * @return Producto modificado
     */
    @Override
    @Transactional
    public Product update(Long id, Product product) {
        Product prod = this.findById(id);
        prod.setName(product.getName());
        prod.setPrice(product.getPrice());
        return productDao.save(prod);
    }

    /**
     * Eliminar producto por su id
     *
     * @param id identificador del producto a eliminar
     */
    @Override
    @Transactional
    public void deleteById(Long id) {
        productDao.deleteById(id);
    }
    
}
