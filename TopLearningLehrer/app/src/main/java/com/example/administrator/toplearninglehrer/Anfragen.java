package com.example.administrator.toplearninglehrer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * A simple {@link Fragment} subclass.
 */
public class Anfragen extends Fragment {


    public Anfragen() {
        // Required empty public constructor
    }


    private ListView lvs5;

    // Listview Adapter
    ArrayAdapter<String> adapter;

    // Search EditText
    EditText inputSearch;

    // ArrayList for Listview
    ArrayList<HashMap<String, String>> productList;
    // Required empty public constructor





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_anfragen, container, false);


        String termine111[] = {"Datum", "Datum", "Datum", "Datum", "Datum",
                "Datum", "Datum",
                "Samsung Galaxy S3", "MacBook Air", "Mac Mini", "MacBook Pro"};

        lvs5 = (ListView) view.findViewById(R.id.list_view);
        inputSearch = (EditText) view.findViewById(R.id.inputSearch);



        getActivity().setTitle("Anfragenliste");


        adapter = new ArrayAdapter<String>(getActivity().getApplicationContext(), R.layout.xmlanfragenliste, R.id.anfragen_liste, termine111);
        lvs5.setAdapter(adapter);


        // Inflate the layout for this fragment
        return view;
    }

}

