import com.example.entity.Staff;
import com.example.mapper.StaffMapper;
import com.example.utils.MybatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;

public class TestMain {

    // 1⃣️ 根据id查询员工信息
    @Test
    public void testSelect() {
        try (SqlSession sqlSession = MybatisUtils.getSession(true)) {
            StaffMapper staffMapper = sqlSession.getMapper(StaffMapper.class);

            // 查询了id=1的学生
            System.out.println("id = 1的员工信息: " + staffMapper.selectStaffById(1));
        }
    }

    // 2⃣️ 新增员工
    @Test
    public void testInsert() {
        try (SqlSession sqlSession = MybatisUtils.getSession(true)) {
            StaffMapper staffMapper = sqlSession.getMapper(StaffMapper.class);

            int rows = staffMapper.addStaff(new Staff().setId(4).setName("Logic").setAge(21).setPosition("爹"));
            System.out.println("新增员工成功！新增了 " + rows + "行数据 💥");
        }
    }

    // 3⃣️ 根据id修改员工信息
    @Test
    public void testUpdate() {
        try (SqlSession sqlSession = MybatisUtils.getSession(true)) {
            StaffMapper staffMapper = sqlSession.getMapper(StaffMapper.class);

            int rows = staffMapper.updateStaffById(new Staff().setId(1).setName("Twilight").setAge(25).setPosition("员工"), 1);
            System.out.println("修改员工信息成功！修改了" + rows + "行数据 💥");
        }
    }

    // 4⃣️ 根据id删除员工信息
    @Test
    public void testDelete() {
        try (SqlSession sqlSession = MybatisUtils.getSession(true)) {
            StaffMapper staffMapper = sqlSession.getMapper(StaffMapper.class);

            int rows = staffMapper.deleteStaffById(4);
            System.out.println("删除员工成功！删除了" + rows + "行数据 💥");
        }
    }

}
