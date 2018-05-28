------------------------
feign					|
------------------------
	# ����һ������ʽ��WebService�ͻ���
		* ʹ��Feign���ñ�дWebService�ͻ��˸��ӵļ�
		* ����ʹ�÷����Ƕ���һ�����,Ȼ���ڽӿ������ע��,ͬʱҲ֧��JAX-RS��׼��ע��
		* FeignҲ֧�ֿ��Ȱβ�ʽ�ı���ͽ�����

	# SpringCloud��Feign�����˷�װ,ʹ��֧����SpringMVC��׼ע���HttpMessageConverters

	# Feign���Ժ�Eureka,Ribbon���ʹ��,��֧�ָ��ؾ���
		* FeignĬ�ϼ�����Ribbon,����Ribbonά����΢�����ṩ�ߵ��б���Ϣ,����ͨ����ѯʵ���˿ͻ��˵ĸ��ؾ���
		* ��Ribbon��ͬ,feignֻ��Ҫ�������󶨽ӿ���������ʽ�ķ���,�򵥶������ŵ�ʵ���˷���ĵ���

	# ����
		<!-- https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-feign -->
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-feign</artifactId>
			<version>1.4.4.RELEASE</version>
		</dependency>

------------------------
��������				|
------------------------
	# ע�⿪��
		@EnableFeignClients
		@SpringBootApplicatoon
		@EnableEurekaClient

			* ͨ�� @EnableFeignClients ������Feign����

	# ����ӿ�
		@FeignClient("USER-SERVICE")
		public interface UserService {
			
			@GetMapping("/user/{userId}")
			User getById (@PathVariable("userId")Integer id);
		}
		
		* @FeignClient ͨ����ע��,ָ��΢���������
		* ʹ��·��ע��(@GetMapping)��ָ������·��,ͨ�� @PathVariable ���󶨲���
		* ��mybatis��mapperһ��,��̬����ʵ������IOC��

	# ʹ�� FeignClient �ӿ�
		
		@Autowired
		private UserService userService;
		
		@GetMapping("/user")
		public User getUser(@RequestParam("id")int id){
			//�Խӿڵ���ʽ����΢����
			return this.userService.getById(id);
		}
	


