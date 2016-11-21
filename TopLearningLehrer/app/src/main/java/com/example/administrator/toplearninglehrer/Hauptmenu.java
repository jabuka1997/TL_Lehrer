package com.example.administrator.toplearninglehrer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Hauptmenu extends Fragment implements View.OnClickListener{


    Button btn_anfragen;
    public Hauptmenu() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_hauptmenu, container, false);
        getActivity().setTitle("Top Learning+");

        btn_anfragen = (Button) view.findViewById(R.id.btn_anfragen);

        btn_anfragen.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btn_anfragen:
                Anfragen a1 = new Anfragen();
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
                ft.replace(R.id.fragment_container, a1).addToBackStack("tag").commit();

                break;

        }
    }
}
