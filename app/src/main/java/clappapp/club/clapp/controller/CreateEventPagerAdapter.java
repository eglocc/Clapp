package clappapp.club.clapp.controller;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import clappapp.club.clapp.R;

public class CreateEventPagerAdapter extends FragmentStatePagerAdapter {

    public CreateEventPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        CreateEventFragment fragment = new CreateEventFragment();
        switch (position) {
            case 0:
                fragment.setLayout(R.layout.fragment_create_event_step1);
                break;
            case 1:
            case 2:
                fragment.setLayout(R.layout.fragment_create_event_step2);
                break;
            default:
                return null;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
