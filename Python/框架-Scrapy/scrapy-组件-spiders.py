-----------------------------
spiders						 |
-----------------------------
	* spider Ӧ�ó����� spiders pythonĿ¼��
	* spider��parseҪô���� item,Ҫô���� Request,��˼��Ҫô��������,Ҫô������

-----------------------------
spiders	����				 |
-----------------------------
	import scrapy
	class ItcastSpider(scrapy.Spider):

		# ָ�����������
		name = 'itcast'

		# ������ȡ����
		allowed_domains = ['itcast.cn']

		# ��ʼ�ĵ�ַ
		start_urls = ['http://itcast.cn/']

		# ��ȡ�������(self���Է����������������,�Լ��Զ��������)
		def parse(self, response):	
			pass
		
		* name,allowed_domains ������,���ǵ�ǰSpiderʵ������(����ͨ�� self ����)
		
-----------------------------
spiders	���·�������		 |
-----------------------------
	* ����ȡ������,�������Ӧ����ȡ��������,��Ҫ�����ȡ,�򷵻� scrapy.Request() ʵ������

		def parse(self, response):	
			...
			# ����������,����pipe����
			yield item

			...
			# ������url,���·��͸�������,�����,����ָ���ص�����,���ǵ�ǰ����
			yield scrapy.Request('http://....com',callback=self.parse)
	
	* scrapy.Request(url, callback=None, method='GET', headers=None, body=None,
                 cookies=None, meta=None, encoding='utf-8', priority=0,
                 dont_filter=False, errback=None, flags=None)
		* ��һ������,������ȡ������url
		* �ؼ��ֲ���
			callback
				* ������Ӧ��,��˭���д���(�ص�����)
