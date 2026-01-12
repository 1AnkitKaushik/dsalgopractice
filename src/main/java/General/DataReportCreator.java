package General;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class DataReportCreator extends ReportCreator {
    @Override
    void createReport(Template tObject, List<Data> dataList) {
        //System.out.println("NEW");
        //System.out.println(tObject);
        System.out.println(dataList);
        StringBuilder sb=new StringBuilder();
       // System.out.println(tObject.setConfigMap((Map<String, String>) dataList.get(1)));
       // sb.append(dataList);
        //for (User u : users) { sb.append(u.id).append(" ") .append(u.name).append(" ") .append(u.age).append("\n"); }
        for(Data d: dataList){
            sb.append(d.getUserID()).append(",").append(d.getUserName()).append(",").append(d.getAge()).append("\n");
        }
        try (FileWriter writer = new FileWriter("users.txt")) {
            writer.write(sb.toString());
            System.out.println("PrintWrite");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
