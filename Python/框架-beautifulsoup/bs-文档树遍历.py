-----------------------
�ӽڵ�					|
-----------------------
	* �����ĵ�����򵥵ķ������Ǹ����������ȡ��tag��name
		soup.head.title
		# ��ȡ�ĵ��� head ��ǩ�µ� titile ��ǩ
		
		* ͨ�����ַ�ʽ,ֻ�ܻ�ȡ��ָ�����Ƶĵ�һ����ǩ
	
	* ��ȡ�ĵ��е����б�ǩ,��Ҫʹ�� find_all(),����list
		soup.find_all('a')
	
	* �������Ի�ȡ�ӽڵ���Ϣ
		contents 
			* ����list,��ǰ��ǩ'����ֱ����Ԫ�ؼ���',�����ı��ڵ�(bs4.element.NavigableString)
			* '�ַ����ڵ�û�и�����'
		
		children 
			* ���ص�����,��ǰ��ǩ��'����ֱ����Ԫ��'
		
		descendants
			* ���ص�ǰ��ǩ��'������Ԫ��'
			* �ݹ�
	
	* ���tagֻ��һ�� NavigableString �����ӽڵ�,��ô���tag����ʹ�� .string �õ��ӽڵ�
		soup.head.title.string

		* ���tagֻ��һ���ӱ�ǩ,���tagҲ����ֱ��ͨ�� .string ��ȡ��Ψһ�ӱ�ǩ�ı�ǩ��
			<head><title>Title</title></head>
			soup.head.string
			# Title
	
	* ͨ�� strings ��ȡ���е����ı���Ϣ,�ݹ��ȡ
		soup.strings

		* ���ص��ǵ�����
		* ʹ�� stripped_strings ���Ժ��Ե����еĿհ���Ϣ
	
	
		
		
