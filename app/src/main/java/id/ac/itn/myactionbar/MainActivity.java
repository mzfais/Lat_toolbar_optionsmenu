package id.ac.itn.myactionbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_item, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu1:
                Toast.makeText(this, "Klik Menu Edit", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu2:
                Toast.makeText(this, "Klik Menu Setting", Toast.LENGTH_SHORT).show();
                return true;
        }
        return false;
    }
}


    /*SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        if (searchManager != null) {
                SearchView searchView = (SearchView) menu.findItem(R.id.menucari).getActionView();
                searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
                searchView.setQueryHint(getResources().getString(R.string.search_hint_text));
                searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
@Override
public boolean onQueryTextSubmit(String s) {
        Toast.makeText(MainActivity.this, "Anda mencari " + s, Toast.LENGTH_SHORT).show();
        // akhiri dengan menutup keyboard
        return true;
        }

@Override
public boolean onQueryTextChange(String s) {
        textView.setText(s);
        return true;
        }
        });

        }*/