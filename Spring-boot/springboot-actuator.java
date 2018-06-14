----------------------------
�˵��״̬���				|
----------------------------
	# ����
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-actuator</artifactId>
		</dependency>
	
	# ���ö˵�
		/info ��������������Ӧ�û�����Ϣ
		/health ��������������������Ϣ
		/metrics ����������	����ָ��
		/env ��������������	����������Ϣ
		/loggers ������������־���
		/dump ������������	�߳������Ϣ
		/trace ������������������ù켣
	
	# ��ʱֻ��ʹ��/health �� /info�˵�,������ΪȨ�������޷�����
	# �����ָ���˵�Ļ�������yml�����������ص�������
		/metrics
			endpoints.metrics.sensitive: false
		all
			endpoints.sensitive: false

	# ���޸�״̬��Ϣ�ķ���·��
		endpoints.info.path: /myinfo
		endpoints.health.path: /myhealth

----------------------------
spring-boot-admin-server	|
----------------------------
	# һ�׼���ϵͳ
		* �û��ֲ�:http://codecentric.github.io/spring-boot-admin/2.0.0/
	
	# �������
		<dependency>
			<groupId>de.codecentric</groupId>
			<artifactId>spring-boot-admin-server</artifactId>
			<version>1.5.7</version>
		</dependency>

		<dependency>
			<groupId>de.codecentric</groupId>
			<artifactId>spring-boot-admin-server-ui</artifactId>
			<version>1.5.7</version>
		</dependency>
	
	# ע������
		@EnableAdminServer
		@SpringBootApplication
		public class SpringbtAdminServerApplication {
			public static void main(String[] args) {
				SpringApplication.run(SpringbtAdminServerApplication.class, args);
			}
		}
	
	# �ͻ����������
		<dependency>
			<groupId>de.codecentric</groupId>
			<artifactId>spring-boot-admin-starter-client</artifactId>
			<version>1.5.7</version>
		</dependency>
	
	# �ͻ���������Ϣ
		spring:
		  boot:
			admin:
			  url: http://localhost:8081
			  client:
				name: AdminTest
	
