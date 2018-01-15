package jean_camille.athielj.mytodolist;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by athielj on 15/01/2018.
 */

public class TodoActivity extends Activity implements View.OnClickListener {

    private Button validateBtn;
    private Button emptyBtn;
    private EditText todoText;
    private TextView todoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_layout);
        validateBtn = (Button)findViewById(R.id.validateBtn);
        validateBtn.setOnClickListener(this);
        emptyBtn = (Button)findViewById(R.id.emptyBtn);
        emptyBtn.setOnClickListener(this);
        todoText = (EditText)findViewById(R.id.todoText);
        todoTextView = (TextView)findViewById(R.id.todoTextView);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.validateBtn) {
            Toast.makeText(getApplicationContext(),"Ajouté à la liste",Toast.LENGTH_SHORT).show();
            todoTextView.setText("");
            todoTextView.setText(todoText.getText());
        }
        else {
            Toast.makeText(getApplicationContext(),"Liste vidée",Toast.LENGTH_SHORT).show();
            todoTextView.setText("");
        }
    }
}
