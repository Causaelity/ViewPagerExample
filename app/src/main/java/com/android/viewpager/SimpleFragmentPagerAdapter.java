package com.android.viewpager;

/**
 * Created by Tiberius on 2/19/18.
 */


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
//        if (position == 0) {
//            return new MondayFragment();
//        } else if (position == 1){
//            return new TuesdayFragment();
//        } else if (position == 2) {
//            return new WednesdayFragment();
//        } else if (position == 3) {
//            return new ThursdayFragment();
//        } else {
//            return new FridayFragment();
//        }
        switch (position) {
            case 0:
                return new MondayFragment();

            case 1:
                return new TuesdayFragment();

            case 2:
                return new WednesdayFragment();

            case 3:
                return new ThursdayFragment();

            default:
                return new FridayFragment();

        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}
