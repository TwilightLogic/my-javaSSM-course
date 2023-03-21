import com.itheima.mapper.WorkerMapper;
import com.itheima.pojo.Worker;
import com.itheima.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class AnnotationQueryTest {

    @Test
    public void annotationFindWorkerByIdTest() {
        try (SqlSession sqlSession = MybatisUtils.getSession(true)) {
            WorkerMapper workerMapper = sqlSession.getMapper(WorkerMapper.class);

            Worker worker = workerMapper.selectWorker(1);

            System.out.println(worker);
        }
    }

    @Test
    public void annotationInsertWorkerTest() {
        try (SqlSession sqlSession = MybatisUtils.getSession(true)) {
            WorkerMapper workerMapper = sqlSession.getMapper(WorkerMapper.class);

            int result = workerMapper.insertWorker(new Worker().setName("Juliet").setAge(22).setSex("女").setWorker_id(4));

            System.out.println(result);
        }
    }

    @Test
    public void annotationUpdateWorkerTest() {
        try (SqlSession sqlSession = MybatisUtils.getSession(true)) {
            WorkerMapper workerMapper = sqlSession.getMapper(WorkerMapper.class);

            int result = workerMapper.updateWorker(new Worker().setName("Damn").setAge(42).setId(1));

            System.out.println(result);
        }
    }

    @Test
    public void annotationDeleteWorkerTest() {
        try (SqlSession sqlSession = MybatisUtils.getSession(true)) {
            WorkerMapper workerMapper = sqlSession.getMapper(WorkerMapper.class);

            int result = workerMapper.deleteWorker(1);
            if (result > 0) {
                System.out.println(result);
            } else {
                System.out.println("Failed to delete data!");
            }
        }
    }
}
