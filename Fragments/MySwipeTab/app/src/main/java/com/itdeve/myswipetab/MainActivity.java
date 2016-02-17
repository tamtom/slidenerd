package com.itdeve.myswipetab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.my_pager);
        viewPager.setAdapter(new MuAdapter(getSupportFragmentManager()));

    }
    class MuAdapter extends FragmentPagerAdapter{

        public MuAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragmen=null;
            switch (position) {
                case 0:
                    fragmen = new A();

                    break;
                case 1:
                    fragmen = new B();
                    break;
                case 2:
                    fragmen = new C();

            }
            return  fragmen;
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
               return "tab1";


                case 1:
                    return  "tab2";
                    
                case 2:
                    return "tab3";

            }
           return "";
        }
    }
}
