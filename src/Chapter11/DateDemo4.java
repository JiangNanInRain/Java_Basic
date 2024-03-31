package Chapter11;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

class  DateTime{
    private SimpleDateFormat df = null;
    public String  getDate(){
        this.df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        return this.df.format(new Date());

    }
    public String  getDateComplete(){
        this.df = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒SSS毫秒");
        return this.df.format(new Date());
    }
    public String getTimeStamp(){
        this.df = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        return  this.df.format(new Date());
    }

}
public class DateDemo4 {
    public static void main(String[] args) {
         DateTime d = new DateTime();
        System.out.println("系统日期:"+d.getDate());
        System.out.println("中文日期:"+d.getDateComplete());
        System.out.println("时间戳:"+d.getTimeStamp());
    }
}
