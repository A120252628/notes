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
		
		eureka.client.fetch-registry=false
			# ��ǰeureka ������Ϊע������(server),����ȥ��������
		eureka.client.register-with-eureka=false
			# ��ǰeureka�����䵱ע������,�����Լ���Ϊ�����ṩ�ߵ�ע����Ϊ
			

		eureka.client.service-url.defaultZone=http://localhost:${server.port}/eureka
			# �����ṩ�߽���ע��ĵ�ַ,���Ǿ߱�Ĭ��ֵ��