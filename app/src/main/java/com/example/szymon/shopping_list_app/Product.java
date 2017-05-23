package com.example.szymon.shopping_list_app;

import java.io.Serializable;

/**
 * Created by Szymon on 11.04.2017.
 */

public class Product implements Serializable {

    private String _nameProduct;
    private int _quantityProduct;

    public Product(String nameProduct, int quantityProduct)
    {
        _nameProduct = nameProduct;
        _quantityProduct = quantityProduct;
    }

    public String getNameProduct(){ return _nameProduct; }
    public void setNameProduct(String nameProduct){ this._nameProduct = nameProduct; }

    public int getQuantityProduct(){ return _quantityProduct; }
    public void setQuantityProduct(int quantityProduct){ this._quantityProduct = quantityProduct; }


}
