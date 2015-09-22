package com.example.muhnizar.shoppingCart;

import android.media.Image;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.example.muhnizar.startingappwithswipeview.R;

import java.util.List;

public class ProductDetailsActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        // get all the resource from ShoppingCartHelper
        List<Product> catalog =  ShoppingCartHelper.getCatalog(getResources());

        // get intent if there is any information from EXTRA
        int productIndex = getIntent().getExtras().getInt(ShoppingCartHelper.PRODUCT_INDEX);

        // set the proper image and text
        //ImageView productImageView =  findViewById(R.id



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_product_details, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
