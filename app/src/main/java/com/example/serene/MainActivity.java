package com.example.serene;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.serene.ui.home.HomeFragment;
import com.example.serene.ui.profile.ProfileFragment;
import com.example.serene.ui.saved.SavedFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {
    private final BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    fragment = new HomeFragment();
                    //mereplace frame layout yang disediakan di activity_main.xml menjadi layout HomeFragment
                    getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, fragment, fragment.getClass().getSimpleName()).commit();
                    return true;
                case R.id.navigation_profile:
                    fragment = new ProfileFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, fragment, fragment.getClass().getSimpleName()).commit();
                    return true;
                case R.id.navigation_saved:
                    fragment = new SavedFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, fragment, fragment.getClass().getSimpleName()).commit();
                    return true;
            }
            return false;

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menghubungkan dengan bottomnav di layout dengan id nya
        BottomNavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener);

        //mengeset HomeFragment menjadi default fragment
        if (savedInstanceState == null) {
            navigationView.setSelectedItemId(R.id.navigation_home);
        }
    }

}
