package shidongliang.bwei.com.greendao1130;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
@Entity
public  class NewslistBean {
        /**
         * ctime : 2017-11-30
         * title : 【超赞】“入遗”一周年！一起走近中国最美“二十四节气”
         * description : 经济日报
         * picUrl : https://zxpic.gtimg.com/infonew/0/wechat_pics_-10711431.static/640
         * url : https://mp.weixin.qq.com/s?src=16&ver=520&timestamp=1512025211&signature=IP1lGm7WDznA*xuG0Gf4cdilByyA4rqMnNQu*wuMzKt0WkugrNZNLstoU5*Vi3APtJrGuf5pse7SWONJJAUTYsYB75OLNaF*CRbiQnC5slg=
         */

        @Id(autoincrement = true)
        private Long id;
        private String ctime;
        private String title;
        private String description;
        private String picUrl;
        private String url;

        @Generated(hash = 1402622097)
        public NewslistBean(Long id, String ctime, String title, String description, String picUrl, String url) {
            this.id = id;
            this.ctime = ctime;
            this.title = title;
            this.description = description;
            this.picUrl = picUrl;
            this.url = url;
        }

        @Generated(hash = 923354944)
        public NewslistBean() {
        }

        public String getCtime() {
            return ctime;
        }

        public void setCtime(String ctime) {
            this.ctime = ctime;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public Long getId() {
            return this.id;
        }

        public void setId(Long id) {
            this.id = id;
        }


    @Override
    public String toString() {
        return "NewslistBean{" +
                "id=" + id +
                ", ctime='" + ctime + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", picUrl='" + picUrl + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}