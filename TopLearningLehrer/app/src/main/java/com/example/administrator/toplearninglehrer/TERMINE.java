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
public class TERMINE extends Fragment {


    public TERMINE() {
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

        View view =  inflater.inflate(R.layout.fragment_termine, container, false);


        String termine14[] = {"6 November 2016", "3 Jänner 2016", "12 Februar2016", "6 November 2016", "6 November 2016",
                "11 Februar2016", "1 Juni 2016",
                "9 Juni 1995", "6 November 2016", "6 November 2016", "9 Juni 2019"};

        lvs5 = (ListView) view.findViewById(R.id.list_view);
        inputSearch = (EditText) view.findViewById(R.id.inputSearch);



        getActivity().setTitle("Termine");


        adapter = new ArrayAdapter<String>(getActivity().getApplicationContext(), R.layout.xmlterminliste, R.id.meinetermineliste, termine14);
        lvs5.setAdapter(adapter);


        // Inflate the layout for this fragment
        return view;
    }

}