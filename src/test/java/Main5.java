import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;





import com.alibaba.fastjson.JSON;
import com.yiibai.mybatis.dao.UserMaper5;
import com.yiibai.mybatis.models.Order5;
import com.yiibai.mybatis.models.User5;



public class Main5 {
	
	private static ApplicationContext ctx;

	static {
		ctx = new ClassPathXmlApplicationContext(
				"Configuration5.xml");
		
	}
	@Autowired
	private static UserMaper5 userMaper5;
	public static void main(String[] args) {
//		UserMaper5 userMaper5 =(UserMaper5)ctx.getBean("userMaper5");

		// 测试id=1的用户查询，可根据数据库中的情况修改.
//		User5 user = userMaper.getUserById(1);
//		System.out.println("获取用户 ID=1 的用户名："+user.getUsername());
		List<Order5> orders = userMaper5.getUserOrders(1);
		System.out.println(JSON.toJSONString(orders));

//		// 得到文章列表测试
//		System.out.println("得到用户id为1的所有订单列表:");
//		System.out.println("=============================================");
//		List<Order> orders = userMaper.getUserOrders(1);
//
//		for (Order order : orders) {
//			System.out.println("订单号："+order.getOrderNo() + "，订单金额：" + order.getMoney());
//		}

	}
}
