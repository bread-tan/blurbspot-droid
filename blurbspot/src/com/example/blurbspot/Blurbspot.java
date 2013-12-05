package com.example.blurbspot;

import com.example.blurbspot.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

public class Blurbspot extends Activity {

	
	 Button buttonBlurb;
     WebView viewBlurb;
     
     
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blurbspot);
        

        
        buttonBlurb = (Button) findViewById(R.id.blurbButton);
        viewBlurb = (WebView) findViewById(R.id.blurbView);
        
        buttonBlurb.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				buttonBlurb.setVisibility(View.GONE);
				viewBlurb.loadUrl("http://www.example.com");
				
			}
		});
        
    }        

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.blurbspot, menu);
        return true;
    }
    
}
