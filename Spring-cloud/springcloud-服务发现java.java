------------------------
������				|
------------------------
	# ��ʵ����,����ͨ��һ���ӿ�����ȡ���������Ϣ
	# DiscoveryClient
	# α����

		@Autowired
		private DiscoveryClient client;
		
		//��ȡע�����������΢������Ϣ
		client.getService();
		
		List<ServiceInstance> instances = client.getInstances("USER-SERVICE");

		for(ServiceInstance serviceInstance : instances){
			serviceInstance.getServiceId();
			serviceInstance.getHost();
			serviceInstance.getPort();
			serviceInstance.getUri();
		}