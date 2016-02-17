package com.itdeve.myswipetab;

import android.app.ActionBar;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;

import com.astuetz.PagerSlidingTabStrip;

public class MainActivity extends AppCompatActivity{
ViewPager viewPager;

    ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        viewPager = (ViewPager) findViewById(R.id.pager);
        viewPager.setAdapter(new MuAdapter(getSupportFragmentManager()));
        final int pageMargin = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 4, getResources()
                .getDisplayMetrics());
        viewPager.setPageMargin(pageMargin);
        PagerSlidingTabStrip tabs = (PagerSlidingTabStrip) findViewById(R.id.tabs);
        tabs.setShouldExpand(true);
        tabs.setViewPager(viewPager);
    }


    class MuAdapter extends FragmentPagerAdapter{
        private String[] titles = {"Item 1", "Item 2", "Item 3" };

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
            return titles[position];
        }
    }
}
