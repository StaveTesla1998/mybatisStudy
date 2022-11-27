import com.qiji.mybatis.mapper.EmployMapper;
import com.qiji.mybatis.pojo.Employ;
import com.qiji.mybatis.util.SqlsessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

public class ResultMapTest {
    @Test
    public void selectEmpByIdTest(){
        SqlSessionFactory sqlSessionFactory = SqlsessionFactoryUtil.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmployMapper mapper = sqlSession.getMapper(EmployMapper.class);
        Employ employ = mapper.selectEmpById(1);
        sqlSession.close();
        System.out.println(employ);
    }

    @Test
    public void selectEmpDepByIdTest(){
        SqlSessionFactory sqlSessionFactory = SqlsessionFactoryUtil.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmployMapper mapper = sqlSession.getMapper(EmployMapper.class);
        Employ employ = mapper.selectEmpDepById(1);
        sqlSession.close();
        System.out.println(employ);
    }
}
