package com.merchant.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.merchant.activities.databinding.ActivitySendBinding;

public class sendActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivitySendBinding binding;

    //ActivityResultLauncher<Intent> lookupResultLauncher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);

       /*ActivityResultLauncher<Intent> lookupResultLauncher = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {
                        if (result.getResultCode() == Activity.RESULT_OK) {
                            // There are no request codes
                            //Intent data = result.getData();
                            String str = result.getData().getStringExtra("editTextValue");
                            TextView resulTtext = (TextView)findViewById(R.id.result);
                            resulTtext.setText("Select: " + str);

                        }
                    }
                }); */
    }

    public void goToLookup(View view){
        Intent intent = new Intent(sendActivity.this, lookupActivity.class);
        startActivity(intent);
        startActivityForResult(intent,1);
        //Intent intent = new Intent(this, lookupActivity.class);
        //lookupResultLauncher.launch(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode,@Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.v("sendActivity","activity result run");
        if(requestCode == 1){
            if(resultCode == RESULT_OK){
                String str = data.getStringExtra("editTextValue");
                TextView result = (TextView)findViewById(R.id.result);
                result.setText("Select: " + str);
            }
        }
    }
}