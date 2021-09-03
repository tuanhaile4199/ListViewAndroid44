package com.example.thuchanh03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvProduct;
    List<Product> products;
    Product product01, product02, product03, product04, product05;
    AdapterProduct adapterProduct1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvProduct = findViewById(R.id.lvProduct);

        products = new ArrayList<>();

        product01 = new Product("Android 44","0123456789","tuanhaile@gmail.com",true);
        product02 = new Product("Android 45","0836303099","tuanhaile4199@gmail.com",false);
        product03 = new Product("Android 46","0987654321","tuanhaile99@gmail.com",true);
        product04 = new Product("Android 47","0834467879","tuanhaile4199@gmail.com",false);
        product05 = new Product("Android 48","0000457577","tuanhaile99@gmail.com",true);

        products.add(product01);
        products.add(product02);
        products.add(product03);
        products.add(product04);
        products.add(product05);

        adapterProduct1 = new AdapterProduct(products);
        lvProduct.setAdapter(adapterProduct1);
    }
}