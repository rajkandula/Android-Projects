package com.achievers.jntuhresults;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


public class SyllabusBook extends Fragment {

    WebView webView;
    public SyllabusBook()
    {
        //empty constructor
    }
    @SuppressLint("SetJavaScriptEnabled")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate (R.layout.activity_syllabus,container,false);
        Button button1=(Button)view.findViewById(R.id.book1);
        Button button2=(Button)view.findViewById(R.id.book2);
        Button button3=(Button)view.findViewById(R.id.book3);
        Button button4=(Button)view.findViewById(R.id.book4);
        Button coff1=(Button)view.findViewById(R.id.cofffered);

        coff1.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                int id=v.getId ();
                if(id==R.id.cofffered)
                {
                    Toast.makeText (getActivity (),"Loading...",Toast.LENGTH_SHORT).show ();
                    FragmentTransaction ft=getFragmentManager ().beginTransaction ();
                    ft.replace (R.id.fragment_container,new PdfCourse ());
                    ft.addToBackStack (null).addToBackStack (String.valueOf (R.id.cofffered));
                    ft.commit ();
                }

            }
        });

        button1.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                int id=v.getId ();
                if(id==R.id.book1)
                {
                    Toast.makeText (getActivity (),"Loading...",Toast.LENGTH_SHORT).show ();
//                    FragmentTransaction ft=getFragmentManager ().beginTransaction ();
//                    ft.replace (R.id.fragment_container,new PdfOne ());
//                    ft.addToBackStack (null).addToBackStack (String.valueOf (R.id.book1));
//                    ft.commit ();
                }

            }
        });

        button2.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                int id=v.getId ();
                if(id==R.id.book2)
                {
                    Toast.makeText (getActivity (),"Loading...",Toast.LENGTH_SHORT).show ();
//                    FragmentTransaction ft=getFragmentManager ().beginTransaction ();
//                    ft.replace (R.id.fragment_container,new PdfTwo ());
//                    ft.addToBackStack (null).addToBackStack (String.valueOf (R.id.book2));
//                    ft.commit ();
                }

            }
        });



        button3.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                int id=v.getId ();
                if(id==R.id.book3)
                {
                    Toast.makeText (getActivity (),"Loading...",Toast.LENGTH_SHORT).show ();
//                    FragmentTransaction ft=getFragmentManager ().beginTransaction ();
//                    ft.replace (R.id.fragment_container,new PdfThree ());
//                    ft.addToBackStack (null).addToBackStack (String.valueOf (R.id.book3));
//                    ft.commit ();
                }

            }
        });

        button4.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                int id=v.getId ();
                if(id==R.id.book4)
                {
                    Toast.makeText (getActivity (),"Loading...",Toast.LENGTH_SHORT).show ();
//                    FragmentTransaction ft=getFragmentManager ().beginTransaction ();
//                    ft.replace (R.id.fragment_container,new PdfFour ());
//                    ft.addToBackStack (null).addToBackStack (String.valueOf (R.id.book4));
//                    ft.commit ();
                }

            }
        });




        return view;
    }


}
