package com.gatakalfzzah.consumer.network.models.response;

import com.gatakalfzzah.consumer.models.Image;
import com.gatakalfzzah.consumer.models.Vendor;

import java.io.Serializable;
import java.util.ArrayList;

public class VendorProduct implements Serializable {

private Integer id;
private Integer vendor_id;
private String name;
private String sku;
private String description;
private Integer price;
private Integer discount;
private Integer discounted_price;
private String delivery_period;
private String created_at;
private String updated_at;
private String featured_image;
private Vendor vendor;
private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    private int unit;

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public String getFeatured_image() {
        return featured_image;
    }

    public void setFeatured_image(String featured_image) {
        this.featured_image = featured_image;
    }

    private ArrayList<Image> image;

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getSku() {
return sku;
}

public void setSku(String sku) {
this.sku = sku;
}

public String getDescription() {
return description;
}

public void setDescription(String description) {
this.description = description;
}

public Integer getPrice() {
return price;
}

public void setPrice(Integer price) {
this.price = price;
}

public Integer getDiscount() {
return discount;
}

public void setDiscount(Integer discount) {
this.discount = discount;
}

    public Integer getVendor_id() {
        return vendor_id;
    }

    public void setVendor_id(Integer vendor_id) {
        this.vendor_id = vendor_id;
    }

    public Integer getDiscounted_price() {
        return discounted_price;
    }

    public void setDiscounted_price(Integer discounted_price) {
        this.discounted_price = discounted_price;
    }

    public String getDelivery_period() {
        return delivery_period;
    }

    public void setDelivery_period(String delivery_period) {
        this.delivery_period = delivery_period;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public ArrayList<Image> getImage() {
        return image;
    }

    public void setImage(ArrayList<Image> image) {
        this.image = image;
    }
}