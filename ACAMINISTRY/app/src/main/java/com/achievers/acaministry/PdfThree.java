package com.achievers.acaministry;

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


public class PdfThree extends Fragment {

    WebView webView;

    PDFView pdfView;
    public PdfThree()
    {
        //empty constructor
    }
    @SuppressLint("SetJavaScriptEnabled")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate (R.layout.activity_pdfthree,container,false);

        pdfView = view.findViewById(R.id.pdfView);

        pdfView.fromAsset("acaministry_index_songs.pdf").load();

        return view;
    }


}
