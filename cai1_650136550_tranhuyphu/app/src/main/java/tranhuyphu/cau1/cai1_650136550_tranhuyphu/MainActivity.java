package tranhuyphu.cau1.cai1_650136550_tranhuyphu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton,r1,r2,r3;
    TextView textView;
    Button button;
    EditText editText,editText2,editText3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r1 = findViewById(R.id.rad13);
        r2 = findViewById(R.id.rad15);
        radioGroup = findViewById(R.id.radG);
        textView = findViewById(R.id.ViewTip);
        editText = findViewById(R.id.edtMoney);
        editText2 = findViewById(R.id.edtMoney2);
        editText3 = findViewById(R.id.edtMoney3);
        button = findViewById(R.id.btntip);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tip = editText.getText().toString();
                String tip2 = editText2.getText().toString();
                String tip3 = editText3.getText().toString();

                float money = Float.parseFloat(tip);
                float a=Float.parseFloat(tip);
                float b=Float.parseFloat(tip2);
                float c=Float.parseFloat(tip3);
                int radioId = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(radioId);
                String s = (String) radioButton.getText();
                String s1 = (String) r1.getText();
                String s2 = (String) r2.getText();
                if (s.equals(s1)) money = 2*(a + b) ;
                if (s.equals(s2)) money = a * c;
                textView.setText("kết quả:  "+ money);
            }
        });
    }
    public void checkbtn(View view) {
        int radID = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radID);
        Toast.makeText(this, "You select : " + radioButton.getText(),
                Toast.LENGTH_SHORT).show();
    }
}
