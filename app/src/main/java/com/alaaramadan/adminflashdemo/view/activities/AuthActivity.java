package com.alaaramadan.adminflashdemo.view.activities;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import com.alaaramadan.adminflashdemo.R;
import com.alaaramadan.adminflashdemo.databinding.ActivityAuthBinding;
import com.alaaramadan.adminflashdemo.view.base.BaseActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import static com.alaaramadan.adminflashdemo.utils.HelperMethod.changeLang;

public class AuthActivity extends BaseActivity {
    private ActivityAuthBinding binding;
    private BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        changeLang(this, "ar");
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_auth );

        BottomNavigationView navView = findViewById( R.id.activity_auth_bottom_nav );
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        //AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
        //  R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications )
        //  .build();
        NavController navController = Navigation.findNavController( this, R.id.auth_activity_frameLayout_container );
        // NavigationUI.setupActionBarWithNavController( this, navController, appBarConfiguration );
        NavigationUI.setupWithNavController( navView, navController );


       /* View Login=findViewById( R.id.bottom_nav_auth_login );
        View Condition=findViewById( R.id.bottom_nav_auth_condition );
        View ContactWithUs=findViewById( R.id.bottom_nav_auth_contact_with_us );
        View NewAccount=findViewById( R.id.bottom_nav_auth_new_account );
        ContactWithUs.setEnabled( false );
        NewAccount.setEnabled( false );
        Condition.setEnabled( false );
        Login.setPressed( true );*/




    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        changeLang(this, "ar");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


     return null;
    }
}