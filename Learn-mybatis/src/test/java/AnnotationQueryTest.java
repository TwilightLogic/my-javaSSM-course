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
}
