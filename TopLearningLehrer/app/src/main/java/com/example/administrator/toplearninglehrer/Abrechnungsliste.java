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
public class Abrechnungsliste extends Fragment {


    public Abrechnungsliste() {
        // Required empty public constructor
    }


    private ListView lvs2;

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

        View view =  inflater.inflate(R.layout.fragment_abrechnungsliste, container, false);


        String termine12[] = {"30 Jänner 2017", "30 Februar 2017", "30 März 2017", "30 April 2017", "30 Mai 2017",
                "30 Juni 2017", "30 Juli 2017",
                "30 August 2017", "30 September 2017", "30 Jänner 2017", "30 Jänner 2017"};

        lvs2 = (ListView) view.findViewById(R.id.list_view);
        inputSearch = (EditText) view.findViewById(R.id.inputSearch);



        getActivity().setTitle("Abrechnungen");


        adapter = new ArrayAdapter<String>(getActivity().getApplicationContext(), R.layout.xmlabrechnungsliste, R.id.abrechnungs_liste, termine12);
        lvs2.setAdapter(adapter);


        // Inflate the layout for this fragment
        return view;
    }

}
