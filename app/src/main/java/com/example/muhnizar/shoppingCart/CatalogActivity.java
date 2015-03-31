package com.example.muhnizar.shoppingCart;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.muhnizar.startingappwithswipeview.R;

import java.util.List;


public class CatalogActivity extends ActionBarActivity {
    private List<Product> mProductList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog);

        // Obtain a reference to the product catalog
        ShoppingCartHelper.getCatalog(getResources());

        // Create the list
        ListView listViewCatalog =(ListView) findViewById(R.id.listViewCatalog);
        listViewCatalog.setAdapter(new ProductAdapter(mProductList, getLayoutInflater(),false));

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_catalog, menu);
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