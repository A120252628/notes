------------------------
Selector				|
------------------------
	* ֻҪ ServerSocketChannel ���� SocketChannel �� Selector ע�����ض����¼�
	  Selector �ͻ�����Щ�¼��Ƿ���,SelectableChannel �� register() ��������ע���¼�
	  �÷�������һ�� SelectionKey ����,�ö��������ڸ�����Щ��ע���¼��ľ��
	
	* һ�� Selector �����3�����͵� SelectionKey ����
		all-keys
			* ��ǰ������ Selector ע�� SelectionKey ����
			* Selector �� keys() �������ظü���
		
		slected-keys
			* ����¼��Ѿ��� Selector ����,�� SelectionKey ����
			* Selector �� selectedKeys() �������ظü���
		
		cancelled-keys
			* �Ѿ���ȡ���� SelectionKey �ļ���
			* Selector û���ṩ�������ּ��ϵķ���
	
	* �� SelectableChannel ִ�� register() ����ʱ,�÷������½�һ�� SelectionKey ,���������뵽 Selector �� all-keys ������
	
	* ����ر��� SelectionKey ��������� Channel ����,���ߵ����� SelectionKey ����� cancel() ����
	  ��� SelectionKey ����ͻᱻ���뵽 cancelled-key ������,��ʾ��� SelectionKey �Ѿ���ȡ��
	  ����ִ����һ�� Selector �� select() ����ʱ,��ȡ���� SelectionKey ���󽫴����м�����ɾ��
	
	* �� Selector ִ�� select() ������ʱ��,����� SelectionKey ��ص��¼�������,��� SelectionKey �ͻᱻ���뵽:selected-keys ������
	  ����ֱ�ӵ��� selected-keys ���ϵ� remove() ����,���ߵ������� Iterator ��remove() ���������Դ� selected-keys ������ɾ��һ�� SelectionKey ����
	  ��������,ֱ��ͨ�����ϼ��ϵ� remove() ����,ɾ�� all-keys �����е� SelectionKey,���������ͼ��ô��,���׳��쳣:UnsupportedOperationException

------------------------
Selector-api			|
------------------------
	