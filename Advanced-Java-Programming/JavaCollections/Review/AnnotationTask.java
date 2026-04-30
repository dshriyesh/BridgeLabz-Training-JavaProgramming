import java.lang.annotation.*;
import java.lang.reflect.*;

// 17 
class Student {

    @Override
    public String toString() {
        return "Student Object";
    }

    @Deprecated
    public String getStudentCode() {
        return "OLD_CODE";
    }
}

// 18 
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface ValidRange {
    double min() default 0;
    double max() default 100;
}

class Assessment {

    @ValidRange(min = 0, max = 100)
    double marks = 120; // invalid for testing
}

class RangeValidator {

    static void validate(Object obj) throws Exception {
        for (Field field : obj.getClass().getDeclaredFields()) {

            if (field.isAnnotationPresent(ValidRange.class)) {
                field.setAccessible(true);

                double value = field.getDouble(obj);
                ValidRange range = field.getAnnotation(ValidRange.class);

                if (value < range.min() || value > range.max()) {
                    throw new Exception("Value out of range: " + value);
                }
            }
        }
    }
}

// 19 
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecution {
    String level() default "INFO";
}

class GradeService {

    @LogExecution(level = "DEBUG")
    public void calculateGrade() {
        System.out.println("Calculating grade...");
    }
}

class MethodInvoker {

    static void invoke(Object obj, String methodName) throws Exception {

        Method method = obj.getClass().getMethod(methodName);

        if (method.isAnnotationPresent(LogExecution.class)) {
            LogExecution log = method.getAnnotation(LogExecution.class);

            System.out.println("[" + log.level() + "] Invoking: " + methodName);
        }

        method.invoke(obj);
    }
}

// 21 
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface AdminOnly {}

class AdminService {

    @AdminOnly
    public void deleteUser() {
        System.out.println("User deleted");
    }
}

class AccessController {

    static void execute(Object obj, String methodName, boolean isAdmin) throws Exception {

        Method method = obj.getClass().getMethod(methodName);

        if (method.isAnnotationPresent(AdminOnly.class) && !isAdmin) {
            throw new Exception("UnauthorizedAccessException");
        }

        method.invoke(obj);
    }
}


public class AnnotationTask {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        // 17
        Student s = new Student();
        System.out.println(s.toString());
        System.out.println(s.getStudentCode()); // deprecated

        // 18
        try {
            Assessment a = new Assessment();
            RangeValidator.validate(a);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // 19
        try {
            GradeService g = new GradeService();
            MethodInvoker.invoke(g, "calculateGrade");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 21
        try {
            AdminService admin = new AdminService();
            AccessController.execute(admin, "deleteUser", false); // not admin
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}