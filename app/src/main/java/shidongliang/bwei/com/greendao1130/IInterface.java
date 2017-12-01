package shidongliang.bwei.com.greendao1130;



import retrofit2.http.GET;

/**
 * Created by muhanxi on 17/11/30.
 */

public interface IInterface {

//    http://api.tianapi.com/wxnew/?key=18e883dd6b316eb1d97fd86338abbf06&num=10

    @GET("wxnew/?key=18e883dd6b316eb1d97fd86338abbf06&num=10")
    retrofit2.Call<User> get();

}
