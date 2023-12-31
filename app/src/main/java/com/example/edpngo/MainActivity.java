package com.example.edpngo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.edpngo.fragment.About;
import com.example.edpngo.fragment.BlogFragment;
import com.example.edpngo.fragment.DonateFragment;
import com.example.edpngo.fragment.DonorsFragment;
import com.example.edpngo.fragment.GalleryFragment;
import com.example.edpngo.fragment.HomeFragment;
import com.example.edpngo.fragment.ProfileFragment;
import com.example.edpngo.fragment.ProjectFragment;
import com.example.edpngo.fragment.VolunteerFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;
    ImageView imageMenu, logoEdp, notificationIcon;

    BottomNavigationView bottomNavigationView;
    String ROOT_FRAGMENT_TAG;
    ProgressBar frameLoading;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logoEdp = findViewById(R.id.logoEdp);
        notificationIcon = findViewById(R.id.notificationIcon);
        frameLoading = findViewById(R.id.fragmentContainerLoading);
        frameLoading.setVisibility(View.VISIBLE);


//        logo click to home
        logoEdp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFragment(new HomeFragment(),0);
            }
        });


        // notification icon activity
        notificationIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Notification.class);
                startActivity(intent);
            }
        });



        // Bottom Navigation view start ===========================
        bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.setBackground(null);

        bottomNavigationView.setItemIconTintList(null);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                

                int id = item.getItemId();
                if (id == R.id.navHome){

                    openFragment(new HomeFragment(),R.id.navHome);

                } else if (id == R.id.navDonate) {
                    openFragment(new DonateFragment(), R.id.navDonate);
                } else if (id == R.id.navProject) {
                    openFragment(new ProjectFragment(), R.id.navProject);
                } else {
                    openFragment(new GalleryFragment(),R.id.navGallery);
                }

                return true;
            }
        });

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                openFragment(new HomeFragment(),0);
                frameLoading.setVisibility(View.GONE);
            }
        },1000);



        // Bottom Navigation view end ===========================


        // Navigation Drawer------------------------------
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_View);
        imageMenu = findViewById(R.id.imageMenu);


        toggle = new ActionBarDrawerToggle(MainActivity.this, drawerLayout, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        navigationView.setItemIconTintList(null);

        // Drawar click event
        // Drawer item Click event ------
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();
                if (id == R.id.navProfile){
                    // profile menu

                    openFragment(new ProfileFragment(), R.id.navProfile);

                } else if(id == R.id.navVolunteer){
                    // volunteer menu
                    openFragment(new VolunteerFragment(), R.id.navVolunteer);

                } else if(id == R.id.navDonors){
                    // volunteer menu
                    openFragment(new DonorsFragment(), R.id.navDonors);

                }else if(id == R.id.navAbout){
                    // about menu
                    openFragment(new About(), R.id.navAbout);

                } else if(id == R.id.navContact){
                    // contact menu
                    Intent intent = new Intent(MainActivity.this,ContactActivity.class);
                    startActivity(intent);

                }  else if(id == R.id.navBlogs){
                    // Our blogs menu
                    openFragment(new BlogFragment(), R.id.navBlogs);

                }   else if(id == R.id.navDonate){
                    // donate menu
                    openFragment(new DonateFragment(), R.id.navDonate);

                }  else if(id == R.id.navProjects){
                    // Projects menu
                    openFragment(new ProjectFragment(), R.id.navProjects);

                } else if(id == R.id.navGallery){
                    // Projects menu
                    openFragment(new GalleryFragment(),R.id.navGallery);

                } else {
                    // logout
                    Toast.makeText(MainActivity.this, "logout ", Toast.LENGTH_SHORT).show();
                }

                drawerLayout.closeDrawers();
                return true;
            }
        });
        //------------------------------

        // ------------------------
        // App Bar Click Event
        imageMenu = findViewById(R.id.imageMenu);

        imageMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Code Here
                drawerLayout.openDrawer(GravityCompat.END);
            }
        });


        // Navigation drawer ended ------------------------
    }


    private void openFragment(Fragment fragment, int id){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmentContainer,fragment);
        if (id == R.id.navHome){
           fragmentTransaction.replace(R.id.fragmentContainer,new HomeFragment());
           fragmentManager.popBackStack(ROOT_FRAGMENT_TAG,FragmentManager.POP_BACK_STACK_INCLUSIVE);
           fragmentTransaction.addToBackStack(ROOT_FRAGMENT_TAG);
        }
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }
}