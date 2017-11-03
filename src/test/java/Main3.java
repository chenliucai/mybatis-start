import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.alibaba.fastjson.JSON;
import com.yiibai.mybatis.dao.IUser3;
import com.yiibai.mybatis.models.Post3;
import com.yiibai.mybatis.models.User3;


public class Main3 {
	private static SqlSessionFactory sqlSessionFactory;
	private static Reader reader;

	static {
		try {
			reader = Resources.getResourceAsReader("Configure3.xml");
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
			int postId = 1;
			IUser3 i=session.getMapper(IUser3.class);
			List<Post3> l =i.getPosts(postId);
//			List<User3> l =i.getPosts(postId);

			System.out.println(JSON.toJSONString(l));
			
			
//			int postId = 1;
//			Post3 post = session.selectOne("com.yiibai.mybatis.dao.IUser3.getPosts", postId); 
//			System.out.println("title: "+post.getTitle());
//			System.out.println("userName: "+post.getUser().getUsername());
		} finally {
			session.close();
		}
	}

}
