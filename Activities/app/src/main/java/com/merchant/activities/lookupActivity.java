package com.merchant.activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class lookupActivity extends AppCompatActivity {

    public String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lookup);
    }

    public void morseClick(View view){
        //do something
        TextView button = (TextView)findViewById(view.getId());
        s = button.getText().toString();
        Log.v("lookupActivity","1 "+ s);
        TextView result = (TextView)findViewById(R.id.tvPick);
        result.setText("Select: " + s);

        /*Intent intent = new Intent();
        intent.putExtra("editTextValue", s);
        setResult(RESULT_OK, intent);
        //finish(); */

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                onUpButtonPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }

    public void onUpButtonPressed(){
        Log.v("lookupActivity","On back triggered");
        Intent intent = new Intent();
        intent.putExtra("editTextValue", s);
        setResult(RESULT_OK, intent);
        finish();
        //Intent start = new Intent(lookupActivity.this , sendActivity.class);
        //startActivity(start);
    }
}
