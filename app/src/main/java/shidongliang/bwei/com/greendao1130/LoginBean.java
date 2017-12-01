package shidongliang.bwei.com.greendao1130;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Transient;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by muhanxi on 17/11/30.
 */

@Entity(nameInDb = "test" /**,indexes = {@Index(value="username,password")} **/ )
public class LoginBean {

    @Id(autoincrement = true)
    public Long id;
    @NotNull
    @Property(nameInDb = "nn")
    public String username;
    public String password;
    @Transient
    public String des ;
    @Generated(hash = 1360207348)
    public LoginBean(Long id, @NotNull String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
    @Generated(hash = 1112702939)
    public LoginBean() {
    }

    public LoginBean(String username, String password) {
        this.username = username;
        this.password = password;
    }
        public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUsername() {
        return this.username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "LoginBean{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", des='" + des + '\'' +
                '}';
    }
}
