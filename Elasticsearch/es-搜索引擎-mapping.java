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

		