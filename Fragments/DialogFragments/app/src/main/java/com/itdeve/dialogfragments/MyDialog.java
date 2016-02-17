package com.itdeve.dialogfragments;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;

/**
 * Created by omar on 2/17/2016.
 */
public class MyDialog extends DialogFragment{
    EditText editText;
    View view;
    listener listenerobj;
LinearLayout mLinearLayout ;
    public  void setListenerobj(listener listenerobj){
        this.listenerobj = listenerobj;
    }


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.my_dialog,null);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        listenerobj.settexxt(editText.getText().toString());
                    }
                }
        ).setView(view);



        builder.setTitle("hello");
        editText = (EditText) view.findViewById(R.id.read);

        return builder.create();

    }
    interface listener{
        void settexxt(String x);
    }
}
