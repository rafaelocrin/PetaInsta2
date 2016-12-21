package com.zocrosfera.petagraminsta;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.zocrosfera.miscontactos.R;
import com.zocrosfera.petagraminsta.adapter.PageAdapter;
import com.zocrosfera.petagraminsta.fragment.FollowerFragment;
import com.zocrosfera.petagraminsta.fragment.PerfilFragment;
import com.zocrosfera.petagraminsta.fragment.RecyclerViewFragment;
import com.zocrosfera.petagraminsta.menu.AboutActivity;
import com.zocrosfera.petagraminsta.menu.ConfigCuentaActivity;
import com.zocrosfera.petagraminsta.menu.FormularioActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        setupViewPager();

        if (toolbar != null)
        {
            setSupportActionBar(toolbar);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_opciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.mAbout:
                Intent intent = new Intent(this, AboutActivity.class);
                startActivity(intent);
                break;
            case R.id.mFormulario:
                Intent intent2 = new Intent(this, FormularioActivity.class);
                startActivity(intent2);
                break;
            case R.id.mConfigCuenta:
                Intent intent3 = new Intent(this, ConfigCuentaActivity.class);
                startActivity(intent3);
                break;
        }

        return true;
    }

    private ArrayList<Fragment> agregarFragments(){
        ArrayList<Fragment> fragments = new ArrayList<Fragment>();
        //fragments.add(new RecyclerViewFragment());
        fragments.add(new FollowerFragment());
        fragments.add(new PerfilFragment());

        return fragments;
    }
    public void setupViewPager(){
        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(), agregarFragments()));
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_action_name);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_action_name_user);
    }
}
