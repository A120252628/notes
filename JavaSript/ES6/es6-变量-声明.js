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
		* ֻҪ�鼶�������ڴ���let����,���������ı�����"��"�������,�������ⲿ��Ӱ��
			var temp = 5;
			{
				temp = 6;           //Uncaught ReferenceError: temp is not defined
				let temp;
			}

			* ����ȫ�ֱ���temp,���ǿ鼶��������let��������һ���ֲ�����temp,���º��߰�����鼶������
			* ������let��������ǰ,��temp��ֵ�ᱨ��
	
		* ES6 ��ȷ�涨,��������д���let��const����,����������Щ���������ı���,��һ��ʼ���γ��˷��������,'����������֮ǰ��ʹ����Щ����,�ͻᱨ��'
		* ��֮,�ڴ������,ʹ��let������������֮ǰ,�ñ������ǲ����õ�.
		* �����﷨��,��Ϊ"��ʱ������"(temporal dead zone,��� TDZ)

		* "��ʱ������"Ҳ��ζ��typeof������һ���ٷ�֮�ٰ�ȫ�Ĳ���
			typeof x                    //Uncaught ReferenceError: x is not defined
			let x = 5;
			console.log(typeof xxx)       //undefined

			* ��Ϊ x ��let����,����֮ǰ�������� 'x' ������,������֮ǰʹ�ö����׳��쳣
			* xxx ��һ������û�б��������ı���,ʹ�� typeof ,�������,undefined
			* '��û��let֮ǰ,typeof������ǰٷ�֮�ٰ�ȫ��,��Զ���ᱨ��,������һ�㲻������'
		
		* һЩ�����ױ����ֵ�'����'
			------------------------------------------------
			function bar(x = y, y = 2) {
				return [x, y];
			}
			bar(); // ����Uncaught ReferenceError: y is not defined

			* x = y��ʱ��,y��û�б�����,y��������
			* ��� (x = 2,y = x),��ok,��Ϊx�Ѿ�������,���Ա���ֵ�������y
			------------------------------------------------
			var x = x;		//ok
			let x = x;		// ReferenceError: x is not defined

			* let �� var��ͬ,let�����ᱨ��,Ҳ����Ϊ����������,x���ڵ��Ǹ�x��û�б�����,��������ֵ
		
		* ��֮,��ʱ�������ı��ʾ���,ֻҪһ���뵱ǰ������,��Ҫʹ�õı������Ѿ�������,���ǲ��ɻ�ȡ
		* ֻ�еȵ�������������һ�д������,�ſ��Ի�ȡ��ʹ�øñ���.(������,��ʹ��)
	
	# �������ظ�����
		* let����������ͬ��������,�ظ�����ͬһ������
			{
				let x = 4;
				let x = 5;      //Uncaught SyntaxError: Identifier 'x' has already been declared
			}
		* ��ô�ڷ�����,Ҳ�Ͳ�������βν��� let ����
			function test(x) {
				let x = 4;
			}
			test(5);     //Uncaught SyntaxError: Identifier 'x' has already been declared
	
-------------------
�鼶������			|
-------------------
	# ΪɶҪ�п鼶������
		* ES5 ֻ��ȫ��������ͺ���������,û�п鼶������,������ܶ಻����ĳ���
			var tmp = new Date();
			function f() {
				//�ڱ�������֮ǰʹ��,��ֵΪ undefined
				console.log(tmp);
				if (false) {
					//���������������˱���
					var tmp = 'hello world';
				}
			}
			f(); // undefined

			* if�������ⲿʹ������tmp����,�ڲ�ʹ���ڲ��tmp����(��������)
			* ����,����fִ�к�,������Ϊundefined,ԭ�����ڱ�������,�����ڲ��tmp��������������tmp����
			------------------------------------------------
			var s = 'hello';
			for (var i = 0; i < s.length; i++) {
				console.log(s[i]);
			}
			console.log(i); // 5
			* ����iֻ��������ѭ��,����ѭ��������,����û����ʧ,й¶����ȫ�ֱ���
	
	# 

			
		
	
