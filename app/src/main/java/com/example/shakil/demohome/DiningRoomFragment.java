package com.example.shakil.demohome;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ToggleButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class DiningRoomFragment extends Fragment {


    public DiningRoomFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dining_room, container, false);

          /********************************/
         /*    Define all the buttons    */
        /********************************/
        ToggleButton led1 = (ToggleButton) view.findViewById(R.id.toggleButtonLightDining);
        ToggleButton led2 = (ToggleButton) view.findViewById(R.id.toggleButtonFanDining);
        ToggleButton led3 = (ToggleButton) view.findViewById(R.id.toggleButtonTvDining);


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
        return view;
    }

}