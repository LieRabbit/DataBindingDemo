package forthedream.databindingdemo;

import android.databinding.adapters.TextViewBindingAdapter;
import android.widget.TextView;

/**
 * Created by lierabbit on 2016/9/28.
 */

public class ProductionBindingAdapter extends MyBindingAdapter
{
    @Override
    public void setText(TextView view, String value)
    {
        TextViewBindingAdapter.setText(view, value);
    }

    @Override
    public void setTextColor(TextView view, int value)
    {
        view.setTextColor(value);
    }
}
