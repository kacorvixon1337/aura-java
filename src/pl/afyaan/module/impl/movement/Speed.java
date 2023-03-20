package pl.afyaan.module.impl.movement;

import pl.afyaan.module.impl.ModuleManager;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Speed {
    public static Object instance;
    public static Field motionX;
    public static Field motionY;
    public static Field motionZ;

    public static double temp_x;
    public static double temp_y;
    public static double temp_z;

    public static List<Method> xyz = new ArrayList<>();
    public static void onEnable(){
        try {
            /*double _motionX = motionX.getDouble(instance);
            double _motionY = motionY.getDouble(instance);
            double _motionZ = motionZ.getDouble(instance);*/
            if (temp_x > 0 || temp_y > 0 || temp_z > 0) {
                for (Method method : xyz) {
                    method.invoke(instance, temp_x, temp_y, temp_z);
                }
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }




}
