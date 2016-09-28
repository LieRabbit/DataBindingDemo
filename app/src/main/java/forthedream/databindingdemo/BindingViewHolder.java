package forthedream.databindingdemo;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by lierabbit on 2016/9/26.
 */

public class BindingViewHolder<T extends ViewDataBinding> extends RecyclerView.ViewHolder
{
    private T mBinding;

    public BindingViewHolder(T binding)
    {
        super(binding.getRoot());
        mBinding = binding;
    }

    public T getBinding()
    {
        return mBinding;
    }
}
