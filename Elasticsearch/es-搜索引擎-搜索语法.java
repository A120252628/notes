------------------------------------
Query String �����﷨				|
------------------------------------
	GET /index/type/_search?q=content:elaticsearch
		* content�������elaticsearch�ؼ���	
		
	GET /index/type/_search?q=+content:elaticsearch
		*  ͬ��
		
	GET /index/type/_search?q=-content:elaticsearch
		* content����û����elaticsearch�ؼ���
		
------------------------------------
_all metadata��ԭ�������			|
------------------------------------
	GET /_search?q=elaticsearch
		* ���е�index,���е�type,���е�document,���е�field������elaticsearch�ͷ�������
		* ��������������õ����
		* Ҳ����ͨ��urlȥ����index,type
	
	# ԭ��
		* �ڽ���������ʱ��,����һ��document,�������˶��field,��ʱes��Ѷ��field��ֵ���ַ�������,���һ���ܳ����ַ���
			{
				"name":"KevinBlandy",
				"age":23,
				"gender":"��"
			}
			=============== Ԫ����
			"KevinBlandy 23 ��"

		* ����ַ������� _all Ԫ����

	
