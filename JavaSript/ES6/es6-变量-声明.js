-------------------
let					|
-------------------
	# �ùؼ��������ı���,�����ڵ�ǰ�������Ч
		//����
		{
			var y = 5;
			let x = 5;
		}
		console.log(y);
		console.log(x);
		//ִ�н��
		5											//����y���Ա�����
		Uncaught ReferenceError: x is not defined	//����xδ����

		* forѭ���еı���,�ͷǳ��ʺ�ʹ�� let,��ǰ��iֻ�ڱ���ѭ����Ч,����ÿһ��ѭ����i��ʵ����һ���µı���
		* ÿһ��ѭ���ı���i��������������,������ô֪����һ��ѭ����ֵ,�Ӷ����������ѭ����ֵ
		  ������Ϊ JavaScript �����ڲ����ס��һ��ѭ����ֵ,��ʼ�����ֵı���iʱ,������һ��ѭ���Ļ����Ͻ��м���
	
	# forѭ���е�������
		for(let x = 0 ;x < 10 ;x ++){
			let x = 'KevinBlandy';
			console.log(x);
		}
		* ִ�н���Ǵ�ӡ��10�� 'KevinBlandy'
		* ˵�� for ѭ���е� x �� ѭ������������ x �ڲ�ͬ��������
	
	# ������ڱ�������
		* �ڱ�������֮ǰ,ʹ�� var �����ı���,����ֵΪ undefined
			console.log(x);		//undefined
			var x = 5;
		
		* let �����ı���,����Ҫ��������ʹ��
			console.log(x);		
			let x = 5;

			Uncaught ReferenceError: x is not defined
	
	# ��ʱ������
		