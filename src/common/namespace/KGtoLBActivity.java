package common.namespace;

import java.text.DecimalFormat;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class KGtoLBActivity extends Activity {
    /** Called when the activity is first created. */
	public double standvalue = 2.20462262;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear1);
    }
    
    public void cvOnClick(View cvView)
    {
    	EditText kilogramsInput = (EditText)findViewById(R.id.txtKG);
    	Toast.makeText(this,"KG is :" + kilogramsInput.getText().toString() + "kg", 1).show();
    	
    	DecimalFormat pondsFormat = new DecimalFormat(".#####");
    	String outcome = pondsFormat.format(Integer.parseInt(kilogramsInput.getText().toString())* standvalue);
    	
    	EditText txtLBout = (EditText)findViewById(R.id.txtLB);
    	txtLBout.setText(outcome);
    }
    
    public void OnClickMainPage(View cvView)
    {
    	setContentView(R.layout.main);
    }
}