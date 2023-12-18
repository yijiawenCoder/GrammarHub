import java.io.*;

public class FileOperations {

    public static void main(String[] args) {
        /**
         * 绝对路径：文件在系统的位置
         * */

        //创建文件夹
        File file = new File("d:/file");
        file.mkdirs();//这个方法只能创建文件夹;
        File txtFile = new File("d:/file/a.txt");

        try {
            txtFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(file.exists());//是否存在
        // 定义文件路径
        String filePath = "D:\\ex.txt";

        try {
            // 读取文件内容
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

            // 写入文件内容
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            writer.write("Hello, World!");
            writer.close();

            // 读取文件内容并打印
            BufferedReader reader2 = new BufferedReader(new FileReader(filePath));
            String line2;
            while ((line2 = reader2.readLine()) != null) {
                System.out.println(line2);
            }
            reader2.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
