--------------------
document�ĸ���		|
--------------------
	# ǿ�Ƹ���
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

		* ��������Ҫ�ύ�����ֶ�,�����ڵ��ֶλᱻɾ��
		* ���ܱ����ύ,�Ƿ��гɹ��޸��ֶ�,resultֵ��ԶΪ:'updated'
		* ���������޸�,_version�ֶαػ��1
		* �������Ϊǿ�Ƹ���
	
	# ��ǿ�Ƹ���
		POST /{index_name}/{type_name}/{id}/_update
		* ���ַ�ʽ,�ύ��JSON�������仯
			{
				"doc":{
					//��Ҫ�޸ĵ��ֶ�
				}
			}
		* ���Խ����ύ������Ҫ���µ��ֶ�
		* ��������ύδ�޸����ݵĻ�,��ôresult�ֶ�ֵΪ:'noop',����û��:'_seq_no'��'_primary_term'�ֶ�,
		* �����ύ���޸����ݵ���,��ǿ�Ƹ��µķ��ؽ����һ����
		* ֻ�����������޸ĵ�ʱ��,version +1
		* �������Ϊ��ǿ�Ƹ���
		* partial update(���ָ���)
		


	# ȫ���滻
		PUT  /{index_name}/{type_name}/{id}	

		* ���id�Ѿ�����,��ôԭ����document���ᱻ����ɾ��,���ǻᱻ���Ϊ: delete
		* ��es������Խ��Խ���ʱ��,es���ں�̨�Լ����İѱ��Ϊ:delete ��document����ɾ����
		* _version ʼ�ջ� +1
	
	# �Ա�
		
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
