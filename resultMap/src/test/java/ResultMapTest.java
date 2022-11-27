import com.qiji.mybatis.mapper.DeptmentMapper;
import com.qiji.mybatis.mapper.EmployMapper;
import com.qiji.mybatis.pojo.Employ;
import com.qiji.mybatis.util.SqlsessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.Arrays;
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

    /**
     * 通过Foreach标签添加多个用户
     */
    @Test
    public void insertMoreEmploysByForeachTest(){
        SqlSessionFactory sqlSessionFactory = SqlsessionFactoryUtil.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        EmployMapper mapper = sqlSession.getMapper(EmployMapper.class);
        Employ employ = new Employ(null, "张三", 20, "男", null,null);
        Employ employ1 = new Employ(null, "张三1", 20, "男", null,null);
        Employ employ2 = new Employ(null, "张三2", 20, "男", null,null);
        List<Employ> employs = Arrays.asList(employ, employ1, employ2);
        mapper.insertByForeach(employs);
//        sqlSession.commit();
        sqlSession.close();
    }

    /**
     * 批量删除通过Foreach关键字
     */
    @Test
    public void deleteMoreEmploysByForeachTest(){
        SqlSessionFactory sqlSessionFactory = SqlsessionFactoryUtil.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        EmployMapper mapper = sqlSession.getMapper(EmployMapper.class);
        Integer[] empIds=new Integer[]{7,8};
        mapper.deleteMoreEmployByForeach(empIds);
        sqlSession.close();
    }
}
