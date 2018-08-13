
--------------------------------------
springboot����	https				  |
--------------------------------------
	# ʹ��jdkϵͳ��������֤��
		* ʹ�õ���$JAVA_HOME/bin/keytool ����(JAVA�����Դ��Ĺ���)

		* keytool -genkey -alias tomcat -validity 36500 -keystore D:\home\tomcat.keystore -keyalg RSA

			* -genkey		:��ʾ������Կ��
			* -alias		:��ʾ�������
			* -keyalg		:ָ����Կ�㷨
			* -validity		:��Կ��Чʱ��,Ĭ��Ϊ90��,36500.��ʾ100��
			* -keystore		:ָ����Կ�����·��

		
	
		* ���� keystore ����
			������֤��,ϵͳ��ʹ��һ����Կ��������,�������������Կ�������
		
		* ����������������ʲô?
			��һ������Ҫ,��ʾΪ�ĸ���վ��������֤��,��д����
		
		* ������֯��λ������ʲô��
			* ����
		
		* ������֯������ʲô��
			* ����
		
		* �����ڵĳ��л�������������ʲô?
			* ����
		
		* �����ڵ���,��ʡ����ʲô?
			* ����
		
		* �õ�λ������ĸ���Ҵ�����ʲô?
			* ����
		
		* CN=localhost,OU=Unknow,O=Unknow,L=Unknow,ST=Unknow,C=Unknow ��ȷ��?
			* ȷ������: y
		
		* ���� <tomcat> ��������(����� keystore ������ͬ,ֱ�ӻس�)
			* ����֤�����Կ,����Կ��������Ƿ���ͬ.
			* �����Ϊ��Ҫ,����tomcat�����ļ���ʹ��,����������keystore������һ��,������������Ҳ����
		
		* OK,��~Ŀ¼��,������ .keystore һ��֤���ļ�
			* ����,֤�鴴���ɹ�
		

	# ����
		server.ssl.enabled=true
		server.ssl.key-store=classpath:ssl/springboot.io.p12
		server.ssl.key-store-type=PKCS12/JKS
		server.ssl.key-store-password=[key.store������]
	
	# httpת��HTTPS
		* �ܶ�ʱ��,��ַ�������http,���ǻᱻת����https
		* ʵ�����������Ҫ'���������ض�'������ʵ��,��������˵���ض�����(��ͬ�������ò�ͬ��)
			TomcatEmbeddedServletContainerFactory
			JettyEmbeddedServletContainerFactory

		* ����
				@Configuration
				public class TomcatConfiguration {
					
					@Bean
					public EmbeddedServletContainerFactory embeddedServletContainerFactory(){
						TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory = new TomcatEmbeddedServletContainerFactory(){
							@Override
							protected void postProcessContext(Context context) {
								SecurityConstraint securityConstraint = new SecurityConstraint();
								securityConstraint.setUserConstraint("CONFIDENTIAL");
								SecurityCollection securityCollection = new SecurityCollection();
								securityCollection.addPattern("/*");
								securityConstraint.addCollection(securityCollection);
								context.addConstraint(securityConstraint);
							}
						};
						tomcatEmbeddedServletContainerFactory.addAdditionalTomcatConnectors(httpConnectot());
						return tomcatEmbeddedServletContainerFactory;
					}
					
					@Bean
					public Connector httpConnectot(){
						//NIO������
						Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
						connector.setScheme("http");
						connector.setPort(8080);            //�����˿�
						connector.setSecure(false);
						connector.setRedirectPort(8443);    //ת���˿�
						return connector;
					}
				}


--------------------------------------
springboot����	http2				  |
--------------------------------------
	# ����������https
	# ����Ŀǰ����ֻ��undertow֧��

		server:
		  port: 443
		  servlet:
			context-path: /
		  ssl:				//����http2����Ҫ����https	
			enabled: true
			key-store: classpath:dev_ssl/javaweb.io.keystore
			key-store-type: PKCS12
			key-store-password: a12551255
		  http2:		//����HTTP2  
			enabled: true	

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
			<exclusions>
				<exclusion>
					<groupId>org.springframework.boot</groupId>
					<artifactId>spring-boot-starter-tomcat</artifactId>
				</exclusion>
			</exclusions>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-undertow</artifactId>
		</dependency>

	# ͨ���ȸ�������鿴http2�Ƿ����ɹ�
		chrome://net-internals/#http2