import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.alibaba.fastjson.JSON;
import com.yiibai.mybatis.dao.IUser;
import com.yiibai.mybatis.models.User;


public class Main {
    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;
    static {
        try {
            reader = Resources.getResourceAsReader("Configure.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            sqlSessionFactory.getConfiguration().addMapper(IUser.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public static SqlSessionFactory getSession() {
//        return sqlSessionFactory;
//    }

    public static void main(String[] args) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            IUser iuser = session.getMapper(IUser.class);
            User user = iuser.getUserByID(1);
            System.out.println(JSON.toJSONStringWithDateFormat(user, "yyyy-MM-dd HH:mm:ss"));
        } finally {
            session.close();
        }
    }
}