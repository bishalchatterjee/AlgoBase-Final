package com.bishal.algobase;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

public class AlgorithmsFragment extends Fragment {

    ImageView menu_iv;
    CardView algo_item_1,algo_item_2,algo_item_3,algo_item_4,algo_item_5,algo_item_6,algo_item_7,algo_item_8,algo_item_9;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_algorithms, container, false);
        menu_iv=view.findViewById(R.id.menu_iv);


        //algo items linking
        algo_item_1=view.findViewById(R.id.algo_item_1);
        algo_item_2=view.findViewById(R.id.algo_item_2);
        algo_item_3=view.findViewById(R.id.algo_item_3);
        algo_item_4=view.findViewById(R.id.algo_item_4);
        algo_item_5=view.findViewById(R.id.algo_item_5);
        algo_item_6=view.findViewById(R.id.algo_item_6);
        algo_item_7=view.findViewById(R.id.algo_item_7);
        algo_item_8=view.findViewById(R.id.algo_item_8);
        algo_item_9=view.findViewById(R.id.algo_item_9);

        menu_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), MenuActivity.class);
                startActivity(i);
            }
        });

        algo_item_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //replace the fragment layout to another frgment it info frag
                //use setter getter to pass layout id
                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "11");
                InformationFragment i=new InformationFragment();
                i.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout5,i).addToBackStack(null).commit();
            }
        });
        algo_item_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //replace the fragment layout to another frgment it info frag
                //use setter getter to pass layout id
                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "12");
                InformationFragment i=new InformationFragment();
                i.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout5,i).addToBackStack(null).commit();
            }
        });
        algo_item_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //replace the fragment layout to another frgment it info frag
                //use setter getter to pass layout id
                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "13");
                InformationFragment i=new InformationFragment();
                i.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout5,i).addToBackStack(null).commit();
            }
        });
        algo_item_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //replace the fragment layout to another frgment it info frag
                //use setter getter to pass layout id
                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "14");
                InformationFragment i=new InformationFragment();
                i.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout5,i).addToBackStack(null).commit();
            }
        });
        algo_item_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //replace the fragment layout to another frgment it info frag
                //use setter getter to pass layout id
                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "15");
                InformationFragment i=new InformationFragment();
                i.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout5,i).addToBackStack(null).commit();
            }
        });
        algo_item_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //replace the fragment layout to another frgment it info frag
                //use setter getter to pass layout id
                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "16");
                InformationFragment i=new InformationFragment();
                i.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout5,i).addToBackStack(null).commit();
            }
        });
        algo_item_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //replace the fragment layout to another frgment it info frag
                //use setter getter to pass layout id
                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "17");
                InformationFragment i=new InformationFragment();
                i.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout5,i).addToBackStack(null).commit();
            }
        });
        algo_item_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //replace the fragment layout to another frgment it info frag
                //use setter getter to pass layout id
                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "18");
                InformationFragment i=new InformationFragment();
                i.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout5,i).addToBackStack(null).commit();
            }
        });
        algo_item_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //replace the fragment layout to another frgment it info frag
                //use setter getter to pass layout id
                Bundle bundle = new Bundle();
                bundle.putString("YourKey", "19");
                InformationFragment i=new InformationFragment();
                i.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frame_layout5,i).addToBackStack(null).commit();
            }
        });

        return view;
    }
}