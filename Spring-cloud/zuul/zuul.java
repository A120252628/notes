----------------------------
zuul						|
----------------------------
	# Zuul�����˶������:·��,����,����  ...�Ⱥ��ĵ���Ҫ����
	# ·��
		* ������ⲿ����ת���������΢����ʵ����
		* ��ʵ���ⲿ����ͳһ��ڵĻ���

	# ����
		* ���������Ĵ�����̽��и�Ԥ
		* ��ʵ������У��,����ۺϵȹ��ܵĻ���
	
	# Zuul��Eureka����,��Zuul����ע��ΪEureka���������µ�Ӧ��,ͬʱ��Eureka�л�ȡ����΢�������Ϣ
		* �Ժ����΢����,����ͨ��Zuul��ת����
	
	# 'Zuul�������ջ��ǻ�ע���Eureka'


	# Maven
		<!-- https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-zuul -->
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-zuul</artifactId>
			<version>1.4.4.RELEASE</version>
		</dependency>

----------------------------
zuul-��������				|
----------------------------
	# ����
		* ��ҲҪ����һ������,ע�ᵽEureka��
		* ����,��Ҳ��Ҫ�����ṩ�ߵ���һ��eureka����
	
	# ����ע��
		@EnableZuulProxy
	
	# ͨ��·�ɽ��з���
		* Э��:��������:�˿�:��������/�ӿ�
		http://localhost:8081/user-service/user/1
		
		

