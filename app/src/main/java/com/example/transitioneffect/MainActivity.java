package com.example.transitioneffect;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.widget.Toast;

import com.example.transitioneffect.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setAct(this);
    }
    public void setEnterTransition(){
        Intent intent = new Intent(this,EnterTransitionActivity.class);
        Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
        startActivity(intent,bundle);
    }

    public void fade(){
        Intent intent = new Intent(this,FadeActivity.class);
        Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
        startActivity(intent,bundle);
    }

    public void slide(){
        Intent intent = new Intent(this,SlideActivity.class);
        Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
        startActivity(intent,bundle);
    }

    public void sharedSingletonElement(){
        Intent intent = new Intent(this,SharedSingletonElementActivity.class);
        Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(this,binding.btnSharedSingletonElement,"sharedSingletonElement").toBundle();
        startActivity(intent,bundle);
    }

    public void sharedElementGroup(){
        Intent intent = new Intent(this,SharedElementGroupActivity.class);

        Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(this,
                Pair.create(binding.btnSharedElementGroup01,"btnSharedElementGroup01"),
                Pair.create(binding.btnSharedElementGroup01,"btnSharedElementGroup02")).toBundle();
        startActivity(intent,bundle);
    }
    private void toast(String msg){
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }
}