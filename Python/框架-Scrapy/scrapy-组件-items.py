------------------------
items					|
------------------------
	* ��ʵ���Ƕ���model
	* �򵥵�model����
		import scrapy
		class WebspiderItem(scrapy.Item):
			name = scrapy.Field()		# ����һ��name����
			age = scrapy.Field()		# ����һ��age����
			gender = scrapy.Field()		# ����һ��gender����
	

			