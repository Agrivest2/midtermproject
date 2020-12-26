package com.example.highschoolmarker;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        //  marker of Secondary School
        LatLng LNL = new LatLng(15.983674, 120.571340);
        mMap.addMarker(new MarkerOptions().position(LNL).title("Alvin Secondary School" +
                "LYCEUM NORTHERN LUZON"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(LNL));

        LatLng UCNSH = new LatLng(15.978797, 120.563194);
        mMap.addMarker(new MarkerOptions().position(UCNSH).title("Adrian Secondary School\nURDANETA CITY NATIONAL HIGH SCHOOL"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(UCNSH));

        LatLng DABMHS = new LatLng(15.9792842, 120.5094671);
        mMap.addMarker(new MarkerOptions().position(DABMHS).title("Vi-Ann Secondary School\nDON ANTONIO BONGOLAN MEMORIAL HIGH SCHOOL"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(DABMHS));
        mMap.setMapType(mMap.MAP_TYPE_SATELLITE);
    }
}