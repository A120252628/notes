------------------------
�����ṩ��				|
------------------------
	# maven����
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-eureka</artifactId>
			<version>1.3.5.RELEASE</version>
		</dependency>
	
	
	# ���������Զ�ע�ᵽע������
		@SpringBootApplication
		@EnableEurekaClient		//��ǰΪeureka�Ŀͻ���
		public class UserServiceApplication {
			
			public static void main(String[] args) {
				SpringApplication.run(UserServiceApplication.class, args);
			}
		}
		* @EnableEurekaClient ��ʾ�˵�ǰ΢������ͨ�� eureka ��ܽ��з���ע���,����ͨ��������
		* ����ʹ��:@EnableDiscoveryClient ע��,��ע����һ���ӿ�,�������������з�������Ŀ��

	# ������
		spring.application.name=example-user-service
			# ��ǰ΢���������,���Դ�д����ʽ������ eureka �Ŀ���̨

		eureka.client.service-url.defaultZone=http://localhost:10086/eureka/
			# ע�����ĵĵ�ַ

		eureka.instance.prefer-ip-address=true
			# ��eurake�������̨��,�÷������ӵĵ�ַ��ip����ʽ����,Ĭ��Ϊ������

		eureka.instance.instance-id=${spring.cloud.client.ipAddress}:${server.port}
			# �ڹܿ�̨��,ʵ�����ӵ�����
		
------------------------
�����ṩ��-info��Ϣ		|
------------------------
	# �������
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-actuator</artifactId>
		</dependency>
	
	# pom.xml ����
		* ����ֱ��������prarent/pom.xml ��,�����Ӽ�ģ�鶼��ʹ��
		<build>
			<!-- ����src/main/resources��Դ���� -->
			<resources>
				<resource>
					<directory>src/main/resources</directory>
					<filtering>true</filtering>
				</resource>
			</resources>
			<plugins>
				<plugin>
					<groupId>org.apache.maven.plugins</groupId>
					<artifactId>maven-resources-plugin</artifactId>
					<configuration>
						<delimiters>
							<!-- ������ȡֵ�߽�� -->
							<delimit>$</delimit>
						</delimiters>
					</configuration>
				</plugin>
			</plugins>
		</build>
	
	# yml
		info: 
		 app.name: atguigu-microservicecloud					//Ӧ�õ�����
		 company.name: www.atguigu.com							//��˾����
		 build.artifactId: $project.artifactId$					//artifactId,ͨ�� $xx$ ����ȡ
		 build.version: $project.version$						//version,ͨ�� $xx$ ����ȡ
		
	# �ڹ������̨,�Ϳ�����json����ʽ��ͨ�� ..../info ����ȡ���������õ�info��Ϣ

