------------------------
��������				|
------------------------

------------------------
�����Ĳ���				|
------------------------
	# �½�
		PUT		/{index_name}	
		{
			"acknowledged": true,
			"shards_acknowledged": true,
			"index": "test_index1"
		}
	
	# ɾ��
		DELETE	/{index_name}
		{
			"acknowledged": true
		}

------------------------
Document����			|
------------------------
	# ����
		PUT /{index_name}/{type_name}/{id}
	
	# ����
		POST /{index_name}/{type_name}/{id}
	
	# ɾ��
		DELETE /{index_name}/{type_name}/{id}
	
	