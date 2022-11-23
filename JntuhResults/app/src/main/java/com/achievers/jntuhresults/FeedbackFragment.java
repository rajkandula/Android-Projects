package com.achievers.jntuhresults;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FeedbackFragment extends Fragment {



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    View view =inflater.inflate (R.layout.fragment_feedback,container,false);
       final EditText edit1=(EditText)view.findViewById (R.id.edittext1);
        final EditText edit2=(EditText)view.findViewById (R.id.edittext2);

        Button button1=(Button)view.findViewById (R.id.button1);
        button1.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                int id=v.getId ();

                if (id == R.id.button1) {
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    String[] recipients={"mgit.club@gmail.com"};

                    intent.putExtra (Intent.EXTRA_EMAIL,recipients);

                    intent.putExtra (Intent.EXTRA_SUBJECT, "Feedback form");
                    intent.putExtra (Intent.EXTRA_TEXT, "Name:" + edit1.getText ( ) + "\n" + "Message:" + edit2.getText ( ));
                   intent.putExtra (Intent.EXTRA_CC,"mgit.club@gmail.com");
                    intent.setType ("Text/Html");
                    intent.setPackage ("com.google.android.gm");

                        startActivity (Intent.createChooser (intent, "Send mail"));



                }
            }
        });

        return view;


    }
}
