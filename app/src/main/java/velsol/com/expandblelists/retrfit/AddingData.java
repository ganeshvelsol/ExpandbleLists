package velsol.com.expandblelists.retrfit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import velsol.com.expandblelists.R;
import velsol.com.expandblelists.helpers.ApiClient;
import velsol.com.expandblelists.helpers.ApiService;
import velsol.com.expandblelists.helpers.MSG;

public class AddingData extends AppCompatActivity
{
    EditText edit;
    Switch sitch;
    AdView adviews;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adding_data);
        adviews=(AdView)findViewById(R.id.adviews);
        sitch=findViewById(R.id.sitch);
        AdRequest adRequest = new AdRequest.Builder().build();
        adviews.loadAd(adRequest);
        adviews.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
            }

            @Override
            public void onAdFailedToLoad(int errorCode)
            {
                Toast.makeText(AddingData.this, "failed to load an ad"+errorCode, Toast.LENGTH_SHORT).show();
                // Code to be executed when an ad request fails.
            }

            @Override
            public void onAdOpened()
            {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }
            @Override
            public void onAdLeftApplication()
            {
                // Code to be executed when the user has left the app.
            }
            @Override
            public void onAdClosed() {
                // Code to be executed when when the user is about to return
                // to the app after tapping on an ad.
            }
        });
        //adviews.setAdListener(new AdListener());
    }
    public void save(View view)
    {
        /*if (sitch.isChecked())
        {
            //if true write some logics
            Toast.makeText(this, "checked", Toast.LENGTH_SHORT).show();
        }
        else
        {
            //write some logics
            Toast.makeText(this, "un-checked", Toast.LENGTH_SHORT).show();

        }*/
        //here writing the lgic for uploading data into rerofit
        /*ApiService readserEmplyee = ApiClient.getClient().create(ApiService.class);
        Call<MSG> add=readserEmplyee.adding("","");
        add.enqueue(new Callback<MSG>() {
            @Override
            public void onResponse(Call<MSG> call, Response<MSG> response)
            {
                if (response.body().getResponse()==200)
                {

                }
            }

            @Override
            public void onFailure(Call<MSG> call, Throwable t) {

            }
        });*/
    }
}
