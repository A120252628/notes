-----------------------------
Elasticsearch			 	 |
-----------------------------
	# ����
		https://www.elastic.co
		https://www.elastic.co/cn/
		https://www.elastic.co/guide/en/elasticsearch/reference/index.html

	# Github
		https://github.com/elastic/elasticsearch
	
	# �ο�
		https://blog.csdn.net/laoyang360/article/details/79293493

	
	# ��ͳ��ϵ�����ݿ�ĶԱ�
		Relational DB ->	Databases	-> Tables	-> Rows			-> Columns
		Elasticsearch ->	Indices		-> Types	-> Documents	-> Fields


-----------------------------
Elasticsearch-Ŀ¼�ṹ		 |
-----------------------------
	bin
	config
		|-elasticsearch.keystore
		|-elasticsearch.yml
		|-jvm.options
		|-log4j2.properties
		|-role_mapping.yml
		|-roles.yml
		|-users
		|-users_roles
	data
	lib
	logs
	modules
	plugins

-----------------------------
Elasticsearch-����JSON		 |
-----------------------------

{
	"name" : "b9yxBCU",								//�ڵ�����
	"cluster_name" : "elasticsearch",				//��Ⱥ����
	"cluster_uuid" : "V3_diOPVS7m85S_dmijzfw",		//��Ⱥuuid
	"version" : {
		"number" : "6.3.0",							//�汾��
		"build_flavor" : "default",				
		"build_type" : "zip",		
		"build_hash" : "424e937"
		"build_date" : "2018-06-11T23:38:03.357887Z",
		"build_snapshot" : false,
		"lucene_version" : "7.3.1",
		"minimum_wire_compatibility_version" : "5.6.0",
		"minimum_index_compatibility_version" : "5.0.0"
	},
	"tagline" : "You Know, for Search"
}