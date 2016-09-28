package forthedream.databindingdemo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by lierabbit on 2016/9/28.
 */

public class FormModel extends BaseObservable
{
    private String mName;
    private String mPassword;

    public FormModel(String name, String password)
    {
        mName = name;
        mPassword = password;
    }

    @Bindable
    public String getName()
    {
        return mName;
    }

    public void setName(String name)
    {
        mName = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getPassword()
    {
        return mPassword;
    }

    public void setPassword(String password)
    {
        mPassword = password;
        notifyPropertyChanged(BR.password);
    }
}
