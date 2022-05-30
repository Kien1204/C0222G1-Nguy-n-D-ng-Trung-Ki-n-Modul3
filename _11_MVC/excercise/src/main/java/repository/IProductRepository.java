package repository;

import model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();
    Product findById(int id);
    void add(Product product);
    void update ( int id,Product product);
    void delete(int id);
}
