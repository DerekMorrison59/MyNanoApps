package com.derekmorrison.mynanoapps;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View inflatedView;
        inflatedView = inflater.inflate(R.layout.fragment_main, container, false);

        setUpLaunchButton(inflatedView, "Launch Movies App", R.id.button2);
        setUpLaunchButton(inflatedView, "Launch Scores App", R.id.button3);
        setUpLaunchButton(inflatedView, "Launch Library App", R.id.button4);
        setUpLaunchButton(inflatedView, "Launch Ant Terminator App", R.id.button5);
        setUpLaunchButton(inflatedView, "Launch Bacon Reader App", R.id.button6);
        setUpLaunchButton(inflatedView, "Launch Capstone App", R.id.button7);

        return inflatedView;
    }

    private void setUpLaunchButton(View inflatedView, final String message, int buttonId) {

        // get a ref to the button
        Button btn = (Button) inflatedView.findViewById(buttonId);

        // set the OnClick action to display some toast
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
