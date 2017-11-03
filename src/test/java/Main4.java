import java.io.Reader;
import java.security.acl.Group;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.alibaba.fastjson.JSON;
import com.yiibai.mybatis.dao.GroupMaper4;
import com.yiibai.mybatis.dao.UserGroupMaper4;
import com.yiibai.mybatis.dao.UserMaper4;
import com.yiibai.mybatis.models.Group4;
import com.yiibai.mybatis.models.User4;
import com.yiibai.mybatis.models.UserGroup4;


public class Main4 {
	private static SqlSessionFactory sqlSessionFactory;
	private static Reader reader;

	static {
		try {
			reader = Resources.getResourceAsReader("Configure4.xml");
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
		SqlSession session = sqlSessionFactory.openSession(true);
		
//		//查询User4.xml getUser 
//		UserMaper4 u = session.getMapper(UserMaper4.class);
//		User4 a =u.getUser(1);
//		System.out.println(JSON.toJSONString(a));
		
		
//		//查询Group4.xml getGroup
//		GroupMaper4 groupMaper = session.getMapper(GroupMaper4.class);
//		Group4 group = groupMaper.getGroup(1);
//		System.out.println(JSON.toJSONString(group));
//		testGetGroupAndUsers();
		
//		//user_group表插入数据
//		UserGroup4 userGroup = new UserGroup4();
//		userGroup.setGroupId(3);
//		userGroup.setUserId(2);
//			UserGroupMaper4 userGroupMaper = session
//					.getMapper(UserGroupMaper4.class);
//			userGroupMaper.insertUserGroup(userGroup);
		
		
		//下面不想试了、以上都ok，下面不确定
		
		// TODO Auto-generated method stub
		// testAddGroup();
		// testAddUser();
		// testAddUserGroup();
//		testGetGroupAndUsers();
		
	//	com.yiibai.mybatis.dao.IUser4 getUser方法
		
//		System.out.println(JSON.toJSONString(session.selectList("com.yiibai.mybatis.dao.UserGroupMaper4.getGroupsByUserId",1)));
//		int postId = 1;
//		Post3 post = session.selectOne("com.yiibai.mybatis.dao.IUser3.getPosts", postId); 
//		System.out.println("title: "+post.getTitle());
//		System.out.println("userName: "+post.getUser().getUsername());
		
	}
	




//

//
//	public static void testAddUser() {
//		// TODO Auto-generated method stub
//		SqlSession session = sqlSessionFactory.openSession();
//		try {
//			User4 user = new User4();
//			user.setUsername("User-name-1");
//			user.setMobile("13838009988");
//			UserMaper4 userMaper = session.getMapper(UserMaper4.class);
//			userMaper.insertUser(user);
//			session.commit();
//			// System.out.println(user.getGroupId());
//		} finally {
//			session.close();
//		}
//	}
//
//	public static void testAddGroup() {
//		// TODO Auto-generated method stub
//		SqlSession session = sqlSessionFactory.openSession();
//		try {
//			Group4 group = new Group4();
//			group.setGroupName("用户组-1");
//			GroupMaper4 groupMapper = session.getMapper(GroupMaper4.class);
//			groupMapper.insertGroup(group);
//			session.commit();
//			System.out.println(group.getGroupId());
//		} finally {
//			session.close();
//		}
//	}
}
