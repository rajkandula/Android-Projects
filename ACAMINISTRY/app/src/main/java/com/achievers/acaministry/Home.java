package com.achievers.acaministry;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.achievers.acaministry.R;
import com.google.android.material.navigation.NavigationView;

public class Home extends Fragment {

    SwipeRefreshLayout swipeRefreshLayout;
    LinearLayout layoutload;
    CardView cardHome,cardDD,cardPR,cardPT,cardPQ,cardA,cardTV,cardG,cardCon;

    private DrawerLayout drawer;
    NavigationView nvcheck;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate (R.layout.activity_home,container,false);
        swipeRefreshLayout = (SwipeRefreshLayout)view.findViewById(R.id.swipe_messages);
        layoutload=(LinearLayout)view.findViewById(R.id.ll_refresh);



//        final CardView card1=(CardView)view.findViewById (R.id.home);
//        final CardView card2=(CardView)view.findViewById (R.id.attendance);
//        final CardView card3=(CardView)view.findViewById (R.id.events);
//        final CardView card4=(CardView)view.findViewById (R.id.news);
//        final CardView card5=(CardView)view.findViewById (R.id.idea);
//        final CardView card7=(CardView)view.findViewById (R.id.calandar);
//        final CardView card6=(CardView)view.findViewById (R.id.notes);
//        final CardView card8=(CardView)view.findViewById (R.id.galleryc);
//        final CardView card9=(CardView)view.findViewById (R.id.cart);




        cardHome=(CardView)view.findViewById (R.id.card1);
        cardDD=(CardView)view.findViewById (R.id.card2);
        cardPR=(CardView)view.findViewById (R.id.card3);
        cardPT=(CardView)view.findViewById (R.id.card4);

        cardA=(CardView)view.findViewById (R.id.card5);
        cardTV=(CardView)view.findViewById (R.id.card6);
        cardG=(CardView)view.findViewById (R.id.card7);
        cardCon=(CardView)view.findViewById (R.id.card8);


        cardHome.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                int id=v.getId ();
                if(id==R.id.card1)
                {
                    Toast.makeText (getActivity (),"Praise The Lord...",Toast.LENGTH_LONG).show ();
//                    FragmentTransaction ft=getFragmentManager ().beginTransaction ();
//                    ft.replace (R.id.fragment_container,new Home ());
//                    ft.addToBackStack (null).addToBackStack (String.valueOf (R.id.card1));
//                    ft.commit ();
                }

            }
        });


        cardDD.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                int id=v.getId ();
                if(id==R.id.card2)
                {
                    Toast.makeText (getActivity (),"Loading...",Toast.LENGTH_SHORT).show ();
                    FragmentTransaction ft=getFragmentManager ().beginTransaction ();
                    ft.replace (R.id.fragment_container,new DailyDevotions ());
                    ft.addToBackStack (null).addToBackStack (String.valueOf (R.id.card2));
                    ft.commit ();
                }

            }
        });

        cardPR.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                int id=v.getId ();
                if(id==R.id.card3)
                {
                    Toast.makeText (getActivity (),"Loading...",Toast.LENGTH_SHORT).show ();
                    FragmentTransaction ft=getFragmentManager ().beginTransaction ();
                    ft.replace (R.id.fragment_container,new PrayerRequest ());
                    ft.addToBackStack (null).addToBackStack (String.valueOf (R.id.card3));
                    ft.commit ();
                }

            }
        });

        cardPT.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                int id=v.getId ();
                if(id==R.id.card4)
                {
                    Toast.makeText (getActivity (),"Loading...",Toast.LENGTH_SHORT).show ();
                    FragmentTransaction ft=getFragmentManager ().beginTransaction ();
                    ft.replace (R.id.fragment_container,new PrayerTimings ());
                    ft.addToBackStack (null).addToBackStack (String.valueOf (R.id.card4));
                    ft.commit ();
                }

            }
        });

        cardA.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                int id=v.getId ();
                if(id==R.id.card5)
                {
                    Toast.makeText (getActivity (),"ACA Ministry Songs Available soon",Toast.LENGTH_SHORT).show ();
                    FragmentTransaction ft=getFragmentManager ().beginTransaction ();
                    ft.replace (R.id.fragment_container,new SongsBook ());
                    ft.addToBackStack (null).addToBackStack (String.valueOf (R.id.card5));
                    ft.commit ();
                }

            }
        });

        cardTV.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                int id=v.getId ();
                if(id==R.id.card6)
                {
//                    Intent intentyt=new Intent(getActivity(),VideosActivity.class);
//                    startActivity(intentyt);
//                    String url = "https://www.youtube.com/c/a-caministrysulanagar/featured";
//                    Intent i = new Intent(Intent.ACTION_VIEW);
//                    i.setData(Uri.parse(url));
//                    startActivity(i);

                    Toast.makeText (getActivity (),"Loading....",Toast.LENGTH_SHORT).show ();
                    FragmentTransaction ft=getFragmentManager ().beginTransaction ();
                    ft.replace (R.id.fragment_container,new VideosActivity ());
                    ft.addToBackStack (null).addToBackStack (String.valueOf (R.id.card6));
                    ft.commit ();
                }

            }
        });

        cardG.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                int id=v.getId ();
                if(id==R.id.card7)
                {
                    //Toast.makeText (getActivity (),"Gallery Feature Available In Next Update",Toast.LENGTH_SHORT).show ();
                    FragmentTransaction ft=getFragmentManager ().beginTransaction ();
                    ft.replace (R.id.fragment_container,new Photos ());
                    ft.addToBackStack (null).addToBackStack (String.valueOf (R.id.card7));
                    ft.commit ();
                }

            }
        });

        cardCon.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                int id=v.getId ();
                if(id==R.id.card8)
                {
                    Toast.makeText (getActivity (),"Loading...",Toast.LENGTH_SHORT).show ();
                    FragmentTransaction ft=getFragmentManager ().beginTransaction ();
                    ft.replace (R.id.fragment_container,new ContactUs ());
                    ft.addToBackStack (null).addToBackStack (String.valueOf (R.id.card8));
                    ft.commit ();
                }

            }
        });








/*
        card5.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                int id=v.getId ();
                if(id==R.id.idea)
                {
                    Toast.makeText (getActivity (),"Loading...",Toast.LENGTH_SHORT).show ();
                    FragmentTransaction ft=getFragmentManager ().beginTransaction ();
                    ft.replace (R.id.fragment_container,new IdeaFragment ());
                    ft.addToBackStack (null).addToBackStack (String.valueOf (R.id.idea));
                    ft.commit ();


                }

            }
        });

        card9.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                int id=v.getId ();
                if(id==R.id.cart)
                {
                    Toast.makeText (getActivity (),"Loading...",Toast.LENGTH_SHORT).show ();
                    FragmentTransaction ft=getFragmentManager ().beginTransaction ();
                    ft.replace (R.id.fragment_container,new CartadsFragment  ());
                    ft.addToBackStack (null).addToBackStack (String.valueOf (R.id.cart));
                    ft.commit ();


                }

            }
        });




        card8.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                int id=v.getId ();
                if(id==R.id.galleryc)
                {
                    Toast.makeText (getActivity (),"Loading...",Toast.LENGTH_SHORT).show ();
                    FragmentTransaction ft=getFragmentManager ().beginTransaction ();
                    ft.replace (R.id.fragment_container,new Gallery ());
                    ft.addToBackStack (null).addToBackStack (String.valueOf (R.id.galleryc));
                    ft.commit ();


                }

            }
        });





        card7.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                int id=v.getId ();
                if(id==R.id.calandar)
                {
                    Toast.makeText (getActivity (),"Loading...",Toast.LENGTH_SHORT).show ();
                    FragmentTransaction ft=getFragmentManager ().beginTransaction ();
                    ft.replace (R.id.fragment_container,new Calandar ());
                    ft.addToBackStack (null).addToBackStack (String.valueOf (R.id.calandar));
                    ft.commit ();


                }

            }
        });


        card6.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                int id=v.getId ();
                if(id==R.id.notes)
                {
                    Toast.makeText (getActivity (),"Loading...",Toast.LENGTH_SHORT).show ();
                    FragmentTransaction ft=getFragmentManager ().beginTransaction ();
                    ft.replace (R.id.fragment_container,new NotesFragment ());
                    ft.addToBackStack (null).addToBackStack (String.valueOf (R.id.notes));
                    ft.commit ();


                }

            }
        });


        card4.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                int id=v.getId ();
                if(id==R.id.news)
                {
                    Toast.makeText (getActivity (),"Loading...",Toast.LENGTH_SHORT).show ();
                    FragmentTransaction ft=getFragmentManager ().beginTransaction ();
                    ft.replace (R.id.fragment_container,new NewsFragment ());
                    ft.addToBackStack (null).addToBackStack (String.valueOf (R.id.news));
                    ft.commit ();


                }

            }
        });

        card3.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                int id=v.getId ();
                if(id==R.id.events)
                {
                    Toast.makeText (getActivity (),"Loading...",Toast.LENGTH_SHORT).show ();
                    FragmentTransaction ft=getFragmentManager ().beginTransaction ();
                    ft.replace (R.id.fragment_container,new EventsFragment ());
                    ft.addToBackStack (null).addToBackStack (String.valueOf (R.id.events));
                    ft.commit ();
                }


            }
        });


        card2.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                int id=v.getId ();
                if(id==R.id.attendance)
                {
                    Toast.makeText (getActivity (),"Loading...",Toast.LENGTH_SHORT).show ();
                    FragmentTransaction ft=getFragmentManager ().beginTransaction ();
                    ft.replace (R.id.fragment_container,new AttendanceFragment ());
                    ft.addToBackStack (null).addToBackStack (String.valueOf (R.id.attendance));
                    ft.commit ();


                }

            }
        });

        card1.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                int id=v.getId ();
                if(id==R.id.home)
                {
                    Toast.makeText (getActivity (),"Loading...",Toast.LENGTH_SHORT).show ();
                    FragmentTransaction ft=getFragmentManager ().beginTransaction ();
                    ft.replace (R.id.fragment_container,new MgitsiteFragment ());
                    ft.addToBackStack (null).addToBackStack (String.valueOf (R.id.home));
                    ft.commit ();


                }

            }
        });

*/

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
        layoutload.refreshDrawableState();
        Toast.makeText(getActivity(), "Loading...! " , Toast.LENGTH_SHORT).show();
    }


}
