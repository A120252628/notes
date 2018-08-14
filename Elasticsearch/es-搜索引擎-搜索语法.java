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


------------------------------------
Query String �����﷨				|
------------------------------------
	GET /index/type/_search?q=content:elaticsearch
		* content�������elaticsearch�ؼ���	
		
	GET /index/type/_search?q=+content:elaticsearch
		*  ͬ��
		
	GET /index/type/_search?q=-content:elaticsearch
		* content����û����elaticsearch�ؼ���
	
	GET /_search
	GET /_index1,index2/type1,type2/_search
		* ����ڶ��index,type�ļ���
	
	
	* HTTPЭ��涨GETû��������,һ��Ҳ������GET�������body,��GET�����ʺ��ڼ�������
	* ���������֧�ֵĳ���,Ҳ����ʹ��:POST /_search


------------------------------------
Query String - ��ҳ	& ����			|
------------------------------------
	* ��ҳ
		GET /_search?from=0&size=10

		* from ��ʾ�ӵڼ������ݿ�ʼ
		* size ��ʾȡ��������
	
	* ����
		GET /_search?sort=age:asc

		* ����age��������


------------------------------------
DSL	- ��������						|
------------------------------------
	# ��ҳ
		{
			"from":0,
			"size":10
		}
	
	# ����
		{
			"from":1,
			"size":2,
		}

	# ��������ָ�����ֶ�
		{
			"_source":["name","id","skill.java"]	//��������ָ�����ֶ�
		}
		* ��������Documnet�����name,id����.�Լ�skill����(����)�����java����

------------------------------------
DSL	- query							|
------------------------------------

	# ��������
		{
			"query":{
				"match_all": {}    
			}
		}
	
	# �����ֶ����ݼ���
		{
			"query":{
				"match":{
					"name":"KevinBlandy"
				}
			}
		}
		* ���� name ������������� KevinBlandy �ļ�¼
		* һ��matchֻ����һ������,��֧�ֶ������
	
	# boolean ����
		* boolean ������һ�����߶������
		* ��������ö�ٹ̶�,����ֵ����Ϊ������߶���
			* must		һ�����߶������,����ȫ������
			* should	һ�����߶������,����һ������
			* must_not	һ�����߶������,����ȫ��������
		
	
	#  ��϶������
		{
			"query":{
				"bool":{
					"must":{
						"match":{
							"name":"KevinBlandy"
						}
					},
					"should":[
						{
							"match":{
								"name":"KevinBlandy"
							}
						},
						{
							"bool":{
								"must":{
									"match":{
										"name":"KevinBlandy"
									}
								},
								"must_not":{
									"match":{
										"name":"KevinBlandy"
									}
								}
							}
						}
					],
					"must_not":[
						{
							"match":{
								"name":"Litch"
							}
						}
					],
					"minimm_should_match":1
				}
			}
		}
		
		* must	����
		* should �κ�һ���������㼴��
		* minimm_should_match ����Ҫƥ�䵽һ��
			






















