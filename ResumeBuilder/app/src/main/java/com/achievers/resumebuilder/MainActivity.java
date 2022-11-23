package com.achievers.resumebuilder;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    EditText editText1,editText2,editText3,editText4,editText5;
    TextView textView1,textView2,textView3,textView4,textView5;
    Button button1,button2,button3,button4,button5,button6,button7,button8;
    String efield1,efield2,efield3,efield4,efield5,efield6,efield7,efield8,efield9,efield10,efield11,efield12,efield13,efield14,efield15,efield16,efield17,efield18,efield19;
    //objective
    EditText editTextO;
    TextView textViewO;

    //education
    EditText editTextClg;
    EditText editTextYear;
    EditText editTextStream;
    EditText editTextGpa;


    TextView textViewClg;
    TextView textViewYear;
    TextView textViewStream;
    TextView textViewGpa;


    //Skills

    EditText editTextLskil;
    EditText editTextEn;
    EditText editTextOs;

    TextView textViewLskil;
    TextView textViewEn;
    TextView textViewOs;

    //Activities /Projects

    EditText editTextAct;
    EditText editTextProject;

    TextView textViewAct;
    TextView textViewProject;

    //Achievements
    EditText editTextAch1;
    EditText editTextAch2;

    TextView textViewAch1;
    TextView textViewAch2;



    //Declaration

    EditText editTextDec;

    TextView textViewDec;



    //Signature

    EditText editTextSign;

    TextView textViewSign;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout lla=(LinearLayout)findViewById(R.id.ll1);
        LinearLayout llb=(LinearLayout)findViewById(R.id.ll2);
        LinearLayout llo=(LinearLayout)findViewById(R.id.ll_objective);
        LinearLayout lle=(LinearLayout)findViewById(R.id.ll_education);
        LinearLayout lls=(LinearLayout)findViewById(R.id.ll_skills);
        LinearLayout llap=(LinearLayout)findViewById(R.id.ll_Activities);
        LinearLayout llach=(LinearLayout)findViewById(R.id.ll_Achievements);
        LinearLayout lldec=(LinearLayout)findViewById(R.id.ll_Declaration);
        LinearLayout llsign=(LinearLayout)findViewById(R.id.ll_signature);


        llb.setVisibility(View.GONE);
        llo.setVisibility(View.GONE);
        lle.setVisibility(View.GONE);
        lls.setVisibility(View.GONE);
        llap.setVisibility(View.GONE);
        llach.setVisibility(View.GONE);
        lldec.setVisibility(View.GONE);
        llsign.setVisibility(View.GONE);


        editText1=(EditText)findViewById(R.id.etext_1);
        editText2=(EditText)findViewById(R.id.etext_2);
        editText3=(EditText)findViewById(R.id.etext_3);
        editText4=(EditText)findViewById(R.id.etext_4);
        editText5=(EditText)findViewById(R.id.etext_5);



        textView1=(TextView)findViewById(R.id.rtext_1);
        textView2=(TextView)findViewById(R.id.rtext_2);
        textView3=(TextView)findViewById(R.id.rtext_3);
        textView4=(TextView)findViewById(R.id.rtext_4);
        textView5=(TextView)findViewById(R.id.rtext_5);





        button1=(Button)findViewById(R.id.submit_btn1);
        button2=(Button)findViewById(R.id.submit_btn2);
        button3=(Button)findViewById(R.id.submit_btn3);
        button4=(Button)findViewById(R.id.submit_btn4);
        button5=(Button)findViewById(R.id.submit_btn5);
        button6=(Button)findViewById(R.id.submit_btn6);
        button7=(Button)findViewById(R.id.submit_btn7);
        button8=(Button)findViewById(R.id.submit_btn8);


        // button1.setOnClickListener(this);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lla.setVisibility(View.GONE);
                llo.setVisibility(View.VISIBLE);

                 editTextO=(EditText)findViewById(R.id.etext_objective);
                 textViewO=(TextView)findViewById(R.id.rtext_6);


                /*efield1= editText1.getText().toString();
                efield2= editText2.getText().toString();
                efield3= editText3.getText().toString();
                efield4= editText4.getText().toString();
                efield5= editText5.getText().toString();
                 efield6= editTextO.getText().toString();

                textView1.setText(efield1);
                textView2.setText(efield2);
                textView3.setText(efield3);
                textView4.setText(efield4);
                textView5.setText(efield5);
                //objective text
                textViewO.setText(efield6)
                */
            }
        });




//education details

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                llo.setVisibility(View.GONE);
                lle.setVisibility(View.VISIBLE);

                editTextClg=(EditText)findViewById(R.id.etext_clg);
                 editTextYear=(EditText)findViewById(R.id.etext_year);
                 editTextStream=(EditText)findViewById(R.id.etext_stream);
                 editTextGpa=(EditText)findViewById(R.id.etext_gpa);


                 textViewClg=(TextView)findViewById(R.id.rtext_7);
                 textViewYear=(TextView)findViewById(R.id.rtext_8);
                 textViewStream=(TextView)findViewById(R.id.rtext_9);
                 textViewGpa=(TextView)findViewById(R.id.rtext_10);

         /*       efield1= editText1.getText().toString();
                efield2= editText2.getText().toString();
                efield3= editText3.getText().toString();
                efield4= editText4.getText().toString();
                efield5= editText5.getText().toString();
                 efield6= editTextO.getText().toString();

                textView1.setText(efield1);
                textView2.setText(efield2);
                textView3.setText(efield3);
                textView4.setText(efield4);
                textView5.setText(efield5);
                //objective text
                textViewO.setText(efield6);*/

            }
        });


        //Skills
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                lle.setVisibility(View.GONE);
                lls.setVisibility(View.VISIBLE);


                 editTextLskil=(EditText)findViewById(R.id.etext_Lskills);
                 editTextEn=(EditText)findViewById(R.id.etext_environment);
                 editTextOs=(EditText)findViewById(R.id.etext_os);


                 textViewLskil=(TextView)findViewById(R.id.rtext_11);
                 textViewEn=(TextView)findViewById(R.id.rtext_12);
                 textViewOs=(TextView)findViewById(R.id.rtext_13);

         /*       efield1= editText1.getText().toString();
                efield2= editText2.getText().toString();
                efield3= editText3.getText().toString();
                efield4= editText4.getText().toString();
                efield5= editText5.getText().toString();
                 efield6= editTextO.getText().toString();

                textView1.setText(efield1);
                textView2.setText(efield2);
                textView3.setText(efield3);
                textView4.setText(efield4);
                textView5.setText(efield5);
                //objective text
                textViewO.setText(efield6);*/

            }
        });



        //Activities / projects
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                lls.setVisibility(View.GONE);
                llap.setVisibility(View.VISIBLE);


                 editTextAct=(EditText)findViewById(R.id.etext_activities);
                 editTextProject=(EditText)findViewById(R.id.etext_project);



                 textViewAct=(TextView)findViewById(R.id.rtext_14);
                 textViewProject=(TextView)findViewById(R.id.rtext_15);


         /*       efield1= editText1.getText().toString();
                efield2= editText2.getText().toString();
                efield3= editText3.getText().toString();
                efield4= editText4.getText().toString();
                efield5= editText5.getText().toString();
                 efield6= editTextO.getText().toString();

                textView1.setText(efield1);
                textView2.setText(efield2);
                textView3.setText(efield3);
                textView4.setText(efield4);
                textView5.setText(efield5);
                //objective text
                textViewO.setText(efield6);*/

            }
        });


        //Achievements
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                llap.setVisibility(View.GONE);
                llach.setVisibility(View.VISIBLE);


                 editTextAch1=(EditText)findViewById(R.id.etext_ach1);
                 editTextAch2=(EditText)findViewById(R.id.etext_ach1);



                 textViewAch1=(TextView)findViewById(R.id.rtext_16);
                 textViewAch2=(TextView)findViewById(R.id.rtext_17);


         /*       efield1= editText1.getText().toString();
                efield2= editText2.getText().toString();
                efield3= editText3.getText().toString();
                efield4= editText4.getText().toString();
                efield5= editText5.getText().toString();
                 efield6= editTextO.getText().toString();

                textView1.setText(efield1);
                textView2.setText(efield2);
                textView3.setText(efield3);
                textView4.setText(efield4);
                textView5.setText(efield5);
                //objective text
                textViewO.setText(efield6);*/

            }
        });

        //Declaration
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    llach.setVisibility(View.GONE);
                    lldec.setVisibility(View.VISIBLE);

                 editTextDec=(EditText)findViewById(R.id.etext_declaration);
                 textViewDec=(TextView)findViewById(R.id.rtext_18);


         /*       efield1= editText1.getText().toString();
                efield2= editText2.getText().toString();
                efield3= editText3.getText().toString();
                efield4= editText4.getText().toString();
                efield5= editText5.getText().toString();
                 efield6= editTextO.getText().toString();

                textView1.setText(efield1);
                textView2.setText(efield2);
                textView3.setText(efield3);
                textView4.setText(efield4);
                textView5.setText(efield5);
                //objective text
                textViewO.setText(efield6);*/

            }
        });

        //Signature
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lldec.setVisibility(View.GONE);
                llsign.setVisibility(View.VISIBLE);
              // llb.setVisibility(View.VISIBLE);


                 editTextSign=(EditText)findViewById(R.id.etext_sign);

                 textViewSign=(TextView)findViewById(R.id.rtext_19);


/*

                efield1= editText1.getText().toString();
                efield2= editText2.getText().toString();
                efield3= editText3.getText().toString();
                efield4= editText4.getText().toString();
                efield5= editText5.getText().toString();

                //objective
                efield6= editTextO.getText().toString();
                //education
                efield7= editTextClg.getText().toString();
                efield8= editTextYear.getText().toString();
                efield9= editTextStream.getText().toString();
                efield10= editTextGpa.getText().toString();

                //skills
                efield11= editTextLskil.getText().toString();
                efield12= editTextEn.getText().toString();
                efield13= editTextOs.getText().toString();
                //Actvities / Projects
                efield14= editTextAct.getText().toString();
                efield15= editTextProject.getText().toString();

                //Achievements
                efield16= editTextAch1.getText().toString();
                efield17= editTextAch2.getText().toString();

                //Declaration
                efield18= editTextDec.getText().toString();

                //signature
                efield19= editTextSign.getText().toString();

                textView1.setText(efield1);
                textView2.setText(efield2);
                textView3.setText(efield3);
                textView4.setText(efield4);
                textView5.setText(efield5);


                //objective text
                textViewO.setText(efield6);

                //education
                textViewClg.setText(efield7);
                textViewYear.setText(efield8);
                textViewStream.setText(efield9);
                textViewGpa.setText(efield10);

                //skills
                textViewLskil.setText(efield11);
                textViewEn.setText(efield12);
                textViewOs.setText(efield13);

                //Actvities / Projects
                textViewAct.setText(efield14);
                textViewProject.setText(efield15);

                //Achievements
                textViewAch1.setText(efield16);
                textViewAch2.setText(efield17);
                //Declaration
                textViewDec.setText(efield18);

                //signature
                textViewSign.setText(efield19);
*/


            }
        });

        //Signature
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llsign.setVisibility(View.GONE);
                llb.setVisibility(View.VISIBLE);

              //  editTextSign=(EditText)findViewById(R.id.etext_sign);

               // textViewSign=(TextView)findViewById(R.id.rtext_19);




                efield1= editText1.getText().toString();
                efield2= editText2.getText().toString();
                efield3= editText3.getText().toString();
                efield4= editText4.getText().toString();
                efield5= editText5.getText().toString();

                //objective
                efield6= editTextO.getText().toString();
                //education
                efield7= editTextClg.getText().toString();
                efield8= editTextYear.getText().toString();
                efield9= editTextStream.getText().toString();
                efield10= editTextGpa.getText().toString();

                //skills
                efield11= editTextLskil.getText().toString();
                efield12= editTextEn.getText().toString();
                efield13= editTextOs.getText().toString();
                //Actvities / Projects
                efield14= editTextAct.getText().toString();
                efield15= editTextProject.getText().toString();

                //Achievements
                efield16= editTextAch1.getText().toString();
                efield17= editTextAch2.getText().toString();

                //Declaration
                efield18= editTextDec.getText().toString();

                //signature
                efield19= editTextSign.getText().toString();

                textView1.setText(efield1);
                textView2.setText(efield2);
                textView3.setText(efield3);
                textView4.setText(efield4);
                textView5.setText(efield5);


                //objective text
                textViewO.setText(efield6);

                //education
                textViewClg.setText(efield7);
                textViewYear.setText(efield8);
                textViewStream.setText(efield9);
                textViewGpa.setText(efield10);

                //skills
                textViewLskil.setText(efield11);
                textViewEn.setText(efield12);
                textViewOs.setText(efield13);

                //Actvities / Projects
                textViewAct.setText(efield14);
                textViewProject.setText(efield15);

                //Achievements
                textViewAch1.setText(efield16);
                textViewAch2.setText(efield17);
                //Declaration
                textViewDec.setText(efield18);

                //signature
                textViewSign.setText(efield19);


            }
        });







    }

}