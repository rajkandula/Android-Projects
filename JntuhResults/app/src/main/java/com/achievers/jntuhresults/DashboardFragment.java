package com.achievers.jntuhresults;

import android.Manifest;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class DashboardFragment extends Fragment {
    SwipeRefreshLayout swipeRefreshLayout;
    LinearLayout layoutload;
    private AdView mAdView;
    private AdRequest adRequest;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate (R.layout.fragment_dashboard,container,false);
        swipeRefreshLayout = (SwipeRefreshLayout)view.findViewById(R.id.swipe_messages);
//        layoutload=(LinearLayout)view.findViewById(R.id.main_cons);
        final CardView card1=(CardView)view.findViewById (R.id.jntuhsite);

        final CardView card2=(CardView)view.findViewById (R.id.cal);

        final CardView card3=(CardView)view.findViewById (R.id.degree);

        final CardView card4=(CardView)view.findViewById (R.id.attendance);

        final CardView card5=(CardView)view.findViewById (R.id.mat);

        final CardView card6=(CardView)view.findViewById (R.id.syll);

                  /*xml addUnit ids
                   ads:adUnitId="ca-app-pub-3940256099942544/6300978111"//test id
                   ads:adUnitId="ca-app-pub-4799846758206862/9083692104">//dont use orginal id



         MobileAds.initialize(this,"ca-app-pub-1439003754516291~6339799332");
        mAdView2= findViewById(R.id.adView2);
        AdRequest adRequeFst2 = new AdRequest.Builder().build();
        mAdView2.loadAd(adRequest2);
                    */
        MobileAds.initialize(getActivity(),"ca-app-pub-3940256099942544~3347511713");//test add id
       //MobileAds.initialize(getActivity(),"ca-app-pub-4799846758206862~5336018782"); // dont use orginal add id
          mAdView=(AdView) view.findViewById(R.id.adView);
        // adRequest=new AdRequest.Builder().build();// orginal
           adRequest=new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR).build();//test
        mAdView.loadAd(adRequest);

        card1.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                int id=v.getId ();
                if(id==R.id.jntuhsite)
                {
                    Toast.makeText (getActivity (),"Loading...",Toast.LENGTH_SHORT).show ();
                    FragmentTransaction ft=getFragmentManager ().beginTransaction ();
                    ft.replace (R.id.fragment_container,new MgitsiteFragment ());
                    ft.addToBackStack (null).addToBackStack (String.valueOf (R.id.jntuhsite));
                    ft.commit ();
                }

            }
        });

        //Results button -1 onclick action
        card2.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                int id=v.getId ();
                if(id==R.id.cal)
                {
                    Toast.makeText (getActivity (),"Loading...",Toast.LENGTH_SHORT).show ();
                    FragmentTransaction ft=getFragmentManager ().beginTransaction ();
                    ft.replace (R.id.fragment_container,new Calendar ());
                    ft.addToBackStack (null).addToBackStack (String.valueOf (R.id.cal));
                    ft.commit ();
                }
            }
        });

        //Results button -2 onclick action
        card3.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                int id=v.getId ();
                if(id==R.id.degree)
                {
                    Toast.makeText (getActivity (),"Loading...",Toast.LENGTH_SHORT).show ();
                    FragmentTransaction ft=getFragmentManager ().beginTransaction ();
                    ft.replace (R.id.fragment_container,new JobsFragment ());
                    ft.addToBackStack (null).addToBackStack (String.valueOf (R.id.degree));
                    ft.commit ();

                }
            }
        });
        //Results button -3 onclick action
        card4.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                int id=v.getId ();
                if(id==R.id.attendance)
                {
                    Toast.makeText (getActivity (),"Attendance Feature Available in NexT Update",Toast.LENGTH_SHORT).show ();
                    FragmentTransaction ft=getFragmentManager ().beginTransaction ();
                    ft.replace (R.id.fragment_container,new Attendance ());
                    ft.addToBackStack (null).addToBackStack (String.valueOf (R.id.attendance));
                    ft.commit ();
                }
            }
        });

        card5.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                int id=v.getId ();
                if(id==R.id.mat)
                {
                    Toast.makeText (getActivity (),"All Semester Materials Available in Next Update",Toast.LENGTH_SHORT).show ();
//                    FragmentTransaction ft=getFragmentManager ().beginTransaction ();
//                    ft.replace (R.id.fragment_container,new JntuhsitethreeFragment ());
//                    ft.addToBackStack (null).addToBackStack (String.valueOf (R.id.mat));
//                    ft.commit ();


                }

            }
        });

        card6.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                int id=v.getId ();
                if(id==R.id.syll)
                {
                    Toast.makeText (getActivity (),"All semester Syllabus in Next Update",Toast.LENGTH_SHORT).show ();
                    FragmentTransaction ft=getFragmentManager ().beginTransaction ();
                    ft.replace (R.id.fragment_container,new SyllabusBook ());
                    ft.addToBackStack (null).addToBackStack (String.valueOf (R.id.syll));
                    ft.commit ();


                }

            }
        });


        //swipeRefreshLayout = (SwipeRefreshLayout) getView().findViewById(R.id.swipe_messages);
//        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
//            @Override
//            public void onRefresh() {
//                swipeRefreshLayout.setRefreshing(true);
//
//                ( new Handler()).postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
//                        refresh();
//                    }
//                }, 1000);
//            }
//        });
        return view;
    }


//    public void refresh (){
//        //Do something neat here to refresh your list
//        swipeRefreshLayout.setRefreshing(false);
//        layoutload.refreshDrawableState();
//        Toast.makeText(getActivity(), "Loading...! " , Toast.LENGTH_SHORT).show();
//    }

}
