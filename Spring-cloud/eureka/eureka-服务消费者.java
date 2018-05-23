------------------------
����������				|
------------------------
	# maven����
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-eureka</artifactId>
			<version>1.3.5.RELEASE</version>
		</dependency>
	
	# ע������
		@EnableEurekaClient
		* @EnableEurekaClient ��ʾ��΢������ͨ�� eureka ��ܽ��з���ע���,����ͨ��������
		* ����ʹ��:@EnableDiscoveryClient ע��,��ע����һ���ӿ�,�������������з�������Ŀ��

	# ������
		eureka.client.register-with-eureka:false
			# ����������,��ע��
		eureka.client.service-url.defaultZone:http://localhost10086.com:10086/eureka,http://localhost10087.com:10087/eureka,http://localhost10088.com:10088/eureka
			# ע�����ĵĵ�ַ,���Eurekaע�������Ǽ�Ⱥ,�����ý����еļ�Ⱥ�ڵ���Ϣ
		
	
	# ����������
		
		//΢����ĵ�ַ(��ʵ��������)
		private static final String SERVICE_NAME = "http://USER-SERVICE";
		
		@Autowired
		private RestTemplate restTemplate;

		@GetMapping
		public ResponseEntity<Void> test(User user){
			this.restTemplate.postForObject(SERVICE_NAME + "/add",user,JSONObject.class);
		}


