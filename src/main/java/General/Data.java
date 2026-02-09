package General;

import java.util.ArrayList;
import java.util.List;

public class Data {
    private  String userID;
    private String userName;
    private int age;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
    public boolean equals(Object o){
        if (o == null) return false;
       // this.getClass() == o.getClass()
        if (!(o.getClass() == Data.class)){
            return false;
        }
        //List<Data> l1 =new ArrayList<>();
       // Data tempD1 = new Data();

        Data d=(Data)o;

        if(this.getUserID().equalsIgnoreCase(d.getUserID()))
            return true;
        return false;
       // if(this==o) return true;


    }
    public int hashCode(){

       return  this.userID.length() * 13;

    }
   public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("User ID : "+ this.userID);
        sb.append("User Name : "+ this.userName);
        sb.append("User Age : "+ this.age);
        return sb.toString();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
