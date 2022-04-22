package com.stellify.practicesamples;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class ClickableFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View clickableView = inflater.inflate(R.layout.fragment_clickable,
                                              container, false);
        Toast toast = Toast.makeText(getContext(),
                                     getResources().getString(R.string.click_message),
                                     Toast.LENGTH_SHORT);

        clickableView.setOnClickListener(v -> toast.show());

        return clickableView;
    }
}