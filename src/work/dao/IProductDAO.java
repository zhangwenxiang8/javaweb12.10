package work.dao;

import work.pojo.Product;

import java.util.List;

public interface IProductDAO {
    public List<Product> getLists();
    public int add(Product product);
    public int delete(int id);
    public Product getOne(int id);
}
