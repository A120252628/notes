{
	"query":{

		"match_all":{
			
		},

		"match":{
			"key":"value"
		},

		"match_phrase":{
			"key":"value"
		}

		"bool":{
			"must":{
				"match":{
					"key":"value"
				}
			},
			"filter":{
				"range":{
					"key":{"gt/lt/le/ge/ne":"value"}
				}
			}
		}
	},
	"sort":[
		{"key1":"desc"},
		{"key2":"asc"}
	],
	"from":1,
	"size":2,
	"_source":[],
	"highlight":{
		"fields":{
			"key":{}
		}
	}
}

query.match_all
	* ��������,��ֵ��һ���ն���{}

query.match
	* ��������������
	* ��ֵ��һ������,ͨ��kv���������
	* ȫ�ļ���,value�����ж��,ʹ�ÿո����,ֻҪkey�а���������value�ؼ��ּ���������

query.match_phrase
	* �������,��ȫ�ļ����෴,������ȫ������key=value,�ŷ�������

query.bool
queyr.boot.must.match

from
	* �ӵڼ������ݿ�ʼ����,limit�ĵ�һ������
size
	* ÿҳ��ʾ�ļ�¼��
_source
	* ��ֵ��һ������,ָ��Ҫ�������ֶ�,�����Ǽ�������
	* ͨ���ַ���ִ������,֧��.���Ե���

highlight.fields
	* ��������