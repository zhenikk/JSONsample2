package com.eugens.jsonsample2;

import android.app.Activity;
import android.os.Environment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JSONUtil jsonUtil = new JSONUtil(this);
        jsonUtil.JSONToObject();

/*
        String JSONData = text.toString();
                = ""
                + "{\"results\":{\"aname\":\"value\", \"anumber\":1234, \"aboolean\":false, "
                + "\"anarray\":[{\"arrayelement\":\"Array Element 1\"}, {\"arrayelement\":\"Array Element 2\"}]}}";

        try {
            JSONObject overallJSONObject = new JSONObject(JSONData);
            Log.v("SIMPLEJSON", overallJSONObject.toString());

            JSONObject resultsObject = overallJSONObject
                    .getJSONObject("results");
            Log.v("SIMPLEJSON", resultsObject.toString());

            String aname = resultsObject.getString("aname");
            Log.v("SIMPLEJSON", aname);

            int anumber = resultsObject.getInt("anumber");
            Log.v("SIMPLEJSON", "" + anumber);

            boolean aboolean = resultsObject.getBoolean("aboolean");
            Log.v("SIMPLEJSON", "" + aboolean);

            JSONArray anarray = resultsObject.getJSONArray("anarray");
            for (int i = 0; i < anarray.length(); i++) {
                JSONObject arrayElementObject = anarray.getJSONObject(i);
                String arrayelement = arrayElementObject
                        .getString("arrayelement");
                Log.v("SIMPLEJSON", arrayelement);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
*/
    }


}
