package com.example.group2googlemap;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

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
        mMap.addCircle(new CircleOptions()
                .center(new LatLng(15.979605, 120.560573))
                .radius(150)
                .strokeWidth(10)
                .strokeColor(Color.GREEN)
                .fillColor(Color.argb(128, 255, 0, 0)));


        mMap.addCircle(new CircleOptions()
                .center(new LatLng(16.066875, 120.601911))
                .radius(10)
                .strokeWidth(10)
                .strokeColor(Color.GREEN)
                .fillColor(Color.argb(128, 255, 0, 0)));

        mMap.addCircle(new CircleOptions()
                .center(new LatLng(15.978797, 120.563194))
                .radius(10)
                .strokeWidth(10)
                .strokeColor(Color.GREEN)
                .fillColor(Color.argb(128, 255, 0, 0)));

        //   Alvin Padilla Marker and Move the Camera
       LatLng Mangcasuy = new LatLng(16.066875, 120.601911);
        mMap.addMarker(new MarkerOptions().position(Mangcasuy).title("Marker in Alvin House"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Mangcasuy));
        //   UCU Marker
        LatLng UCU = new LatLng(15.979605, 120.560573);
        mMap.addMarker(new MarkerOptions().position(UCU).title("Marker in UCU"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(UCU));

        mMap.setMapType(mMap.MAP_TYPE_SATELLITE);



        mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(16.066875, 120.601911),
                        new LatLng(16.0668352,120.6017566),
                        new LatLng(16.067661, 120.601703),
                        new LatLng(16.067330, 120.600876),
                        new LatLng(16.067161, 120.599755),
                        new LatLng(16.067027, 120.599642),
                        new LatLng(16.066796, 120.599570),
                        new LatLng(16.066614, 120.599304),
                        new LatLng(16.066465, 120.599004),
                        new LatLng(16.066555, 120.597151),
                        new LatLng(16.065941, 120.594180),
                        new LatLng(16.065565, 120.593303),
                        new LatLng(16.065428, 120.593263),
                        new LatLng(16.064735, 120.593359),
                        new LatLng(16.063892, 120.592213),
                        new LatLng(16.063983, 120.591163),
                        new LatLng(16.062648, 120.590479),
                        new LatLng(16.061475, 120.590098),
                        new LatLng(16.061361, 120.590034),
                        new LatLng(16.061211, 120.589728),
                        new LatLng(16.061216, 120.589540),
                        new LatLng(16.046635, 120.586284),
                        new LatLng(15.979242, 120.570983),
                        new LatLng(15.978867, 120.565798),
                        new LatLng(15.978964, 120.565371),
                        new LatLng(15.981786, 120.560152),
                        new LatLng(15.981502, 120.560178),
                        new LatLng(15.980127, 120.560480),
                        new LatLng(15.979873, 120.560508),
                        new LatLng(15.979605, 120.560573))
                .width(10)
                .color(Color.BLUE));

        //  Adrian Marker and Move the Camera
        LatLng Poblacion = new LatLng(15.974177, 120.564820);
        mMap.addMarker(new MarkerOptions().position(Poblacion).title("Marker in Adrian House"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Poblacion));

        mMap.addPolyline(new PolylineOptions()
        .add(new LatLng(15.974177, 120.564820),
                new LatLng(15.974210, 120.563828),
                new LatLng(15.976681, 120.563679),
                new LatLng(15.976681, 120.563679),
                new LatLng(15.976862, 120.566066),
                new LatLng(15.978853, 120.566052),
                new LatLng(15.981888, 120.560080),

                new LatLng(15.981502, 120.560178))
                .width(10)
                .color(Color.BLUE));





        mMap.addCircle(new CircleOptions()
                .center(new LatLng(15.987206, 120.499045))
                .radius(10)
                .strokeWidth(10)
                .strokeColor(Color.GREEN)
                .fillColor(Color.argb(128, 255, 0, 0)));

        LatLng SanJose = new LatLng(15.987206, 120.499045);
        mMap.addMarker(new MarkerOptions().position(SanJose).title("Marker in Vi-Ann House"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SanJose));

        mMap.addPolyline(new PolylineOptions()

                .add(new LatLng(15.987206, 120.499045),
                        new LatLng(15.986933, 120.499163),
                        new LatLng(15.987822, 120.499842),
                        new LatLng(15.987866, 120.500066),
                        new LatLng(15.987588, 120.501185),
                        new LatLng(15.987588, 120.501185),
                        new LatLng(15.987334, 120.502161),
                        new LatLng(15.984266, 120.502137),
                        new LatLng(15.981376, 120.502780),
                        new LatLng(15.981724, 120.504141),
                        new LatLng(15.982956, 120.507531),
                        new LatLng(15.983287, 120.510332),
                        new LatLng(15.983421, 120.512746),
                        new LatLng(15.980225, 120.514688),
                        new LatLng(15.982376, 120.524787),
                        new LatLng(15.982457, 120.525441),
                        new LatLng(15.982007, 120.528085),
                        new LatLng(15.981398, 120.531332),
                        new LatLng(15.979803, 120.536718),
                        new LatLng(15.975162, 120.545459),
                        new LatLng(15.974773, 120.547318),
                        new LatLng(15.974530, 120.552893),
                        new LatLng(15.975020, 120.559676),
                        new LatLng(15.975312, 120.561830),
                        new LatLng(15.975584, 120.563746),
                        new LatLng(15.980006, 120.563422),
                        new LatLng(15.981802, 120.560126),
                        new LatLng(15.979605, 120.560573),

                        new LatLng(15.979605, 120.560573))

                .width(10)
                .color(Color.GREEN));



    }


}