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
	
	# ��ȡ�ַ����ĳ���(�ֽڴ�С)
		* ʹ�� strlen(const char *s) ����
		* ���㲢�����ַ���s�ĳ���,������������ '\0',size_t ����
		* ���������һ���ļ��ָ�����ǰ���ַ�������
	
	# �ַ�����copy
		* ʹ�� strcpy(char *dst,char *src) ����
		* ���src�����ݳ��ȴ���dst��,��ô������������
		* ֻ�´����һ��'\0'ǰ������
			char name[11] = "KevinBlandy";
			char cp_name[11];

			strcpy(cp_name,name);
			printf("%s\n",cp_name);		//KevinBlandy
		
		* strncpy(char *dst,char *src,int size) 
		* �� src �����ݿ����� dst,size������������copy�ĳ���
		* ����ֻ���� sizeof(dst) - 1 ��Ԫ�ص�Ŀ��,��ΪҪ��һ��λ�ø�'\0'
		* ��� size ������ sizeof(dst) - 1,��ô�ᷢ�����
			char str[] = "123456";
			char dst[5];
			strncpy(dst,str,sizeof(dst) - 1);
			printf("%s",dst);       //123

		* ��� '\0' �ڿ����ķ�Χ֮��,��ô'\0'�Ժ������ȫ���ᱻ����
			char str[] = "Hello\0Java";
			char dst[100];

			strncpy(dst,str,sizeof(str));

			printf("dst = %s\n",dst);                       //Hello
			printf("dst = %s\n",dst + strlen("Hello") + 1); //
			

	
------------------------
�ַ�������/���			|
------------------------
	# scanf �� printf
		char ch;
		scanf("%c",&ch);
		printf("%c",ch);

		char name[100];
		char buf[100] = {0};
		scanf("%s",buf);
		printf("�����������:%s\n",buf);

		* Ĭ���Կո�Ϊ�ָ�,������ȡ�ո��ǰ�������,������ַ��ᱻ��ӵ�������
		* 'scanf() ���ַ�ʽ���벻����Խ����,����ȫ'
		* scanf ���Զ���������ַ���� '\0'
	
	# getchar() / putchar()
		* ר�����ڴ������ַ��ĺ���
		* һ���ԵĶ�ȡ/��������ַ�,Ч�ʱȽϸ�,��Ϊר�Ŵ���ľ����ַ�
			char ch;
			scanf("%c",&ch)

			char ch = '1';
			printf("%d",ch)

	
	# ʹ�� gets / fgets ��ȡ�ַ���
		gets(char *s)
			* �Ѿ�������,�ӱ�׼�����ȡ�ַ�,�����浽sָ�����ڴ�ռ�ֱ�����ֻ��з������ļ���βΪֹ
			* ���ܻᷢ������Խ������,��Ϊ��֪���û���������ݴ�С,������ʹ��
		
		fgets(char *s,int size,FILE stream)
			* ����
				s: �ַ���
				size:ָ����ȡ����ַ����ĳ���(Ĭ�� -1,������)
				stram:�ļ�ָ��,'�����ȡ����������ַ���,�̶�Ϊstdin'
			* ��streamָ�����ļ��ڶ����ַ�,���浽sָ�����ڴ�ռ�,ֱ�����ֻ����ַ�,��ȡ���ļ���β,�����Ѿ���ȡ��size - 1 ���ַ�Ϊֹ
			* ���Զ��������� '\0' ��ʶ,��ѻ��з�Ҳһ���ȡ��ȥ
			* s���ֻ��װ length - 1���ַ�,��Ϊ����Ҫ��һ�����ַ��������� '\0',����������ݴ����� size ���� sizeof(s) ��ô�������ֻᱻ�ض�
			* ��ȡ�ɹ����ض�ȡ�����ַ���,��ȡ���ļ�ĩβ���߳���,���� NULL
			* ��ȡ��������demo
				char buf[100];
				fgets(buf,sizeof(buf),stdin);
				printf("���������:%s\n",buf);

	# ʹ�� puts / fputs ������ַ���
		puts(const char *s)
			* ��׼�豸���s�ַ���,���Զ���ӻ��з� \n
			* �ɹ����طǸ���,ʧ�ܷ��� -1

		fputs(const char *str,FILE *stream)
			* �� str �ַ�д�뵽streamָ�����ļ���,�ַ��������� '\0' ��д���ļ�
			* �ɹ����� 0,ʧ�ܷ��� -1
			* ���԰�stream�滻Ϊ stdout,ʹstr���������Ļ
		

		

	
		

		
	

