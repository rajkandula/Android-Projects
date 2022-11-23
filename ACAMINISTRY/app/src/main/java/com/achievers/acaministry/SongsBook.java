package com.achievers.acaministry;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


public class SongsBook extends Fragment {

    WebView webView;
    public SongsBook()
    {
        //empty constructor
    }
    @SuppressLint("SetJavaScriptEnabled")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate (R.layout.activity_songs,container,false);
        Button button1=(Button)view.findViewById(R.id.songs1);
        Button button2=(Button)view.findViewById(R.id.songs2);
        Button button3=(Button)view.findViewById(R.id.songs3);
        Button button4=(Button)view.findViewById(R.id.songs4);



        button1.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                int id=v.getId ();
                if(id==R.id.songs1)
                {
                    Toast.makeText (getActivity (),"Loading...",Toast.LENGTH_SHORT).show ();
                    FragmentTransaction ft=getFragmentManager ().beginTransaction ();
                    ft.replace (R.id.fragment_container,new PdfOne ());
                    ft.addToBackStack (null).addToBackStack (String.valueOf (R.id.songs1));
                    ft.commit ();
                }

            }
        });

        button2.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                int id=v.getId ();
                if(id==R.id.songs2)
                {
                    Toast.makeText (getActivity (),"Loading...",Toast.LENGTH_SHORT).show ();
                    FragmentTransaction ft=getFragmentManager ().beginTransaction ();
                    ft.replace (R.id.fragment_container,new PdfTwo ());
                    ft.addToBackStack (null).addToBackStack (String.valueOf (R.id.songs2));
                    ft.commit ();
                }

            }
        });



        button3.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                int id=v.getId ();
                if(id==R.id.songs3)
                {
                    Toast.makeText (getActivity (),"Loading...",Toast.LENGTH_SHORT).show ();
                    FragmentTransaction ft=getFragmentManager ().beginTransaction ();
                    ft.replace (R.id.fragment_container,new PdfThree ());
                    ft.addToBackStack (null).addToBackStack (String.valueOf (R.id.songs3));
                    ft.commit ();
                }

            }
        });

        button4.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                int id=v.getId ();
                if(id==R.id.songs4)
                {
                    Toast.makeText (getActivity (),"Loading...",Toast.LENGTH_SHORT).show ();
                    FragmentTransaction ft=getFragmentManager ().beginTransaction ();
                    ft.replace (R.id.fragment_container,new PdfFour ());
                    ft.addToBackStack (null).addToBackStack (String.valueOf (R.id.songs4));
                    ft.commit ();
                }

            }
        });




        return view;
    }


}
