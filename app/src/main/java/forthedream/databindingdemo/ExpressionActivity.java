package forthedream.databindingdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import forthedream.databindingdemo.databinding.ActivityExpressionBinding;

public class ExpressionActivity extends AppCompatActivity
{
    ActivityExpressionBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Employee employee = new Employee("禤","阳洋");
        employee.setImg("http://www.lierabbit.cn/media/imgs/u1878009961261575014fm21gp0.jpg");
        binding = DataBindingUtil.setContentView(this,R.layout.activity_expression);
        binding.setEmployee(employee);
    }
}
