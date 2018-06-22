
--------------------------------------
springboot����	https				  |
--------------------------------------
	# ʹ��jdkϵͳ��������֤��
		

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


	server.http2.enabled=true    //����HTTP2  

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