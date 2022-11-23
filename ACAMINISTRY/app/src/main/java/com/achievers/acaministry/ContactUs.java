package com.achievers.acaministry;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class ContactUs extends Fragment {



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate (R.layout.activity_contact_us,container,false);


        CardView card1=(CardView) view.findViewById(R.id.call1);
        CardView card2=(CardView) view.findViewById(R.id.call2);
        CardView card3=(CardView) view.findViewById(R.id.contact1);
        CardView card4=(CardView) view.findViewById(R.id.contact2);

        TextView txt1=(TextView) view.findViewById(R.id.cal1_txt);
        TextView txt2=(TextView) view.findViewById(R.id.cal2_txt);
        TextView txt3=(TextView) view.findViewById(R.id.contact1_txt);
        TextView txt4=(TextView) view.findViewById(R.id.contact2_txt);


        txt1.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                int id=v.getId ();
                if(id==R.id.cal1_txt)
                {
                    // Toast.makeText (getActivity (),"Loading...",Toast.LENGTH_SHORT).show ();
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    String p = "tel:" + getString(R.string.number1);
                    callIntent.setData(Uri.parse(p));
                    startActivity(callIntent);
                }

            }
        });





        txt2.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                int id=v.getId ();
                if(id==R.id.cal2_txt)
                {
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    String p = "tel:" + getString(R.string.number2);
                    callIntent.setData(Uri.parse(p));
                    startActivity(callIntent);
                }

            }
        });


        txt3.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                int id=v.getId ();
                if(id==R.id.contact1_txt)
                {
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    String p = "tel:" + getString(R.string.number3);
                    callIntent.setData(Uri.parse(p));
                    startActivity(callIntent);
                }

            }
        });

        txt4.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                int id=v.getId ();
                if(id==R.id.contact2_txt)
                {
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    String p = "tel:" + getString(R.string.number4);
                    callIntent.setData(Uri.parse(p));
                    startActivity(callIntent);
                }

            }
        });



        return view;


    }
}
