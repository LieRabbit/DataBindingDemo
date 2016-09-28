package forthedream.databindingdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import forthedream.databindingdemo.databinding.ActivityListBinding;

public class ListActivity extends AppCompatActivity
{
    ActivityListBinding mBinding;
    EmployeeAdapter mEmployeeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_list);

        mBinding.setPresenter(new Presenter());

        mBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mEmployeeAdapter = new EmployeeAdapter(this);
        mBinding.recyclerView.setAdapter(mEmployeeAdapter);
//        mEmployeeAdapter.setListener(new EmployeeAdapter.OnItemClickListener()
//        {
//            @Override
//            public void onEmployeeClick(Employee employee)
//            {
//                Toast.makeText(ListActivity.this,employee.getFirstName(),Toast.LENGTH_SHORT).show();
//            }
//        });

        List<Employee> demoList = new ArrayList<>();
        demoList.add(new Employee("禤1","阳洋1",false));
        demoList.add(new Employee("禤2","阳洋2",false));
        demoList.add(new Employee("禤3","阳洋3",true));
        demoList.add(new Employee("禤4","阳洋4",false));
        demoList.add(new Employee("禤5","阳洋5",false));
        mEmployeeAdapter.addAll(demoList);
    }

    public class Presenter
    {
        public void onClickAddItem(View view)
        {
            mEmployeeAdapter.add(new Employee("哈","哈哈",false));
        }

        public void onClickRemoveItem(View view)
        {
            mEmployeeAdapter.remove();
        }

        public void onClickItem(Employee employee)
        {
            Toast.makeText(ListActivity.this,employee.getFirstName(),Toast.LENGTH_SHORT).show();
        }
    }
}
