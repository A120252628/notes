--------------------
document�ĸ���		|
--------------------
	# ����(1)
		POST /{index_name}/{type_name}/{id}	
		{
		  "_index": "test_index",
		  "_type": "product",
		  "_id": "1",
		  "_version": 2,			
		  "result": "updated",
		  "_shards": {
			"total": 2,
			"successful": 1,
			"failed": 0
		  },
		  "_seq_no": 1,
		  "_primary_term": 1
		}

		* ������ֱ���ύ��Ҫ�޸ĵ��ֶμ���
		* ���ܱ����ύ,�Ƿ��гɹ��޸��ֶ�,resultֵ��ԶΪ:'updated'
		* _version�ֶαػ��1
		* �������Ϊǿ�Ƹ���
	
	# ����(2)
		POST /{index_name}/{type_name}/{id}/_update
		* ���ַ�ʽ,�ύ��JSON�������仯
			{
				"doc":{
					//��Ҫ�޸ĵ��ֶ�
				}
			}
		* ��������ύδ�޸����ݵĻ�,��ôresult�ֶ�ֵΪ:'noop',����û��:'_seq_no'��'_primary_term'�ֶ�,versionҲ����+1
		* �������Ϊ��ǿ�Ƹ���,����������Ҫ���µ��ֶ�


	# ȫ���滻
		PUT  /{index_name}/{type_name}/{id}	

		* ���id�Ѿ�����,��ôԭ����document���ᱻ����ɾ��,���ǻᱻ���Ϊ: delete
		* ��es������Խ��Խ���ʱ��,es���ں�̨�Լ����İѱ��Ϊ:delete ��document����ɾ����
	
	# �Ա�
		* ȫ���滻�Ļ�,version�ᱻ����Ϊ1,���µĻ�,version���1
		* ���������,result�ֶ�ֵΪ"updated"
		* ȫ���滻����,�滻�������,����������е�����
		* ������,������Ҫ�ṩ���µ��ֶμ���

--------------------
document��ǿ�ƴ���	|
--------------------
	# �����ĵ���ȫ���滻���﷨��һ����
	# ���ֻ���½��ĵ�,�����滻�ĵ�,��ô����Ҫǿ�ƴ���(���ַ�ʽ)
		PUT /index/type/id?op_type=create
		PUT /index/type/id/_create
			* ���ַ�ʽ�Ƚϳ���
	
		* �����id��document�Ѿ�����,��ô����PUT�ɹ�,���׳��쳣

--------------------
document��ɾ��		|
--------------------
	# document���ᱻ����������ɾ��,ֻ�ᱻ���Ϊdelete,������Խ��Խ�������,�ں�̨�Զ���ɾ��

		DELETE /index/type/id
