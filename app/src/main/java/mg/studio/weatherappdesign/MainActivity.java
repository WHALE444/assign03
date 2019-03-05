package mg.studio.weatherappdesign;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClick(View view) {
        new DownloadUpdate().execute();
    }


    private class DownloadUpdate extends AsyncTask<String, Void, String> {


        @Override
        protected String doInBackground(String... strings) {
            String stringUrl = "http://t.weather.sojson.com/api/weather/city/101040100?tdsourcetag=s_pctim_aiomsg";
            HttpURLConnection urlConnection = null;
            BufferedReader reader;

            try {
                URL url = new URL(stringUrl);

                // Create the request to get the information from the server, and open the connection
                urlConnection = (HttpURLConnection) url.openConnection();

                urlConnection.setRequestMethod("GET");
                urlConnection.connect();

                // Read the input stream into a String
                InputStream inputStream = urlConnection.getInputStream();
                StringBuffer buffer = new StringBuffer();
                if (inputStream == null) {
                    // Nothing to do.
                    return null;
                }
                reader = new BufferedReader(new InputStreamReader(inputStream));

                String line;
                while ((line = reader.readLine()) != null) {
                    // Mainly needed for debugging
                    Log.d("TAG", line);
                    buffer.append(line + "\n");
                }

                if (buffer.length() == 0) {
                    // Stream was empty.  No point in parsing.
                    return null;
                }
                //The temperature
                return buffer.toString();

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (ProtocolException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(String jsondata) {
            String t, l,d,d0,d1,d2,d3,d4;
            try {
                JSONObject root1 = new JSONObject(jsondata);
                String data = root1.getString("data");
                JSONObject root2 = new JSONObject(data);
                String cityInfo = root1.getString("cityInfo");
                JSONObject root3 = new JSONObject(cityInfo);
                d= root1.getString("date");
                t = root2.getString("wendu");
                l = root3.getString("city");

                JSONArray array= root2.getJSONArray("forecast");
                d0 = array.getJSONObject(0).getString("week");
                d1 = array.getJSONObject(1).getString("week");
                d2 = array.getJSONObject(2).getString("week");
                d3 = array.getJSONObject(3).getString("week");
                d4 = array.getJSONObject(4).getString("week");

                ((TextView) findViewById(R.id.temperature_of_the_day)).setText(t);
                ((TextView) findViewById(R.id.tv_date)).setText(d);
                ((TextView) findViewById(R.id.tv_location)).setText(l);
                ((TextView) findViewById(R.id.tv_day)).setText(d0);
                ((TextView) findViewById(R.id.tv_d1)).setText(d1);
                ((TextView) findViewById(R.id.tv_d2)).setText(d2);
                ((TextView) findViewById(R.id.tv_d3)).setText(d3);
                ((TextView) findViewById(R.id.tv_d4)).setText(d4);

                if(array.getJSONObject(0).getString("type").equals("小雨")) {
                    ((ImageView) findViewById(R.id.img_weather_condition)).setImageResource(R.drawable.rainy_small);
                }
                else if(array.getJSONObject(0).getString("type").equals("多云")){
                    ((ImageView) findViewById(R.id.img_weather_condition)).setImageResource(R.drawable.windy_small);
                }
                else if(array.getJSONObject(0).getString("type").equals("阴")){
                    ((ImageView) findViewById(R.id.img_weather_condition)).setImageResource(R.drawable.partly_sunny_small);
                }
                else if(array.getJSONObject(0).getString("type").equals("晴")){
                    ((ImageView) findViewById(R.id.img_weather_condition)).setImageResource(R.drawable.sunny_small);
                }

                if(array.getJSONObject(1).getString("type").equals("小雨")) {
                    ((ImageView) findViewById(R.id.si1)).setImageResource(R.drawable.rainy_small);
                }
                else if(array.getJSONObject(1).getString("type").equals("多云")){
                    ((ImageView) findViewById(R.id.si1)).setImageResource(R.drawable.windy_small);
                }
                else if(array.getJSONObject(1).getString("type").equals("阴")){
                    ((ImageView) findViewById(R.id.si1)).setImageResource(R.drawable.partly_sunny_small);
                }
                else if(array.getJSONObject(1).getString("type").equals("晴")){
                    ((ImageView) findViewById(R.id.si1)).setImageResource(R.drawable.sunny_small);
                }

                if(array.getJSONObject(2).getString("type").equals("小雨")) {
                    ((ImageView) findViewById(R.id.si2)).setImageResource(R.drawable.rainy_small);
                }
                else if(array.getJSONObject(2).getString("type").equals("多云")){
                    ((ImageView) findViewById(R.id.si2)).setImageResource(R.drawable.windy_small);
                }
                else if(array.getJSONObject(2).getString("type").equals("阴")){
                    ((ImageView) findViewById(R.id.si2)).setImageResource(R.drawable.partly_sunny_small);
                }
                else if(array.getJSONObject(2).getString("type").equals("晴")){
                    ((ImageView) findViewById(R.id.si2)).setImageResource(R.drawable.sunny_small);
                }

                if(array.getJSONObject(3).getString("type").equals("小雨")) {
                    ((ImageView) findViewById(R.id.si3)).setImageResource(R.drawable.rainy_small);
                }
                else if(array.getJSONObject(3).getString("type").equals("多云")){
                    ((ImageView) findViewById(R.id.si3)).setImageResource(R.drawable.windy_small);
                }
                else if(array.getJSONObject(3).getString("type").equals("阴")){
                    ((ImageView) findViewById(R.id.si3)).setImageResource(R.drawable.partly_sunny_small);
                }
                else if(array.getJSONObject(3).getString("type").equals("晴")){
                    ((ImageView) findViewById(R.id.si3)).setImageResource(R.drawable.sunny_small);
                }

                if(array.getJSONObject(4).getString("type").equals("小雨")) {
                    ((ImageView) findViewById(R.id.si4)).setImageResource(R.drawable.rainy_small);
                }
                else if(array.getJSONObject(4).getString("type").equals("多云")){
                    ((ImageView) findViewById(R.id.si4)).setImageResource(R.drawable.windy_small);
                }
                else if(array.getJSONObject(4).getString("type").equals("阴")){
                    ((ImageView) findViewById(R.id.si4)).setImageResource(R.drawable.partly_sunny_small);
                }
                else if(array.getJSONObject(4).getString("type").equals("晴")){
                    ((ImageView) findViewById(R.id.si4)).setImageResource(R.drawable.sunny_small);
                }

                Toast toastCenter = Toast.makeText(getApplicationContext(),"更新完成",Toast.LENGTH_LONG);


                toastCenter.setGravity(Gravity.CENTER,0,0);


                toastCenter.show();

            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
    }
}