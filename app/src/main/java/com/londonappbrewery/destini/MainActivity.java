package com.londonappbrewery.destini;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
       TextView myStory;
       Button myTopButton;
       Button myBottomButton;
       int mIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        final TextView myStory = (TextView) findViewById(R.id.storyTextView);
        final Button myTopButton = (Button) findViewById(R.id.buttonTop);
        final Button myBottomButton = (Button) findViewById(R.id.buttonBottom);



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
           myTopButton.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {

                   if(mIndex == 1 )
                {   myBottomButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        myStory.setText(R.string.T5_End);
                        mIndex ++;
                        myTopButton.setVisibility(View.GONE);
                        myBottomButton.setVisibility(View.GONE);
                        Log.d("dest","the index = " + mIndex);

                    }
                });
                    myStory.setText(R.string.T3_Story);
                    myTopButton.setText(R.string.T3_Ans1);
                    myBottomButton.setText((R.string.T3_Ans2));
                   mIndex ++;
                    Log.d("dest","the index = " + mIndex);
                }
                else if (mIndex == 2 ){
                      myStory.setText((R.string.T6_End));
                       myTopButton.setVisibility(View.GONE);
                       myBottomButton.setVisibility(View.GONE);
                       Log.d("dest","the index = " + mIndex);
                   }
                   else {
                    myStory.setText(R.string.T6_End);
                       myStory.setText((R.string.T6_End));
                       myTopButton.setVisibility(View.GONE);
                       myBottomButton.setVisibility(View.GONE);
                       Log.d("dest","the index = " + mIndex);
                   }
                }
           });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
         myBottomButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if(mIndex == 1)
                 {   myTopButton.setOnClickListener(new View.OnClickListener() {
                     @Override
                     public void onClick(View view) {
                         myStory.setText(R.string.T3_Story);
                         myTopButton.setText(R.string.T3_Ans1);
                         myBottomButton.setText((R.string.T3_Ans2));
                        mIndex ++;
                         Log.d("dest","the index = " + mIndex);
                       if (mIndex == 3){
                           myTopButton.setOnClickListener(new View.OnClickListener() {
                               @Override
                               public void onClick(View view) {
                                   myStory.setText((R.string.T6_End));
                                   myTopButton.setVisibility(View.GONE);
                                   myBottomButton.setVisibility(View.GONE);
                                   Log.d("dest","the index = " + mIndex);
                               }
                           });
                       }

                     }
                 });
                     myStory.setText(R.string.T2_Story);
                     myTopButton.setText(R.string.T2_Ans1);
                     myBottomButton.setText((R.string.T2_Ans2));
                     mIndex ++;
                     Log.d("dest","the index = " + mIndex);
                 }
                 else if(mIndex == 2)
                 {
                     myStory.setText(R.string.T4_End);
                     myTopButton.setVisibility(View.GONE);
                     myBottomButton.setVisibility(View.GONE);
                     mIndex ++;
                     Log.d("dest","the index = " + mIndex);
                 }
                 else
                 {
                     myTopButton.setOnClickListener(new View.OnClickListener() {
                         @Override
                         public void onClick(View view) {
                             myStory.setText((R.string.T6_End));
                             myTopButton.setVisibility(View.GONE);
                             myBottomButton.setVisibility(View.GONE);
                             Log.d("dest","the index = " + mIndex);
                         }
                     });
                     myStory.setText(R.string.T5_End);
                     myTopButton.setVisibility(View.GONE);
                     myBottomButton.setVisibility(View.GONE);
                     Log.d("dest","the index = " + mIndex);
                 }
             }
         });

        }
}
