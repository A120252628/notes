----------------------------
ע������					|
----------------------------
	# ����ע�����Ľڵ������Ҫ�޸�
		* ������֤��Ⱥ�ڵ������г�Ա��instance.name��һ��
		* ������ʽ���Դ��϶˿ڵ���Ϣ
		* ����ͨ������host�ļ�����ӳ��

		eureka.instance.name=localhost10086.com
		eureka.instance.name=localhost10087.com
		eureka.instance.name=localhost10088.com

	# ����ע���뷢��,Ĭ��ֵ����true,��ʵ�����ֶ�����
		fetch-registry: true
		register-with-eureka: true
	
	# ע���ַ���޸�
		* �� defaultZone ����ϵ�ǰ�ڵ���������нڵ��Ա��ע���ַ

		eureka.client.service-url.defaultZone=http://localhost10086.com:10086/eureka,http://localhost10088.com:10088/eureka
			* ��ǰ�ڵ�Ϊ:10087,����ֻ��Ҫ��� 86 �� 88 �ڵ�

----------------------------
�����ṩ��					|
----------------------------
	# ע�����ĵ�ַ�޸�
		* �����ṩ�ߵ�ע���ַ�޸�Ϊ��Ⱥ�е����нڵ�

		eureka.client.service-url.defaultZone=http://localhost10086.com:10086/eureka,http://localhost10087.com:10087/eureka,http://localhost10088.com:10088/eureka



----------------------------
����������					|
----------------------------
	# ע�����ĵ�ַ�޸�
		* �������Ѽ�������ĵ�ַ�޸�Ϊ��Ⱥ�е����нڵ�

		eureka.client.service-url.defaultZone=http://localhost10086.com:10086/eureka,http://localhost10087.com:10087/eureka,http://localhost10088.com:10088/eureka