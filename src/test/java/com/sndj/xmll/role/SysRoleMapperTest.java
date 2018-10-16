package com.sndj.xmll.role;

import com.sndj.BaseTest;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @author yuechao 2018/10/16
 */
public class SysRoleMapperTest extends BaseTest {


    @Test
    public void testQueryAll() {
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            SysRoleMapper mapper = sqlSession.getMapper(SysRoleMapper.class);
            List<SysRole> roles = mapper.queryAll();
            System.out.println(gson.toJson(roles));
        }


    }
}
