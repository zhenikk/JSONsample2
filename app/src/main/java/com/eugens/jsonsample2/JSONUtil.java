package com.eugens.jsonsample2;

import android.content.Context;
import android.os.Environment;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eugen on 22.03.2015.
 */
public class JSONUtil {
    Context context;
    String text; //Text from file;
    List<Slide> slideList;
    public JSONUtil(Context c) {
        context = c;
    }

    public String getStringFromFile() {
        //Find the directory for the SD Card using the API
        //*Don't* hardcode "/sdcard"
        File sdcard = Environment.getExternalStorageDirectory();

        //Get the text file
        //TODO:SET PASS TO CREATE OBJECTS;
        File file = new File(sdcard, "list.txt");

        //Read text from file
        StringBuilder textString = new StringBuilder();

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                textString.append(line);
                textString.append('\n');
            }
            br.close();
        } catch (IOException e) {
            //You'll need to add proper error handling here
        }
        Log.v("TEXT:", "Our String: " + textString.toString());
        //Find the view by its id
        //  TextView tv = (TextView)findViewById(R.id.line1);
        //Set the text
        // tv.setText(text);

        return textString.toString(); //returns our file
    }

    public void JSONToObject(){
        text = getStringFromFile();
        try {
            JSONObject overallJSONObject = new JSONObject(text);
           // JSONObject alphabetObject = overallJSONObject.getJSONObject("CustomAlphabet");

            slideList=new ArrayList<Slide>();

            JSONArray jsonArray = overallJSONObject.getJSONArray("CustomAlphabet");
            for (int i = 0; i < jsonArray.length(); i++)
            {
                Slide s = new Slide();

                JSONObject arrayElementObject = jsonArray.getJSONObject(i);
                String Letter = arrayElementObject.getString("Letter");
                String Word = arrayElementObject.getString("Word");
                String Image = arrayElementObject.getString("Image");
                String Sound = arrayElementObject.getString("Sound");

                s.setLetter(Letter);
                s.setWord(Word);
                s.setImage(Image);
                s.setSound(Sound);

                slideList.add(s);

            }

            for (int i = 0; i< slideList.size();i++){
                slideList.get(i).printSlide();
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
