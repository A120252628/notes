----------------------------
ribbon						|
----------------------------
	# Spring Cloud Ribbon �ǻ���Netflix Ribbonʵ�ֵ�һ��'�ͻ���,���ؾ���'����
	# Ribbon��netflix�����Ŀ�Դ��Ŀ,��Ҫ�ṩ�ͻ��˵�������ؾ����㷨
	# LB(Load Balance)��΢������߷ֲ�ʽ��Ⱥ�о����õ�һ��Ӧ��
	# �����ĸ��ؾ���Nginx,LVS,Ӳ��F5
	
	# ���ؾ��������
		* Ӳ��LB
			* F5֮���,����
		* ������LB
			* ��LB�߼����ɵ����ѷ�,���ѷ���ע�����Ļ�ȡ�����ַ,�ٴӵ�ַ��ѡ��һ�����е���

----------------------------
����						|
----------------------------
	# ����
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-ribbon</artifactId>
			<version>1.4.4.RELEASE</version>
		</dependency>
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-eureka</artifactId>
			<version>1.4.4.RELEASE</version>
		</dependency>
	
	# �������ؾ���
		@Configuration
		public class RestTemplateConfig{

			@Bean
			@LoadBalance
			public RestTemplate restTemplate(){
				return new RestTemplate();
			}
		}

		* �� RestTemplate ע��Iocʱ,��� @LoadBalance ע��
		

		

	