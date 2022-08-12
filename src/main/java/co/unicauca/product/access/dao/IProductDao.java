/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.unicauca.product.access.dao;

import co.unicauca.product.domain.entity.Product;
import org.springframework.data.repository.CrudRepository;

/**
* Interfaces DAO de productos
* @author bbohorquez
*
*/
public interface IProductDao extends CrudRepository<Product,Long>{
    
}
