package com.sndj;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;

import java.io.InputStream;

/**
 * @author yuechao 2018/10/16
 */
public class BaseTest {

    protected SqlSessionFactory sqlSessionFactory = null;

    protected Gson gson = new GsonBuilder().serializeNulls().create();

    @Before
    public void setUp() {
        InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("configuration.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    }
}
