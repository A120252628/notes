----------------------------
ö�ٴ���					|
----------------------------
	# Ĭ�ϵ�ö�ٴ�����ֱ�Ӱ�ö�ٵ��������л�Ϊ�ַ���


----------------------------
��ö��ת��Ϊһ������		|
----------------------------
	
		//�������л�����
		SerializeConfig serializeConfig = new SerializeConfig();
		//ʹ�ø� api ��ָ��ö����.class,�ɱ����
		serializeConfig.configEnumAsJavaBean(PreservationModel.Category.class);
		

		//����fastjson����
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializeConfig(serializeConfig);
		
		PreservationModel preservationModel = new PreservationModel();
		preservationModel.setCategory(PreservationModel.Category.BASIS);
		preservationModel.setId(1);
		
		//�����л�����ʱ��,����fastjsonConfig����serializeConfig
		System.out.println(JSON.toJSONString(preservationModel, serializeConfig));
		