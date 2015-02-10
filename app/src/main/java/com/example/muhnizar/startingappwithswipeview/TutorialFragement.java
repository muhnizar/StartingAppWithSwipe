package com.example.muhnizar.startingappwithswipeview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class TutorialFragement extends Fragment {

    TextView tView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_tutorial_fragement, container, false);

        tView = (TextView) rootView.findViewById(R.id.textView);
        addButtonListener(rootView);

        return rootView;
    }

    public void addButtonListener(View rootView) {

        View imgButton =  rootView.findViewById(R.id.img_button_nizar);
        View imgButtonSimple =  rootView.findViewById(R.id.img_button_simple);

        imgButtonSimple.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SimpleMessageActivity.class);
                startActivity(intent);
            }
        });

        imgButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (tView.getText().equals("Changeable")){
                    tView.setText("berubah BRO");
                }else tView.setText("Changeable");
            }
        });
    }
}
