------------------------
ServerSocketChannel		|
------------------------
	# ServerSocketChannel �̳� SelectableChannel ,������Ҳ�߱���������ģʽ,ע���¼��ķ���
	# ���� ServerSocket �Ĵ�����,������Ҳ�� accept() ����
	# �����߱� public �Ĺ��캯��,ֻ��ͨ����̬������������
		ServerSocketChannel.open();
	# ÿ�� ServerSocketChannel ���󶼺�һ�� ServerSocket ����,����ͨ��api��ȡ
		ServerSocket socket();


------------------------
ServerSocketChannel-api	|
------------------------
	serverSocketChannel.socket();
	serverSocketChannel.setOption(null,null);
	serverSocketChannel.accept();
	serverSocketChannel.register(null,5);
	serverSocketChannel.register(null,5,null);
	serverSocketChannel.bind(null);
	serverSocketChannel.bind(null,5);
	serverSocketChannel.getLocalAddress();
	serverSocketChannel.validOps();
	serverSocketChannel.blockingLock();
	serverSocketChannel.close();
	serverSocketChannel.getOption(null);
	serverSocketChannel.isBlocking();
	serverSocketChannel.isOpen();
	serverSocketChannel.isRegistered();
	serverSocketChannel.keyFor(null);
	serverSocketChannel.supportedOptions();
	serverSocketChannel.provider();
	serverSocketChannel.configureBlocking(false);