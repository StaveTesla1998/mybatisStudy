import com.qiji.mybatis.mapper.DeptmentMapper;
import com.qiji.mybatis.mapper.EmployMapper;
import com.qiji.mybatis.pojo.Employ;
import com.qiji.mybatis.util.SqlsessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.List;

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

    /**
     * 查询部门中的所有员工
     */
    @Test
    public void selectDeptEmpolyById(){
        SqlSessionFactory sqlSessionFactory = SqlsessionFactoryUtil.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        DeptmentMapper mapper = sqlSession.getMapper(DeptmentMapper.class);
        List<DeptmentMapper> deptmentMappers = mapper.selectDeptmentEmployById(2);
        sqlSession.close();
        System.out.println(deptmentMappers);
    }
}
