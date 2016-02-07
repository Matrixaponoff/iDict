package code.elmtrixapps.idict;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import code.elmtrixapps.idict.Activities.VocabularyList;

public class MainActivity extends AppCompatActivity {

    Button bt_showVocab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_showVocab = (Button)findViewById(R.id.bt_vocab);

        bt_showVocab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), VocabularyList.class);
                startActivity(intent);
            }
        });
    }
}
