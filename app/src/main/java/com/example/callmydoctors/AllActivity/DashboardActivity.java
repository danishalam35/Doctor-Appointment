package com.example.callmydoctors.AllActivity;

import androidx.annotation.NonNull;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Intent;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.example.callmydoctors.Adapters.DoctorAdapter;
import com.example.callmydoctors.Adapters.HospitalAdapter;
import com.example.callmydoctors.Adapters.MediAdapter;
import com.example.callmydoctors.Adapters.TopSpcialistAdapter;
import com.example.callmydoctors.Models.DoctorFind;
import com.example.callmydoctors.Models.MedicineBanner;
import com.example.callmydoctors.Models.TopHospital;
import com.example.callmydoctors.Models.TopSpcealist;
import com.example.callmydoctors.R;

import java.util.ArrayList;


public class DashboardActivity extends AppCompatActivity {

    Toolbar toolbar;
    TextView testBook,consultation;
    DrawerLayout drawerLayout;
    ImageView menuItem,items;
    RecyclerView rec1,rec2,rec3,rec4;

    private ArrayList<MedicineBanner> list1;
    private ArrayList<DoctorFind> list2;
    private ArrayList<TopHospital> list3;
    private ArrayList<TopSpcealist> list4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        drawerLayout=findViewById(R.id.drawer_layout);
        items=findViewById(R.id.doc1);
        testBook=findViewById(R.id.testBook);
        consultation=findViewById(R.id.consultation);

        rec1=findViewById(R.id.recyclerview1);
        rec2=findViewById(R.id.recyclerview2);
        rec3=findViewById(R.id.recyclerview3);
        rec4=findViewById(R.id.recyclerview4);



        consultation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashboardActivity.this,OnlineConsultationActivity.class));
            }
        });

        testBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashboardActivity.this,DiagnosticTestActivity.class));
            }
        });





        menuItem=findViewById(R.id.menu_Item);
        menuItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDrawer(drawerLayout);
            }
        });

        // For Medicine Banner
        mediciene();
        // for doctor
        doctor();
        // for hospital
        hospital();
        // for specialist
        speciailist();
    }

    private void mediciene() {
        list1=new ArrayList<>();
        list1.add(new MedicineBanner("https://cdmplus.com.au/wp-content/uploads/2019/11/tablet2-1080x675.jpg"));
        list1.add(new MedicineBanner("https://cdmplus.com.au/wp-content/uploads/2019/11/tablet2-1080x675.jpg"));

        final MediAdapter mediAdapter=new MediAdapter(list1,this);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);

        rec1.setLayoutManager(mLayoutManager);
        rec1.setAdapter(mediAdapter);


    }


    private void doctor() {
        list2=new ArrayList<>();
        list2.add(new DoctorFind("https://images.onhealth.com/images/slideshow/right-doctor-finder-s2-specialist.jpg","Apollo Spectra Hospitals","Multi Speciality Hospital","Jam Nagar"));

        final DoctorAdapter doctorAdapter=new DoctorAdapter(list2,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);

        rec2.setLayoutManager(linearLayoutManager);
        rec2.setAdapter(doctorAdapter);

    }

    private void hospital() {
        list3=new ArrayList<>();
        list3.add(new TopHospital("https://images.onhealth.com/images/slideshow/right-doctor-finder-s2-specialist.jpg","Apollo Spectra Hospitals","Multi Speciality Hospital","Jam Nagar"));
        list3.add(new TopHospital("https://images.onhealth.com/images/slideshow/right-doctor-finder-s2-specialist.jpg","Apollo Spectra Hospitals","Multi Speciality Hospital","Jam Nagar"));
        list3.add(new TopHospital("https://images.onhealth.com/images/slideshow/right-doctor-finder-s2-specialist.jpg","Apollo Spectra Hospitals","Multi Speciality Hospital","Jam Nagar"));

        final HospitalAdapter hospitalAdapter=new HospitalAdapter(list3,this);
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);

        rec3.setLayoutManager(linearLayoutManager1);
        rec3.setAdapter(hospitalAdapter);


    }
    private void speciailist() {
        list4=new ArrayList<>();
        list4.add(new TopSpcealist("https://images.onhealth.com/images/slideshow/right-doctor-finder-s2-specialist.jpg","Orthopedist","Meet doctorin case of","chronic ortho pain","424 Doctors available"));
        list4.add(new TopSpcealist("https://images.onhealth.com/images/slideshow/right-doctor-finder-s2-specialist.jpg","Orthopedist","Meet doctorin case of","chronic ortho pain","424 Doctors available"));

        final TopSpcialistAdapter topSpcialistAdapter=new TopSpcialistAdapter(list4,this);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);

        rec4.setLayoutManager(linearLayoutManager2);
        rec4.setAdapter(topSpcialistAdapter);

    }
    //  public void clickItem(View view){
    //     openDrawer(drawerLayout);
    // }

    private static void openDrawer(DrawerLayout drawerLayout) {
        drawerLayout.openDrawer(GravityCompat.START);


    }
    public void clickLogo(View view){
        closeDrawer(drawerLayout);
    }

    private static void closeDrawer(DrawerLayout drawerLayout) {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }

    }


    public void notes(View view){

    }



}