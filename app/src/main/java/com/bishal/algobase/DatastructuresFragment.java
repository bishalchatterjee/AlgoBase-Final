package com.bishal.algobase;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;


public class DatastructuresFragment extends Fragment {

    ImageView menu_iv;
    CardView ds_item_1,ds_item_2,ds_item_3,ds_item_4,ds_item_5,ds_item_6,ds_item_7,ds_item_8,ds_item_9,ds_item_10;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_datastructures, container, false);
        menu_iv=view.findViewById(R.id.menu_iv);


        //ds items linking
        ds_item_1=view.findViewById(R.id.ds_item_1);
        ds_item_2=view.findViewById(R.id.ds_item_2);
        ds_item_3=view.findViewById(R.id.ds_item_3);
        ds_item_4=view.findViewById(R.id.ds_item_4);
        ds_item_5=view.findViewById(R.id.ds_item_5);
        ds_item_6=view.findViewById(R.id.ds_item_6);
        ds_item_7=view.findViewById(R.id.ds_item_7);
        ds_item_8=view.findViewById(R.id.ds_item_8);
        ds_item_9=view.findViewById(R.id.ds_item_9);
        ds_item_10=view.findViewById(R.id.ds_item_10);


        menu_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), MenuActivity.class);
                startActivity(i);
            }
        });




        ds_item_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //replace the fragment layout to another frgment it info frag
                //use setter getter to pass layout id
                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "1");
                InformationFragment i=new InformationFragment();
                i.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout3,i).addToBackStack(null).commit();
            }
        });
        ds_item_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //replace the fragment layout to another frgment it info frag
                //use setter getter to pass layout id
                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "2");
                InformationFragment i=new InformationFragment();
                i.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout3,i).addToBackStack(null).commit();
            }
        });
        ds_item_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //replace the fragment layout to another frgment it info frag
                //use setter getter to pass layout id
                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "3");
                InformationFragment i=new InformationFragment();
                i.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout3,i).addToBackStack(null).commit();
            }
        });
        ds_item_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //replace the fragment layout to another frgment it info frag
                //use setter getter to pass layout id
                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "4");
                InformationFragment i=new InformationFragment();
                i.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout3,i).addToBackStack(null).commit();
            }
        });
        ds_item_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //replace the fragment layout to another frgment it info frag
                //use setter getter to pass layout id
                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "5");
                InformationFragment i=new InformationFragment();
                i.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout3,i).addToBackStack(null).commit();
            }
        });
        ds_item_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //replace the fragment layout to another frgment it info frag
                //use setter getter to pass layout id
                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "6");
                InformationFragment i=new InformationFragment();
                i.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout3,i).addToBackStack(null).commit();
            }
        });
        ds_item_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //replace the fragment layout to another frgment it info frag
                //use setter getter to pass layout id
                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "7");
                InformationFragment i=new InformationFragment();
                i.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout3,i).addToBackStack(null).commit();
            }
        });
        ds_item_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //replace the fragment layout to another frgment it info frag
                //use setter getter to pass layout id
                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "8");
                InformationFragment i=new InformationFragment();
                i.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout3,i).addToBackStack(null).commit();
            }
        });
        ds_item_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //replace the fragment layout to another frgment it info frag
                //use setter getter to pass layout id
                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "9");
                InformationFragment i=new InformationFragment();
                i.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout3,i).addToBackStack(null).commit();
            }
        });
        ds_item_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //replace the fragment layout to another frgment it info frag
                //use setter getter to pass layout id
                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "10");
                InformationFragment i=new InformationFragment();
                i.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout3,i).addToBackStack(null).commit();
            }
        });




        return view;
    }
}