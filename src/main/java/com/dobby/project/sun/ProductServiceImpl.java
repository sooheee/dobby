package com.dobby.project.sun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

   @Autowired
   private ProductDao productDao;


    @Override
    public List<ProductDto> getMainProducts() {
        return productDao.getMainProducts();
    }

    @Override
    public List<ProductDCDto> Products_DC() throws Exception {
        return productDao.Products_DC();
    }

    @Override
    public List<ProductDto> getSkincareProducts() {
        return productDao.getSkincareProducts();
    }

    @Override
    public List<ProductDto> getMakeupProducts() {
        return productDao.getMakeupProducts();
    }

    @Override
    public List<ProductDto> getMenProducts() {
        return productDao.getMenProducts();
    }

    @Override
    public List<ProductDto> getHairBodyProducts() {
        return productDao.getHairBodyProducts();
    }
}
