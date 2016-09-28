package forthedream.databindingdemo;

import android.databinding.DataBindingComponent;

/**
 * Created by lierabbit on 2016/9/28.
 */

public class ProductionComponent implements android.databinding.DataBindingComponent
{
    private MyBindingAdapter mAdapter = new ProductionBindingAdapter();
    @Override
    public MyBindingAdapter getMyBindingAdapter()
    {
        return mAdapter;
    }
}
