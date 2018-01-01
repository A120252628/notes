----------------------------
����						|
----------------------------
	* ��װ
		pip install selenium
	
----------------------------
�����Ĳ���					|
----------------------------
	# ���� webdriver
	from selenium import webdriver

	# ��Ҫ���ü��̲���,��Ҫ���� keys ��
	from selenium.webdriver.common.keys import Keys

	# ���û�������ָ���� PhantomJS ������������������
	# driver = webdriver.PhantomJS()

	# ���û���ڻ�������ָ�� PhantomJS ��λ��(��ʵ����ָ�� phantomjsִ���ļ��ĵ�ַ)
	driver = webdriver.PhantomJS(executable_path='./phantomjs')

	# ger������һֱ�ȵ�ҳ����ȫ������,Ȼ��Ż���������ִ��
	driver.get('https://www.baidu.com')

	# ����ҳ�����
	driver.save_screenshot('baidu.png')

	# �ҵ�idΪkw��Ԫ��(input),������д�� "Hello"
	driver.find_element_by_id('kw').send_keys("Hello")

	# �ҵ�idΪid��Ԫ��,ִ�е����
	driver.find_element_by_id('su').click()

	# ����ҳ�����
	driver.save_screenshot('hello.png')

	# ��ӡ��ҳԴ��
	print(driver.page_source)

	# ��ȡ���е� cookie
	print(driver.get_cookies())

	# ��ȡָ�����Ƶ�cookie
	#driver.get_cookie('JESSIONID')

	# ctrl + a ȫѡ���������
	driver.find_element_by_id('kw').send_keys(Keys.CONTROL,'a')

	# ctrl + x �������������
	driver.find_element_by_id('kw').send_keys(Keys.CONTROL,'x')

	# �����������������
	driver.find_element_by_id('kw').send_keys('KevinBlandy')

	# ģ��enter�س���
	driver.find_element_by_id('su').send_keys(Keys.ENTER)

	# ������������
	driver.find_element_by_id('kw').clear()

	# ��ȡ��ǰUrl
	print(driver.current_url)

	# �رյ�ǰҳ��,���ֻ��һ��ҳ���ر������
	driver.close()

	# �ر������
	driver.quit()

----------------------------
Ԫ�ػ�ȡ					|
----------------------------
	# ����id����
	driver.find_element_by_id()
	# �������ּ���
	driver.find_element_by_name()
	driver.find_element_by_xpath()
	driver.find_element_by_link_text()
	driver.find_element_by_partial_link_text()
	# ���ݱ�ǩ���Ƽ���
	driver.find_element_by_tag_name()
	# ����class���Ƽ���
	driver.find_element_by_class_name()
	# ����css����
	driver.find_element_by_css_selector()

----------------------------
��������					|
----------------------------
	* ����ҳ���alert����
	alert = driver.switch_to_alert()

----------------------------
ҳ���л�					|
----------------------------
	driver.switch_to_window('name')

----------------------------
ҳ��ǰ���ͺ���				|
----------------------------
	driver.forward()	# ǰ��
	driver.back()		# ����
	
----------------------------
cookie						|
----------------------------
	* ��ȡ���е� cookie
		driver.get_cookies()

	* ��ȡָ�����Ƶ�cookie
		driver.get_cookie('JESSIONID')
	
	* ɾ��cookie
		driver.delete_cookie('name')
	
	* ɾ������cookie
		driver.delete_all_cookies()

	
----------------------------
ҳ��ȴ�					|
----------------------------
	* ��վ�������в���ajax�첽����,��ЩԪ����ͨ���첽���زŻᱻ����dom�ڴ�
	* �����ַ�ʽ�����������
	* .... ...

	* ��ʾ�ȴ�,��ʾָ��ĳ������,Ȼ��������ȴ�ʱ��,�����ʱ��δ�ҵ�Ԫ��,�׳��쳣
		

