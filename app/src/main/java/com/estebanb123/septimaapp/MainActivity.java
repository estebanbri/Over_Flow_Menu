//OverFlow Menu
package com.estebanb123.septimaapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
       // int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        //if (id == R.id.action_settings) {
      //      return true;
       // }

      //  return super.onOptionsItemSelected(item);

        RelativeLayout main_viewOBJ =(RelativeLayout)findViewById(R.id.main_view);
        switch (item.getItemId()){
            case R.id.menu_red:
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                    main_viewOBJ.setBackgroundColor(Color.RED);
                    return true;

            case R.id.menu_green:
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                main_viewOBJ.setBackgroundColor(Color.GREEN);
                return true;

            case R.id.menu_blue:
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                main_viewOBJ.setBackgroundColor(Color.BLUE);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
