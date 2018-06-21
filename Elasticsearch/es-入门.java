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

	

-----------------------------
Elasticsearch-Ŀ¼�ṹ		 |
-----------------------------
	bin
		|-x-pack
			|-certgen.bat
			|-.bat
			|-certutil.bat
			|-migrate.bat
			|-saml-metadata.bat
			|-setup-passwords.bat
			|-sql-cli.bat
			|-syskeygen.bat
			|-users.bat
		|-elasticsearch-sql-cli-6.3.0.jar
		|-elasticsearch.bat
		|-elasticsearch-certgen.bat
		|-elasticsearch-certutil.bat
		|-elasticsearch-croneval.bat
		|-elasticsearch-env.bat
		|-elasticsearch-keystore.bat
		|-elasticsearch-migrate.bat
		|-elasticsearch-plugin.bat
		|-elasticsearch-saml-metadata.bat
		|-elasticsearch-service.bat
		|-elasticsearch-setup-passwords.bat
		|-elasticsearch-sql-cli.bat
		|-elasticsearch-syskeygen.bat
		|-elasticsearch-translog.bat
		|-elasticsearch-users.bat
		|-x-pack-env.bat
		|-x-pack-security-env.bat
		|-x-pack-watcher-env.bat
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
	# http://127.0.0.1:9200/

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

-----------------------------
Elasticsearch-���ĸ���		 |
-----------------------------
	Near Realtime(NRT)
		# ��ʵʱ,������˼,��д�����ݵ�����������Լ����1s���ӳ�,����es���������ͷ������Դﵽ�뼶
	
	Cluster
		# �ڵ�,��Ⱥ�е�һ���ڵ�,�ڵ����һ������,Ĭ������������
		# �ڵ����ƺ���Ҫ,�ڵ�Ĭ�ϻ�ȥ����һ����Ϊ:elaticsearch �ļ�Ⱥ
		# �������һ�ѽڵ�,��ô���ǻ��Զ����һ��es��Ⱥ,��Ȼ,һ���ڵ�Ҳ�������һ��es��Ⱥ
	
	Index
		# ����,����һ�������ƽṹ���ĵ�����,���������һ���ͻ�����,��Ʒ��������,��������,��������һ�����Ƶ�
	
	Type
		# ����,ÿ�������ﶼ������һ�����߶��type,type��index�е���һ���߼�����
		# һ��type�µ�document������ͬ��field,���粩��ϵͳ,��һ������,���Զ����û�����type,��������type,��������type
	
	Documen
		# �ĵ�,es�ֵ���С���ݵ�Ԫ,һ��document������һ���ͻ�����,һ����Ʒ��������
		# ͨ��ʹ��JSON���ݽṹ��ʾ,ÿ��index�µ�type��,�����Դ洢���document
	
	Shard
		# ��̨�����޷��洢��������,es���԰�һ���������ݷ�Ϊ���shard,�ֲ�ʽ�ڶ�̨�������ϴ洢
		# ����Shard�Ϳ��Ժ�����չ,�洢��������,�������ͷ����Ȳ����ֲ�����̨��������ȥִ��,����������������
		# ÿ��shard����һ��lucene index
	
	Replica
		# �κ�һ�����������п��ܻ�崻�,��ʱshard�ͻᶪʧ,��˿���Ϊÿ��shard����n��replica����
		# replia������shard����ʱ,�ṩ����,��֤shard�Ĳ���ʧ,���replica��������������������������������
		# Shard   -> primary shard(��������ʱһ������,�����޸�,Ĭ��5��)
		# Replica -> replica shard(��ʱ�޸�����,Ĭ��1��)
		# Ĭ��ÿ��������10��shard,5��primary shard,5��replica shard
		# ��С�ĸ߿���peizhi,����̨������
	

	# ��ͳ��ϵ�����ݿ�ĶԱ�
		Relational DB ->	Databases	-> Tables	-> Rows			-> Columns
		Elasticsearch ->	Indices		-> Types	-> Documents	-> Fields



-----------------------------
Elasticsearch-��;			 |
-----------------------------
�����������
