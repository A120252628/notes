------------------------
ע������				|
------------------------
	# maven����
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-eureka-server</artifactId>
			<version>1.3.5.RELEASE</version>
		</dependency>
	
	# ���� eureka server
		@SpringBootApplication
		@EnableEurekaServer			//ͨ�� @EnableEurekaServer ע�⿪�� eureka ע������
		public class RegisterApplication {
			public static void main(String[] args)throws Exception{
				SpringApplication.run(RegisterApplication.class,args);
			}
		}


	# ������
		
		eureka.instance.name=localhost
			# eureka����˵�ʵ������
		eureka.client.fetch-registry=false
			# ��ǰeureka ������Ϊע������(server),����ȥ��������
		eureka.client.register-with-eureka=false
			# ��ǰeureka�����䵱ע������,�����Լ���Ϊ�����ṩ�ߵ�ע����Ϊ
			

		eureka.client.service-url.defaultZone=http://localhost:${server.port}/eureka/
			# �����ṩ�߽���ע��ĵ�ַ,���Ǿ߱�Ĭ��ֵ��


------------------------
���ұ�������			|
------------------------
# Ĭ�������,Eureka��һ��ʱ����û�н��յ�ĳ��΢����ʵ��������,Eureka��ע����ʵ��(Ĭ��90��)
	* ����,������������Ϸ���ʱ,΢������Eureka֮���޷�����ͨ��,������Ϊ���ܱ�÷ǳ�Σ����
	* ��Ϊ΢�������ǽ�����,'��Ӧ��ע����΢����',Eurekaͨ��'���ұ�������',������������
	* ��Eurake�ڵ��ڶ�ʱ���ڶ�ʧ�˹���Ŀͻ���(�����ṩ��)ʱ,��ô����ڵ�ͻ�������ұ���ģʽ
	* �����ģʽ��,Eurake�ᱣ������ע����е���Ϣ,���ٽ���ɾ�����е�����(Ҳ����˵����ע���κη���)
	* ��������ϻָ�ʱ,�Զ��˳����ұ���ģʽ

# �����ұ���ģʽ��,Eurake�ᱣ��ע����е���Ϣ,����ɾ���κη���ʵ��
	* �����յ������������»ָ�����ֵ����ʱ,Eurake Server�ڵ�ͻ��Զ��˳����ұ���ģʽ
	* ���������ѧ����:'���ɱ�������ķ���ע����Ϣ,Ҳ��äĿע���κο��ܽ����ķ���ʵ��'

# ���ұ���ģʽ��һ�ֶ�Ӧ'�����쳣�İ�ȫ��������ʩ'
	* ���ļܹ���ѧ������ͬʱ��������΢����(��ص�΢����,�Ͳ������ķ��񶼻ᱣ��)
	* ʹ�����ұ���ģʽ,������Eurake��Ⱥ���ӽ�׳�ĵ�

# �������ұ���ģʽ
	eureka.server.enable-self-preservation=false
