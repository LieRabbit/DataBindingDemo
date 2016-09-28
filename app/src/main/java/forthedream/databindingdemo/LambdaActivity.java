package forthedream.databindingdemo;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import forthedream.databindingdemo.databinding.ActivityLambdaBinding;

public class LambdaActivity extends AppCompatActivity
{
    ActivityLambdaBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_lambda);
        mBinding.setEmployee(new Employee("禤","阳洋"));
        mBinding.setPresenter(new Presenter());
    }

    public class Presenter
    {
        public void onEmployeeClick(Employee employee)
        {
            Toast.makeText(LambdaActivity.this,"onEmployeeClick",Toast.LENGTH_SHORT).show();
        }

        public boolean onEmployeeLongClick(Employee employee, Context context)
        {
            Toast.makeText(LambdaActivity.this,"onEmployeeLongClick",Toast.LENGTH_SHORT).show();
            return true;
        }

        public void onFocusChange(Employee employee)
        {
            Toast.makeText(LambdaActivity.this,"onFocusChanged",Toast.LENGTH_SHORT).show();
        }
    }
}
