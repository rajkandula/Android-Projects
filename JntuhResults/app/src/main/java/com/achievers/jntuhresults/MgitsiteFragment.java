package com.achievers.jntuhresults;

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

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MgitsiteFragment extends Fragment {
   SwipeRefreshLayout swipeRefreshLayout;
    WebView webView;
    private AdView mAdView;
    private AdRequest adRequest;
public MgitsiteFragment()
{
    //empty constructor
}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate (R.layout.fragment_mgitsite,container,false);
        swipeRefreshLayout = (SwipeRefreshLayout)view.findViewById(R.id.swipe_messages);

//        MobileAds.initialize(getActivity(),"ca-app-pub-3940256099942544~3347511713");//test add id
////      MobileAds.initialize(getActivity(),"ca-app-pub-4799846758206862~5336018782"); // dont use orginal add id
//        mAdView=(AdView) view.findViewById(R.id.adView);
////         adRequest=new AdRequest.Builder().build();// orginal
//        adRequest=new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR).build();//test
//        mAdView.loadAd(adRequest);

        CookieSyncManager.createInstance(getActivity());
        CookieSyncManager.getInstance().startSync();
        //String url="https://bit.ly/39wR9yr";
        String url="https://jntuhresults.in/";
       // String url="https://www.pmltinternational.com/";
         webView=(WebView)view.findViewById (R.id.webviewhome);
       webView.setWebViewClient (new WebViewClient());
      webView.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                //Users will be notified in case there's an error (i.e. no internet connection)
                Toast.makeText(getActivity(), "Oh no! " + description, Toast.LENGTH_SHORT).show();
            }

            public void onPageFinished(WebView view, String url) {
                CookieSyncManager.getInstance().sync();
            }
        });
        webView.loadUrl (url);
        //webView.getSettings ( ).setJavaScriptEnabled (true);
        WebSettings webSettings = webView.getSettings ( );
        //webView.getSettings ( ).setJavaScriptEnabled (true);
        webSettings.setJavaScriptEnabled (true);
        webSettings.setLoadWithOverviewMode (true);
        webSettings.setUseWideViewPort (true);
        webSettings.setSupportZoom (true);
        webSettings.setBuiltInZoomControls (true);
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
