----------------------------
partial update				|
----------------------------
	# �����滻
	# �����ĵ� & �滻�ĵ�,����һ�����﷨
		PUT /index/type/id
	
	# partial update
	
		POST /index/type/id/_update
		{
			"doc":{
				"������Ҫ�޸ĵ�����,����Ҫȫ��������"
			}
		}

	# �ڲ�ԭ��
		* ��ʵes�� partial update ��ִ��,��ʵ��ȫ���滻������һ����
