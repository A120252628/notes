-----------------------------
spiders						 |
-----------------------------
	* spider Ӧ�ó����� spiders pythonĿ¼��
	* spider ����̳���:scrapy.Spider
	* spider��parseҪô���� item,Ҫô���� Request,��˼��Ҫô��������,Ҫô������

-----------------------------
spiders-��Ҫ�����Ժͷ���	 |
-----------------------------
	name
		* ����spider���ֵ��ַ���
		* ����,���spider��ȡ mywebsite.com ,��spiderͨ���ᱻ����Ϊ mywebsite
	allowed_domains
		* ������spider������ȡ������(domain)���б�,��ѡ
	start_urls
		* ��ʼURLԪ��/�б�,��û���ƶ��ض���URLʱ,spider���Ӹ��б��п�ʼ������ȡ

	start_requests(self)
		* �÷������뷵��һ���ɵ�������(iterable),�ö��������spider������ȡ(Ĭ��ʵ����ʹ�� start_urls ��url)�ĵ�һ��Request
		* ��spider������ȡ����δָ��start_urlsʱ,�÷���������

	parse(self, response)
		* ������url������ҳû��ָ���ص�����ʱ,Ĭ�ϵ�Request����ص�����
		* ����������ҳ���ص�response,�Լ�����Item����Request����

	log(self, message[, level, component])
		* ʹ�� scrapy.log.msg() ������¼(log)message
		* ����������μ� logging

-----------------------------
����spiders	����			 |
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
			response.url				# ��ȡʱ�����url
			response.body				# ���ص�html
			response.body_as_unicode()	# ���ص�html unicode����
		
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

-----------------------------
Selectorsѡ����				 |
-----------------------------
	* response.selector,����ȡ��һ�� response ��ʼ������ Selector �Ķ���
	* ͨ��ʹ�� response.selector.xpath()��response.selector.css() ���� response ���в�ѯ
	* ScrapyҲ�ṩ��һЩ��ݷ�ʽ�����з���
		response.xpath
		response.css()
	
	* Scrapy Selectors ���� XPath �� CSS Selector ���ʽ����

	* Selector���ĸ������ķ���,��õĻ���xpath

		xpath()		����xpath���ʽ,���ظñ��ʽ����Ӧ�����нڵ��selector list�б�
		extract()	���л��ýڵ�ΪUnicode�ַ���������list
		css()		����CSS���ʽ,���ظñ��ʽ����Ӧ�����нڵ��selector list�б�,�﷨ͬ BeautifulSoup4
		re()		���ݴ����������ʽ�����ݽ�����ȡ,����Unicode�ַ���list�б�

	
-----------------------------
Spider-������-CrawlSpider	 |
-----------------------------
	scrapy.spiders.CrawlSpider
		* Spider������ԭ����ֻ��ȡstart_url�б��е���ҳ
		* ��CrawlSpider�ඨ����һЩ����(rule)���ṩ����link�ķ���Ļ���
		* ����ȡ����ҳ�л�ȡlink��������ȡ�Ĺ������ʺ�

-----------------------------
LinkExtractor				 |
-----------------------------
	* ���ڴ�html�ṹ������ȡ������
	* from scrapy.linkextractors import LinkExtractor
	* ���캯��
		LinkExtractor(allow=(), deny=(), allow_domains=(), deny_domains=(), restrict_xpaths=(),
                 tags=('a', 'area'), attrs=('href',), canonicalize=False,
                 unique=True, process_value=None, deny_extensions=None, restrict_css=(),
                 strip=True)
			allow
				* ��ʾƥ��Ĺ���,��һ�����߶��������ʽ(Ԫ��)
				* �����ֵΪ��,�����е����Ӷ��ᱻ��ȡ
			deny
				* Ҳ��һ���������,�ù������е�����,���ᱻ��ȡ
			allow_domains
				* �ᱻ��ȡ��������
			deny_domains
				* ���ᱻ��ȡ��������
			restrict_xpaths
				* ʹ��xpath���ʽ,��allow��ͬ��������

	* ���� & ����
		extract_links(response)
			* ������Ӧ����,����link����,���� Link ���󼯺�
	* demo
		def parse(self, response):
			# ���� extrator ����(ƥ�����)
			extrator = LinkExtractor(allow=('start=\d+',))
			# ͨ�� extract_links ������ response ����,��ȡLink���󼯺� 
			links = extrator.extract_links(response)
			for i in links:
				print(i)	# Link(url='http://hr.tencent.com/position.php?tid=87&start=10#a', text='2', fragment='', nofollow=False)

-----------------------------
Rule						 |
-----------------------------
	* ���ڶ�����ôȥ����ƥ�䵽������
	* һ�� Rule ��������һ��ƥ�����(LinkExtractor),����������԰������ Rules
	* ������ Rule ƥ������ͬ������,����ݹ����ڼ����еĶ���˳��,��һ�����ᱻʹ��
	* from scrapy.contrib.spiders import Rule
	* ���캯��
		Rule(link_extractor, callback=None, cb_kwargs=None, follow=None, process_links=None, process_request=identity)
			link_extractor
				* ��ʾһ��ƥ�����(LinkExtractor)
			callback
				* �ص�����,ÿ����link_extractor�л�ȡ�����ӵ�ʱ��,������Ϊ�������ݸ��ûص�����
			follow
				* bool ֵ,ָ���˸��ݸù�����ȡ�����������Ƿ�Ҫ����(������,�����ȡ)
				* ��� callback = None,��ֵĬ��Ϊ True,�����ֵΪ False
			process_links
				* ָ��spider���ĸ��������ᱻ����,��ƥ�����(LinkExtractor)�л�ȡ�������б�ʱ����øú���

	* ���� & ����
		
		
	* demo
		
	
