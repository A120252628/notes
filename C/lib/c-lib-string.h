--------------------------------
string							|
--------------------------------

strcpy(s1, s2);
	* �����ַ��� s2 ���ַ��� s1
		char name[11] = "KevinBlandy";
		char cp_name[11];

		strcpy(cp_name,name);
		printf("%s\n",cp_name);		//KevinBlandy

strcat(s1, s2)
	* �����ַ��� s2 ���ַ��� s1 ��ĩβ
		char s1[11] = "Hello";
		char s2[11] = " C";
		strcat(s1,s2);
		printf("%s\n",s1);	//HelloC

strlen(s1)
	*  �����ַ����ĳ���,�������㵽��һ���ָ��
		char s1[11] = "Hello";
		char s2[11] = "He\0llo";
		printf("%d %d\n",strlen(s1),strlen(s2));		//5 2

strcmp(s1,s2)
	* �ַ����ıȽ�
	* ��� s1 �� s2 ����ͬ��,�򷵻� 0
	* ��� s1<s2 �򷵻�С�� 0,��� s1 > s2 �򷵻ش��� 0
		char s1[11] = "Hello";
		char s2[11] = "Hi";
		char s3[11] = "Hello";
		printf("%d %d %d\n",strcmp(s1,s3),strcmp(s1,s2),strcmp(s2,s1));	//0 -1 1

strchr(s1, ch);
	* ����һ��ָ��,ָ���ַ��� s1 ���ַ� ch �ĵ�һ�γ��ֵ�λ��
	* ���û�ҵ�����0
		char s1[11] = "Hello";
		printf("%p\n",strchr(s1,'H'));		//28FF35

strstr(s1, s2);
	* ����һ��ָ��,ָ���ַ��� s1 ���ַ��� s2 �ĵ�һ�γ��ֵ�λ��
	* ���û�ҵ�����0
		char s1[11] = "Hello";
		char s2[11] = "ll";
		printf("%p",strstr(s1,s2));	//0028FF37