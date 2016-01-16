package com.itdeve.flexibleuserinterface;


import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentB extends Fragment {

TextView text;
    int id;

    public FragmentB() {
        // Required empty public constructor
    }

    public void setId(int id) {
        this.id = id;
        changeData(id);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b, container, false);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("pos",id);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    text = (TextView) getActivity().findViewById(R.id.TextView);
        if (savedInstanceState != null) {
            id= savedInstanceState.getInt("pos");
            setId(id);
        }
    }
    public void  changeData(int i ){
        Resources res = getResources();
        String Desc[] = res.getStringArray(R.array.description);
        if (text == null)
            text = (TextView) getActivity().findViewById(R.id.TextView);
        text.setText(Desc[i]);
    }
}
