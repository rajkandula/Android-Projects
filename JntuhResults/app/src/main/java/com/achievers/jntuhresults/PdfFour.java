package com.achievers.jntuhresults;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.github.barteksc.pdfviewer.PDFView;


public class PdfFour extends Fragment {

    WebView webView;

    PDFView pdfView;
    public PdfFour()
    {
        //empty constructor
    }
    @SuppressLint("SetJavaScriptEnabled")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate (R.layout.activity_pdffour,container,false);

        pdfView = view.findViewById(R.id.pdfView);

        pdfView.fromAsset("aca_songs_pdf.pdf").load();

        return view;
    }


}
