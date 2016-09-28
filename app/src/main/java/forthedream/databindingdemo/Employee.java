package forthedream.databindingdemo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingConversion;
import android.databinding.ObservableArrayMap;
import android.databinding.ObservableBoolean;
import android.net.Uri;
import android.util.Log;

import com.facebook.drawee.view.SimpleDraweeView;

/**
 * Created by lierabbit on 2016/9/25.
 */

public class Employee extends BaseObservable
{
    private String firstName;
    private String lastName;
    private String img;
    private Uri imgUri;
    private ObservableBoolean isFired = new ObservableBoolean();

    public ObservableArrayMap<String, String> getUser()
    {
        return user;
    }

    public void setUser(ObservableArrayMap<String, String> user)
    {
        this.user = user;
    }

    private ObservableArrayMap<String, String> user = new ObservableArrayMap<>();

    public Employee(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        isFired.set(false);
        user.put("hello1","world1");
        user.put("hello2","world2");
        user.put("hello3","world3");
    }

    public Employee(String firstName, String lastName, boolean fired)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        isFired.set(fired);
    }

    @Bindable
    public String getFirstName()
    {
        return this.firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
        notifyPropertyChanged(forthedream.databindingdemo.BR.firstName);
    }

    @Bindable
    public String getLastName()
    {
        return this.lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
        notifyPropertyChanged(forthedream.databindingdemo.BR.lastName);
    }

    public void setFired(boolean fired)
    {
        isFired.set(fired);
    }

    public ObservableBoolean isFired()
    {
        return isFired;
    }

    public String getImg()
    {
        return img;
    }

    public void setImg(String img)
    {
        this.img = img;
        imgUri = Uri.parse(img);
    }

    public Uri getImgUri()
    {
        return imgUri;
    }

    public void setImgUri(Uri imgUri)
    {
        this.imgUri = imgUri;
    }

    @BindingConversion
    public static Uri convertStringToUri(String url)
    {
        return Uri.parse(url);
    }
}
