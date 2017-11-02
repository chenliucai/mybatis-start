import java.io.Reader;
import java.text.MessageFormat;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.alibaba.fastjson.JSON;
import com.yiibai.mybatis.dao.IUser1;
import com.yiibai.mybatis.models.User1;

public class Main1 {
    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;

    static {
        try {
            reader = Resources.getResourceAsReader("Configure1.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SqlSessionFactory getSession() {
        return sqlSessionFactory;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SqlSession session = sqlSessionFactory.openSession();
        try {
            //sqlSessionFactory.getConfiguration().addMapper(IUser1.class);
            //User user = (User) session.selectOne( "com.yiibai.mybatis.models.UserMapper.getUserByID", 1);
       	//加上true自动提交 
        SqlSession session1 = sqlSessionFactory.openSession(true);
         IUser1 l = session1.getMapper(IUser1.class);
//            // 用户数据列表
//             System.out.println(JSON.toJSONString(l.getUser(1)));
//            // 插入数据
//         User1 user  =new User1();
//         // user.setId(2); 主键id可以不设置
//         user.setName("Google");
//         user.setDept("Tech");
//         user.setWebsite("http://www.google.com");
//         user.setPhone("120");
//         l.insertUser(user);
         
         
         //// 获取用户列表 返回list类型
//         System.out.println(JSON.toJSONString(l.getUserList()));

          //  // 更新用户
            //testUpdate();
//      	User1 user = l.getUser(1);
//      	user.setName("update");
//      	l.updateUser(user);
//      	System.out.println("成功");

//            // 删除数据
//            //testDelete();
//         List<User1> u1=l.getUserList();
//         int delid=u1.get(1).getId();
//         l.deleteUser(delid);
//         System.out.println("删除的user_id 为："+delid);

        } finally {
            session.close();
        }
    }

}
 