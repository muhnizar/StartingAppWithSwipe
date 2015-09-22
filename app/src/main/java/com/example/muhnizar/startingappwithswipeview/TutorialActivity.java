package com.example.muhnizar.startingappwithswipeview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.muhnizar.shoppingCart.CatalogActivity;


public class TutorialActivity extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_tutorial_fragement, container, false);

        addButtonListener(rootView);

        return rootView;
    }

    public void addButtonListener(View rootView) {

        View imgButtonSimple =  rootView.findViewById(R.id.img_button_simple);
        View imgButtonShare =  rootView.findViewById(R.id.img_button_share);
        View imgButtonShopping =  rootView.findViewById(R.id.img_shopping_cart);


        imgButtonShopping.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CatalogActivity.class);
                startActivity(intent);
            }
        });

        imgButtonSimple.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SimpleMessageActivity.class);
                startActivity(intent);
            }
        });

        imgButtonShare.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CallIntentsActivity.class);
                startActivity(intent);
            }
        });
    }
}
