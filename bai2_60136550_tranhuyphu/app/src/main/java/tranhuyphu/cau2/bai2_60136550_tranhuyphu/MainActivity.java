package tranhuyphu.cau2.bai2_60136550_tranhuyphu;
import java.util.ArrayList;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {
    EditText txtten;
    TextView txtchon;
    Button btn;
    ListView lv;
    ArrayList<String>  arrList=null;
    ArrayAdapter<String> adapter=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtten=(EditText) findViewById(R.id.txtTen);
        txtchon=(TextView) findViewById(R.id.txtselection);

        lv=(ListView) findViewById(R.id.lvperson);
        arrList=new ArrayList<String>();
        adapter=new ArrayAdapter<String>
                (this,
                        android.R.layout.simple_list_item_1,
                        arrList);
        lv.setAdapter(adapter);

        btn=(Button) findViewById(R.id.btnNhap);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                arrList.add(txtten.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> a0,View a1, int a2,long a3) {
                txtchon.setText("position : "+ a2+ "; value ="+arrList.get(a2));
            }
        });
    }
}