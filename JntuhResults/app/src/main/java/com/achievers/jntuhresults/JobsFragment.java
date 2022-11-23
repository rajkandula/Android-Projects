package com.achievers.jntuhresults;

import android.annotation.SuppressLint;
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
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

public class JobsFragment extends Fragment {
    SwipeRefreshLayout swipeRefreshLayout;
    WebView webView;
    public JobsFragment()
    {
        //empty constructor
    }
    @SuppressLint("SetJavaScriptEnabled")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate (R.layout.fragment_jobs,container,false);
        swipeRefreshLayout = (SwipeRefreshLayout)view.findViewById(R.id.swipe_messages);
        CookieSyncManager.createInstance(getActivity());
        CookieSyncManager.getInstance().startSync();
        //String url="https://docs.google.com/viewer?url="+"https://docs.google.com/document/d/e/2PACX-1vR8-3lptW62-8tUdQmLxhAwLLlaqL7gFzyBiIijAKqV2suM9lcEwvTo5LfB72Qw4wEiyAt3KOEQ76-5/pub";
        //String url="https://jntuhresults.in/";
        // String url=""file:///android_assets/jntuhn.html"";
        webView=(WebView)view.findViewById (R.id.notification_webview);
      //  webView.setWebViewClient (new WebViewClient());


        webView.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                //Users will be notified in case there's an error (i.e. no internet connection)
                Toast.makeText(getActivity(), "Oh no! " + description, Toast.LENGTH_SHORT).show();
            }

            public void onPageFinished(WebView view, String url) {
                CookieSyncManager.getInstance().sync();
            }
        });

      //  String data = "<html><body><h1>Jntuh Notifications</h1> <div style=\"width:100%; height:30px; background-color:#cccccc;\">Banner</div<iframe src=\"https://docs.google.com/document/d/e/2PACX-1vR8-3lptW62-8tUdQmLxhAwLLlaqL7gFzyBiIijAKqV2suM9lcEwvTo5LfB72Qw4wEiyAt3KOEQ76-5/pub?embedded=true\" ></iframe></body></html>";
        //String data="file:///asset/jntuh_notifications.html";
       // webView.loadData(data, "text/html", "UTF-8");
     //   webView.loadUrl ("https://docs.google.com/document/d/e/2PACX-1vR8-3lptW62-8tUdQmLxhAwLLlaqL7gFzyBiIijAKqV2suM9lcEwvTo5LfB72Qw4wEiyAt3KOEQ76-5/pub");
        webView.loadUrl("file:///android_asset/fresherjobs.html");

    /*    webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                view.loadUrl(request.getUrl().toString());
                return false;
            }
        });
*/







        //webView.getSettings ( ).setJavaScriptEnabled (true);
        WebSettings webSettings = webView.getSettings ( );
        //webView.getSettings ( ).setJavaScriptEnabled (true);
        webSettings.setJavaScriptEnabled (true);
        webSettings.setLoadWithOverviewMode (true);
        webSettings.setUseWideViewPort (true);
        webSettings.setSupportZoom (false);
        webSettings.setBuiltInZoomControls (false);
        webSettings.setDisplayZoomControls (false);
        webView.setScrollBarStyle (WebView.SCROLLBARS_OUTSIDE_OVERLAY);
        webView.setScrollbarFadingEnabled (false);

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
}
