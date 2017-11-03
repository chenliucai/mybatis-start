import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.alibaba.fastjson.JSON;
import com.yiibai.mybatis.dao.IUser2;
import com.yiibai.mybatis.models.Post2;
import com.yiibai.mybatis.models.User2;





public class Main2 {
	private static SqlSessionFactory sqlSessionFactory;
	private static Reader reader;

	static {
		try {
			reader = Resources.getResourceAsReader("Configure2.xml");
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
	 */public static void main(String[] args) {
			// TODO Auto-generated method stub
			SqlSession session = sqlSessionFactory.openSession();
			try {
				int userid = 1;
				IUser2 u=session.getMapper(IUser2.class);
				List<User2> l=u.getUser(2);
				System.out.println(JSON.toJSONString(l));
			 } finally {
				session.close();
			 }
		}
}
