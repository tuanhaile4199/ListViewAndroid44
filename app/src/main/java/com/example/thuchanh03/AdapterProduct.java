package com.example.thuchanh03;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterProduct extends BaseAdapter {

    List<Product> products;

    public AdapterProduct(List<Product> products) {
        this.products = products;
    }

    @Override
    public int getCount() {
        return products.size();
    }

    @Override
    public Object getItem(int i) {
        return products.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view1 = layoutInflater.inflate(R.layout.item_product,viewGroup,false);

        TextView tvName = view1.findViewById(R.id.tvName);
        TextView tvPhoneNumber = view1.findViewById(R.id.tvPhoneNumber);
        ImageView imgView = view1.findViewById(R.id.imgLauncher);


        Product product = products.get(i);

        tvName.setText(product.getName());
        tvPhoneNumber.setText(product.getNumberPhone());
        if(product.isAvataUser()) imgView.setVisibility(View.VISIBLE);
        else imgView.setVisibility(View.GONE);

        return view1;
    }
}
