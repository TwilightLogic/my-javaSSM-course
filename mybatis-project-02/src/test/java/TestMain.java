import com.example.entity.Students;
import com.example.mapper.StudentsMapper;
import com.example.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

    @Test
    public void findStudentsByNameAndMajorTest() {
        try (SqlSession sqlSession = MybatisUtils.getSession(true)) {
            StudentsMapper studentsMapper = sqlSession.getMapper(StudentsMapper.class);

            Students students = new Students();
            students.setMajor("Physics");

            for (Students student: studentsMapper.findStudentsByNameAndMajor(students)) {
                System.out.println(student);
            }

            System.out.println("---- ⬆️ 多条件查询 ⬆️ ----");
        }
    }

    @Test
    public void findStudentsListByIdTest() {
        try (SqlSession sqlSession = MybatisUtils.getSession(true)) {
            StudentsMapper studentsMapper = sqlSession.getMapper(StudentsMapper.class);

            List<Integer> ids = new ArrayList<>();
            for (int i = 1; i < 5; i++) {
                ids.add(i);
            }

            for (Students student: studentsMapper.findStudentsListById(ids)) {
                System.out.println(student);
            }

            System.out.println("---- ⬆️ 单条件查询 ⬆️ ----");
        }
    }
}
