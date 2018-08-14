--------------------
mapping				|
--------------------
	# �Զ������ֶ�Ϊindex�е�type������һ�����ݽṹ���������,���Ϊmapping
	# �鿴es�Զ�������mapping
		GET /index/_mapping/type
		{
		  "user": {
			"mappings": {
			  "coder": {
				"properties": {
				  "name": {
					"type": "text",
					"fields": {
					  "keyword": {
						"type": "keyword",
						"ignore_above": 256
					  }
					}
				  },
				  "age": {
					"type": "long"
				  },
				  "foo": {
					"type": "long"
				  },
		...
	
	# ���������һ�µ�����
		* ES�Զ�����mapping������,�����˲�ͬ��field��ͬ��data type
		* ��ͬ��data type����������,�ִ�,������Ϊ�ǲ�һ����,���Գ����� _all,field���������ֲ�һ��

	
	# ͸�����mapping
		1,��es����ֱ�Ӳ�������,es���Զ���������,ͬʱ����type�Լ���Ӧ��mapping
		2,mapping�о��Զ�������ÿ��field����������
		3,��ͬ����������(text,data),�����е���exact value,�е���full text
		4,exact value �ڽ�����������,�ִʵ�ʱ��,�ǽ�����ֵһ����Ϊһ���ؼ��ֽ��������������е�
		5,full text �ͻ�������ִ���(�ִ�,normalizationm....),�����ڵ���������
		6,exact value �� full text ��field�ڱ�������ʱ��,query string Ҳ�ᾭ����ͬ����Ϊ����
			* exact value ȫֵƥ��
			* full text �ȶ�query string���зִ�,normalizationm,�ٽ���ƥ��
		7,������es��dynamic mapping,�����Զ�����mapping(�Զ�������������),Ҳ�����ֶ�����ǰΪindex����mapping,�ֶ���ÿ��field������������,������Ϊ,�ִ���...
		8,mapping,����index��type��Ԫ����,ÿ��type����һ���Լ���mapping,��������������,����������������Ϊ,���н�����������Ϊ

--------------------
�鿴mapping			|
--------------------
	GET /index/_mapping/type
	{
	  "user": {
		"mappings": {
		  "coder": {
			"properties": {
			  "birthday": {
				"type": "text",
				"fields": {
				  "keyword": {
					"type": "keyword",
					"ignore_above": 256
				  }
				}
			  }
			}
		  }
		}
	  }
	}


--------------------
mapping-������������|
--------------------
	# ������������
		Text
		Byte,Short,Integer,Long
		Float,Double
		Boolean
		Date
	
	#  �������͵��Ʋ����
		true or false		--> Boolean
		123					--> Long
		123.54				--> Double
		2017-01-01			--> Date
		"Hello"				--> Text


	* 6.x ��ǰ text ���� String,��6.x�Ժ�,String ���Ƴ�


--------------------
mapping-����		|
--------------------
	# ֻ�ܴ���indexʱ�ֶ�����mapping,��������mapping
	# �����޸� field mapping
		PUT /user
		{
			"mappings":{
				"coder":{
					"properties":{
						"desc":{
							"type":"text",
							"analyzer":"english"
						},
						"title":{
							"type":"text"
						},
						"createDate":{
							"type":"date"
						},
						"id":{
							"type":"long"
						},
						"userId":{
							"type":"long",
							"index":"true"
						}
					}
				}
			}
		}

		* coder ��ʾtype
		* properties �� key ��ָ������,value�����÷ִ����Լ���������
			- index		����ָ���ֶε��Ƿ�������,boolean ֵ(��6.x��ǰ,���ֵ���ַ���ö��:analyzed,not_analyzed,no)
			- analyzer	����ָ���ֶν�������ʱ,ʹ�õķִ���
			- type		ָ���ֶε���������

		
	# ���һ���ֶ�
		PUT /user/_mapping/coder
		{
			"properties":{
				"newField":{
					"type":"text",
					"analyzer":"english"
				}
			}
		}
		
		* ��url��ָ��index��type
		* ͨ��������ָ���µ��ֶκ���mapping����
		



	