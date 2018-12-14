package work.dao;

import work.Util.JdbcUtil;
import work.Util.RowMap;
import work.pojo.Product;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ProductDAOimpl implements IProductDAO {
    @Override
    public List<Product> getLists() {
        return JdbcUtil.R("select * from product", new RowMap<Product>() {
            @Override
            public Product RowMapping(ResultSet rs) {
                //形参里有rs,所以得拿出他里面的对象出来,一个个提取
                Product p=new Product();
                try {
                    p.setProduct_id(rs.getInt("product_id"));
                    p.setProduct_name(rs.getString("product_name"));
                    p.setProduct_des(rs.getString("product_des"));
                    p.setUrl(rs.getString("url"));
                    p.setPrice(rs.getDouble("price"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return p;
            }
        }, null); //动态参数千万不能少,少写不会报错
    }

    @Override
    public int add(Product product) {
        return JdbcUtil.CUD("insert into product(product_name,price,product_des,url)values(?,?,?,?)",product.getProduct_name(),product.getPrice(),product.getProduct_des(),product.getUrl());
    }               //sql语句好好背背

    @Override
    public int delete(int id) {         //删除方法
        return JdbcUtil.CUD("delete from product where product_id=?",id);
    }

    @Override
    public Product getOnee(int id) {   //以id为删除条件
        return JdbcUtil.R("select * from product where product_id=? ", new RowMap<Product>() {
            @Override
            public Product RowMapping(ResultSet rs) {
                Product p=new Product();
                try {
                    p.setProduct_name(rs.getString("product_name"));
                    p.setProduct_des(rs.getString("product_des"));
                    p.setPrice(rs.getDouble("price"));
                    p.setUrl(rs.getString("url"));
                    p.setProduct_id(id);            //id值也一起获取进来
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return p;
            }
        }, id);
    }
}
