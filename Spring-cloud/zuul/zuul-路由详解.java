----------------------------
����ӳ�����				|
----------------------------
	# ��ʵ������
		zuul:
		 routes:
		  user-api:
		   path:/api/**					**/
		   url:http://springboot.io/
		
		*  /api/user/1 �ᱻת���� ==> http://springboot.io/user1
	
	#  ��ʵ������
		zuul:
		 routes:
		  user-api:
		   serviceId: USER
		   path:/api/**					**/
		
		ribbon.eureka.enabled=false
		USER.ribbon.listOfServers=http://localhost:8080/,http://localhost:8081/

		* ���ǰѶ�path�ķ���,ת����������ΪUSER�ķ����б�
		* USER�Ǹ��Զ���ķ�������


	# ����·������
		zuul:
		 ignored-service: USER
		 routes:
		  user:
		   serviceId: USER
		   path: /myuser/**								**/

		
		* ignored-service ���ԷǱ���,���Ĵ��ھ��Ƿϳ�ָ�������ԭ�з��ʵ�ַ
			* Ҳ����˵,����ʹ��routes������µ�ַ
			* �����ֵΪ: * (�Ǻ�),���ʾ�ϳ����е�΢����ԭʼ���ʵ�ַ

		* routes ����һ��Map
		* ���涨����:
			·������.serviceId: ��������
			·������.path: �����µķ��ʵ�ַ
		
		* http://����ip:���ض˿�/·������/�ӿڵ�ַ
	

	# ����ͳһ����ǰ׺
		zuul:
		 predix: /api
	
		* ���е�΢����ǰ�涼Ҫ��: /api
	
----------------------------
�Զ���·��ӳ�����			|
----------------------------
	# ʵ����:PatternServiceRouteMapper
		
		@Bean
		public PatternServiceRouteMapper patternServiceRouteMapper(){
			return new PatternServiceRouteMapper("<name>","${name}");
		}

		* ����ʹ��������ƥ���ת����·��
	