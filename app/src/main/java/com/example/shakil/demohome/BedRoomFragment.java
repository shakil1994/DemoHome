package com.example.shakil.demohome;


import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import static android.R.attr.id;


/**
 * A simple {@link Fragment} subclass.
 */
public class BedRoomFragment extends Fragment {


    public BedRoomFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_bed_room, container, false);

        /********************************/
         /*    Define all the buttons    */
        /********************************/
        ToggleButton led1 = (ToggleButton) view.findViewById(R.id.toggleButtonLightBed);
        ToggleButton led2 = (ToggleButton) view.findViewById(R.id.toggleButtonFanBed);
        ToggleButton led3 = (ToggleButton) view.findViewById(R.id.toggleButtonTvBed);
        ToggleButton led4 = (ToggleButton) view.findViewById(R.id.toggleButtonAlert);


        /*******************************************************/
         /*  Set an onclick/onchange listener for every button  */
        /*******************************************************/

        led1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                      /* Toggle button is led 1 */

                    new Background_get().execute("led1=1");
                } else {
                    new Background_get().execute("led1=0");
                }
            }
        });

        led2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    /* Toggle button is led 2 */
                    new Background_get().execute("led2=1");
                } else {
                    new Background_get().execute("led2=0");
                }
            }
        });

        led3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    /*Toggle button is led 3 */

                    new Background_get().execute("led3=1");
                } else {
                    new Background_get().execute("led3=0");
                }
            }
        });

        led4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    /*Toggle button is led 4 */

                    new Background_get().execute("led4=1");
                } else {
                    new Background_get().execute("led4=0");
                }
            }
        });
        return view;
    }

        /*****************************************************/
       /*  This is a background process for connecting      */
      /*   to the arduino server and sending               */
     /*    the GET request withe the added data           */
    /*****************************************************/

/*    private class Background_get extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... params) {
            try {
                *//* Change the IP to the IP you set in the Raspberry Pi http://192.168.0.108*//*//*
                URL url = new URL("http://192.168.0.108/?" + params[0]);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();

                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder result = new StringBuilder();
                String inputLine;
                while ((inputLine = in.readLine()) != null)
                    result.append(inputLine).append("\n");

                in.close();
                connection.disconnect();
                return result.toString();

            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
 */

}
