package shidongliang.bwei.com.greendao1130;

import android.app.Application;



import org.greenrobot.greendao.database.Database;

import shidongliang.bwei.com.greendao1130.dao.DaoMaster;
import shidongliang.bwei.com.greendao1130.dao.DaoSession;

/**
 * Created by muhanxi on 17/11/30.
 */

public class IApplication extends Application {

    public static DaoSession session;

    @Override
    public void onCreate() {
        super.onCreate();


        DaoMaster.DevOpenHelper devOpenHelper =  new DaoMaster.DevOpenHelper(this,"1509D");

//        Database database = devOpenHelper.getEncryptedWritableDb("1509D");
        Database database =  devOpenHelper.getWritableDb();

        session = new DaoMaster(database).newSession();

    }
}
