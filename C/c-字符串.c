------------------------
�ַ�������				|
------------------------
	# C�Z����û���ַ���,ʹ�õ����ַ�����
	# �ַ������ڴ���һ��������char�ռ�,��'\0'(����0)��β
	# �ַ���һ�����ַ�����,�ַ����鲻һ�����ַ���
		//�ַ�����
		char name[5] = {'K','e','v','i','n'};
		//�ַ���
		char name[10] = {'K','e','v','i','n','\0'};
		//�ַ���
		char name[10] = {'K','e','v','i','n',0};
		//�ַ���
		char a1[10] = {'a','b','c'};(��Ϊ����ĽǱ�Ĭ��ֵΪ0,0���ǽ�����)

		* �ַ�������'\0'��β,��ô����ַ���������ַ���
	
	# '%s'���������������
		    char a1[] = {'a','b','c','\0','d','e','f'};
			printf("%s",a1);        //abc
	
	# ��õĳ�ʼ��
		char string[] = "��ð�";
		
		* �ַ����Ľ�β,���������Զ���ӽ�����

			char string[] = "���";
			printf("%s size=%d",string,sizeof(string));
			//��� size=7  
			//UTF8����һ������ռ3���ֽ�,�����һ�����ص�0,һ���ֽڱ�ʾ������
		
		* �������Լ�������ӽ�����,���������ǻ�������һ��
			const char names[] = "Hello\0";
			printf("string = %s,size = %d",names,sizeof(names));
			//string = Hello,size = 7
		
		* ���� \0 �����
			char string[] = "Hello\0c";
			printf("%s size=%d",string,sizeof(string));
			//Hello size=8
			//����\0����,����ֻ��ӡ��Hello,����Զ������\0������,����Ҳ��ռһ���ֽ�
		
		* \0��������,���ܸպ����һ��ת���ַ�
			char string[] = "\0123Hello";
			printf("%s size=%d",string,sizeof(string));
			//
			//3Hello size=8
			// '\012' ��ת�����һ�����з�(012��һ���˽���,��ascii�б�ʾ����)
		
		* ����޶��ַ�����,һ��Ҫ����������һ��λ��
			char string[6] = "Hello";
			printf("%s size=%d",string,sizeof(string));
			//Hello size=5
			//���[]С��6,��������,��Ϊû������������λ��

------------------------
�ַ�������/���			|
------------------------
	# �����ַ�
		char ch;
		scanf("%c",&ch);
		printf("%c",ch);

		char ch = getchar();
		printf("%c",ch);
	
	# ���
		char name[100];
		scanf("%s",name);
		printf("input = %s,size = %d\n",name,sizeof(name));
		//123(����)
		//input = 123,size = 100
		
		* �����ո�ض�
			char name[100];
			scanf("%s",name);
			printf("%s",name);
			//Hello World
			//Hello( Worldû�б����,��Ϊ�����˿ո�ͱ��ض���, World�������˻�����)
		

		


