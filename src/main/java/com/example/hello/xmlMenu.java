package com.example.hello;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class xmlMenu extends AppCompatActivity {
//    float size[]={40,50,60};
//    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_main);
    }
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu){
//        MenuInflater inflater=getMenuInflater();
//        inflater.inflate(R.menu.my_menu,menu);
//        return true;
//    }
 //   @Override
//    public boolean onOptionsItemSelected(MenuItem item){
//         textView=findViewById(R.id.textView);
//        switch (item.getItemId()){
//            case R.id.item_1:
//            textView.setTextSize(size[0]);
//            return true;
//            case R.id.item_2:
//                textView.setTextSize(size[1]);
//                return true;
//            case R.id.item_3:
//                textView.setTextSize(size[2]);
//                return true;
//                case R.id.item2:
//            Toast.makeText(this, textView.getText(), Toast.LENGTH_SHORT).show();
//            case R.id.item3_1:
//                textView.setTextColor(getResources().getColor(R.color.colorPrimary));
//                return true;
//            case R.id.item3_2:
//                textView.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
//                return true;
//        }
//        return true;
//    }
}
