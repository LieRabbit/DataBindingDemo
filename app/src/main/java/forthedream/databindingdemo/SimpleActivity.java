package forthedream.databindingdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import forthedream.databindingdemo.databinding.ActivitySimpleBinding;

public class SimpleActivity extends AppCompatActivity
{
    Employee employee = new Employee("禤","阳洋");
    ActivitySimpleBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_simple);
        binding.setEmployee(employee);
        binding.setPresenter(new Presenter());
        binding.viewStub.getViewStub().inflate();
    }

    public class Presenter
    {
        public void onTextChanged(CharSequence s, int start, int before, int count)
        {
            employee.setFirstName(s.toString());
            Log.d("isFired", String.valueOf(employee.isFired().get()));
            employee.setFired(!employee.isFired().get());
        }

        public void onClick(View view)
        {
            Toast.makeText(SimpleActivity.this,"点到了",Toast.LENGTH_SHORT).show();
        }

        public void onClickListenerBinding(Employee employee)
        {
            Toast.makeText(SimpleActivity.this,employee.getLastName(),Toast.LENGTH_SHORT).show();
        }
    }
}
