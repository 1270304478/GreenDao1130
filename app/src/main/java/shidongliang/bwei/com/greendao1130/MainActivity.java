package shidongliang.bwei.com.greendao1130;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import org.greenrobot.greendao.query.QueryBuilder;

import java.util.ArrayList;
import java.util.List;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import shidongliang.bwei.com.greendao1130.dao.LoginBeanDao;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*
        findViewById(R.id.insert_id).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl("http://api.tianapi.com")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

                IInterface iInterface =  retrofit.create(IInterface.class);


               iInterface.get.enqueue(new Callback<User>() {
                    @Override
                    public void onResponse(Call<User> call, Response<User> response) {


                        User user = response.body() ;

//                        IApplication.session.

                        System.out.println("user = " + user);


                        IApplication.session.getNewslistBeanDao().insertInTx(user.getNewslist());


                        List<NewslistBean> list =  IApplication.session.getNewslistBeanDao().loadAll();

                        for(NewslistBean bean : list){
                            System.out.println("bean = " + bean.toString());
                        }
                    }

                    @Override
                    public void onFailure(Call<User> call, Throwable t) {

                    }
                });




                            List<LoginBean> list = new ArrayList<>();
                for(int i=2;i<10;i++){
                    LoginBean bean = new LoginBean("username " + i,"password");
                   list.add(bean);
                }

               IApplication.session.getLoginBeanDao().insertInTx(list);


                LoginBean bean = new LoginBean(1L,"1509D","1509Dpassword");
                IApplication.session.getLoginBeanDao().insert(bean);
                bean.setUsername("muhanxi");
               IApplication.session.getLoginBeanDao().insertOrReplace(bean);


               QueryBuilder<LoginBean> queryBuilder =  IApplication.session.getLoginBeanDao().queryBuilder().where(LoginBeanDao.Properties.Username.eq("muhanxi"));
               List<LoginBean> list =  queryBuilder.list();



                IApplication.session.getLoginBeanDao().delete(list.get(0));


               IApplication.session.getLoginBeanDao().delete
                IApplication.session.insert(bean);

                IApplication.session.getLoginBeanDao().insert(bean);



              IApplication.session.getBeanDao().in 12|username 2|password


                LoginBean bean = new LoginBean(12L,"username 2","password");
                bean.setUsername("update");
                IApplication.session.getLoginBeanDao().update(bean);


                   QueryBuilder<LoginBean> queryBuilder =   IApplication.session.getLoginBeanDao().queryBuilder()                 .where(LoginBeanDao.Properties.Username.eq("update"),
                                   LoginBeanDao.Properties.Id.eq(12L));

                 List<LoginBean> beans =   queryBuilder.list();

                  for (LoginBean loginBean : beans){
                     System.out.println("loginBean = " + loginBean.toString());
                 }



               QueryBuilder queryBuilder =  IApplication.session.getLoginBeanDao().queryBuilder() ;

              List<LoginBean> loginBeans =  queryBuilder.where(LoginBeanDao.Properties.Password.eq("password")).list();

                List<LoginBean> off =  queryBuilder.where(LoginBeanDao.Properties.Password.eq("password"))
                        .orderDesc(LoginBeanDao.Properties.Id).offset(3).limit(3).list();

               for (LoginBean loginBean : loginBeans){
                     System.out.println("loginBeans = " + loginBean.toString());
                 }

                for (LoginBean loginBean : off){
                    System.out.println("off = " + loginBean.toString());
                }


               List<LoginBean> list =  IApplication.session.getLoginBeanDao().queryRaw(" where USERNAME = ?","1");

               for (LoginBean bean : list){
                  System.out.println("bean = " + bean.toString());
              }



             List<Bean> list =    IApplication.session.getBeanDao().queryRaw(" group by SEX");

              for(Bean bean : list){

                 System.out.println("bean = " + bean.toString());

             }


               List<Bean> list = new ArrayList<>();
               for(int i=0;i<10;i++){
                    list.add()
                   Bean bean = null;
                   if(i % 2 == 0){
                       bean = new Bean("name"+i,"男",i);
                    }else {
                       bean = new Bean("name"+i,"女",i);
                   }
                   list.add(bean);
}

                IApplication.session.getBeanDao().insertInTx(list);


               List<Bean> list1 =  IApplication.session.getBeanDao().loadAll();

                for (Bean bean : list1){
                    System.out.println("bean = " + bean.toString());
                }


            }
        });*/


        }
}
