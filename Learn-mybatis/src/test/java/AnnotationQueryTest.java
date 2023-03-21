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
}
