package com.achievers.jntuhresults;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SearchActivity  extends Fragment {

    Button button;
    EditText editText;

    private WebView webView;
    SwipeRefreshLayout swipeRefreshLayout;
    public SearchActivity()
    {
        //empty constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate (R.layout.activity_search,container,false);
        swipeRefreshLayout = (SwipeRefreshLayout)view.findViewById(R.id.swipe_messages);
        CookieSyncManager.createInstance(getActivity());
        CookieSyncManager.getInstance().startSync();
        editText=(EditText)view.findViewById(R.id.enter_http);
        button=(Button)view.findViewById(R.id.click_to_search);

        webView=(WebView)view.findViewById(R.id.webview_search);
        webView.setWebViewClient(new MyBrowser());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = editText.getText().toString();

                webView.getSettings().setLoadsImagesAutomatically(true);
                webView.getSettings().setJavaScriptEnabled(true);

                webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                webView.loadUrl(url);

                WebSettings webSettings = webView.getSettings ( );
                //webView.getSettings ( ).setJavaScriptEnabled (true);
                webSettings.setLoadWithOverviewMode (true);
                webSettings.setUseWideViewPort (true);
                webSettings.setSupportZoom (true);
                webSettings.setBuiltInZoomControls (true);
                webSettings.setDisplayZoomControls (true);
               // webView.setScrollBarStyle (WebView.SCROLLBARS_OUTSIDE_OVERLAY);
                webView.setScrollbarFadingEnabled (false);
            }
        });



        webView.setOnKeyListener(new View.OnKeyListener(){
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if ((keyCode == KeyEvent.KEYCODE_BACK) && webView.canGoBack()) {
                    webView.goBack();
                    return true;
                }
                return false;
            }
        });

        //swipeRefreshLayout = (SwipeRefreshLayout) getView().findViewById(R.id.swipe_messages);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                swipeRefreshLayout.setRefreshing(true);

                ( new Handler()).postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        refresh();
                    }
                }, 1000);
            }
        });
        return view;
    }

    public void refresh (){
        //Do something neat here to refresh your list
        swipeRefreshLayout.setRefreshing(false);
        webView.reload();
    }
    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
