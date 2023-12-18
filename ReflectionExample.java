import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ReflectionExample {
    public static void main(String[] args) {
        try {
            Class aClass = Class.forName("java.util.ArrayList");
            //用反射拿到ArrayList的构造方法
         // Constructor<?> constructor = aClass.getConstructor();
            /**
             *   newInstance()反射出一个对象，反射就是反编译
             * */
           List<String> list = (ArrayList)aClass.newInstance();
            list.add("Hello");
            System.out.println(list.toString());
/**
 * catch可以有多个
 * */
        } catch (Exception e) {
            e.printStackTrace();
        }
       /* try {
            // 获取 Class 对象
            Class<?> clazz = Class.forName("java.util.ArrayList");

            // 实例化对象
            Object obj = clazz.getDeclaredConstructor().newInstance();

            // 获取字段
            Field field = null;

                field = clazz.getDeclaredField("size");

            field.setAccessible(true); // 设置为可访问，以访问私有字段
            field.setInt(obj, 10); // 设置字段值

            // 获取方法和属性
            Method method = clazz.getMethod("add", Object.class);
            method.invoke(obj, "Hello"); // 调用方法

            // 获取和设置构造函数
            Constructor<?> constructor = clazz.getConstructor(String.class);
            Object newObj = constructor.newInstance("New ArrayList");

            System.out.println("ArrayList size: " + field.getInt(obj));
            System.out.println("New ArrayList: " + newObj);

        } catch (Exception e){
            e.printStackTrace();
        }*/
    }
}
