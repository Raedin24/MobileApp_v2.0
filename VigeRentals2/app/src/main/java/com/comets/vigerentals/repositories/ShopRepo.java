package com.comets.vigerentals.repositories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.comets.vigerentals.models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ShopRepo {

    private MutableLiveData<List<Product>> mutableProductList;

    public LiveData<List<Product>> getProducts() {
        if (mutableProductList == null) {
            mutableProductList = new MutableLiveData<>();
            loadProducts();
        }
        return mutableProductList;
    }

    private void loadProducts() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(UUID.randomUUID().toString(), "Table", 10, true, "https://png.pngitem.com/pimgs/s/20-209859_transparent-96-png-cosco-6foot-folding-table-png.png", "This is a table. In case you've never used one, we recommend you try it out."));
        productList.add(new Product(UUID.randomUUID().toString(), "Chair", 3, true, "https://www.pngitem.com/pimgs/m/102-1025789_folding-chair-png-transparent-gray-plastic-folding-chair.png", "This is a chair. Generally designed to be sat on. Please do not lean back on them."));
        productList.add(new Product(UUID.randomUUID().toString(), "Canopy", 10, true, "https://png.pngitem.com/pimgs/s/227-2275204_canopy-hd-png-download.png", "This is a canopy. Used to provide shade. May be rendered useless in the event of rain or heavy winds."));
        productList.add(new Product(UUID.randomUUID().toString(), "Mattress", 15, true, "https://www.pngitem.com/pimgs/m/502-5028328_top-10-best-mattress-manufacturer-repose-spring-mattress.png", "This is a mattress. Proven to improve sleep quality by at least 80%. If you don't have one, you should get one. We'll even throw in a pillow."));
        mutableProductList.setValue(productList);
    }
}

