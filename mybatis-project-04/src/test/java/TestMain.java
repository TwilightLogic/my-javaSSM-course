import com.example.dao.ClassMapper;
import com.example.dao.StudentMapper;
import com.example.entity.Class;
import com.example.entity.Student;
import com.example.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestMain {

    @Test
    public void selectByIdTest() {
        try (SqlSession sqlSession = MybatisUtils.getSession(true)) {
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

            Student student = studentMapper.selectById(2);

            System.out.println("================== (1) ==================");
            System.out.println(student);
        }
    }

    @Test
    public void updateStudentTest() {
        try (SqlSession sqlSession = MybatisUtils.getSession(true)) {
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

            int rows = studentMapper.updateStudent(new Student().setId(4).setName("李雷").setAge(21));

            System.out.println("================== (2) ==================");
            System.out.println("成功列数："+ rows);
        }
    }

    @Test
    public void selectStudentByCidTest() {
        try (SqlSession sqlSession = MybatisUtils.getSession(true)) {
            ClassMapper classMapper = sqlSession.getMapper(ClassMapper.class);

            Class _class = classMapper.selectClassById(2);

            System.out.println("================== (3) ==================");
            System.out.println(_class);
        }

    }

}
