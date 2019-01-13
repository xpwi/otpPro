/**
 * @Title: http://www.smschinese.cn/api.shtml
 * @date 2019-01-13
 * @author https://blog.csdn.net/qq_40147863
 * @version V1.0
 */
public class test {
	
	//用户名
	private static String Uid = "中国网建用户名";
	
	//接口安全秘钥
	private static String Key = "密钥在【修改短息密钥】";
	
	//手机号码，多个号码如13800000000,13800000001,13800000002
	private static String smsMob = "18322266666";
	
	//短信内容
	private static String smsText = "验证码：8888";
	
	
	public static void main(String[] args) {
		
		HttpClientUtil client = HttpClientUtil.getInstance();
		
		//UTF发送
		int result = client.sendMsgUtf8(Uid, Key, smsText, smsMob);
		if(result>0){
			System.out.println("短信发送成功！条数=="+result);
		}else{
			System.out.println(client.getErrorMsg(result));
		}
	}

}
