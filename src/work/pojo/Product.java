package work.pojo;

public class Product {
    private Integer product_id;
    private String  product_name;
    private String  product_des;
    private String  url;
    private double  price;

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_des() {
        return product_des;
    }

    public void setProduct_des(String product_des) {
        this.product_des = product_des;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "IProductDAO{" +
                "product_id=" + product_id +
                ", product_name='" + product_name + '\'' +
                ", product_des='" + product_des + '\'' +
                ", url='" + url + '\'' +
                ", price=" + price +
                '}';
    }

    public Product(Integer product_id, String product_name, String product_des, String url, double price) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_des = product_des;
        this.url = url;
        this.price = price;
    }

    public Product() {
    }
}


