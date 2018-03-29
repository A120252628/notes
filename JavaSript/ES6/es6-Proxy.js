----------------------------
Proxy						|
----------------------------
	1,����
	2,Proxy ʵ���ķ���
	3,Proxy.revocable()
	4,this ����
	5,ʵ��:Web ����Ŀͻ���


----------------------------
����						|
----------------------------
	# ��Java��Proxyһ��,AOP���
	# ����Proxyʵ������

		new Proxy(target,handler)

		* target,Ŀ�����(����ǿ����)
		* handler,���������(һ������)
	
	# Hello World
		let obj = {name:'Kevin',age:23};
		let proxyObj = new Proxy(obj,{
			//��ȡ����ʱ����
			get:function(target,key,receiver){
				console.log(`��ȡ����:${key}`);
				return Reflect.get(target, key, receiver);
			},
			//��������ʱ����
			set:function(target, key, value, receiver){
				console.log(`��������:${key},${value}`);
				return Reflect.set(target, key, value, receiver);
			}
		});
		
		proxyObj.name;			//��ȡ����:name
		proxyObj.age = 25;		//��������:age,25

	
	# ���handlerû�������κ�����,�Ǿ͵�ͬ��ֱ��ͨ��ԭ����
		let obj = {name:'Kevin',age:23};
		let proxyObj = new Proxy(obj,{});
		* handler��һ���ն���,û���κ�����Ч��,����proxyObj�͵�ͬ�ڷ���obj
	
--------------------------------
Proxy ֧�ֵ����ز���һ��(13 ��)	|
--------------------------------
	# ��ʵ���� hanlder ������
	
	get(target, propKey, receiver)
		* ���ض������ԵĶ�ȡ,����proxy.foo��proxy['foo']
		* 'get�����ĵ���������receiver,����Ϊ��ǰ�� Proxy ʵ��'
			const proxy = new Proxy({}, {
				get: function(target, property, receiver) {
					return receiver;
				}
			});
			proxy.getReceiver === proxy // true
		* ���һ�����Բ�������(configurable)�Ͳ���д(writable),������Բ��ܱ�����,ͨ�� Proxy ������ʸ����Իᱨ��
	
	set(target, propKey, value, receiver)
		* ���ض������Ե�����,����proxy.foo = v �� proxy['foo'] = v
		* ���Ŀ����������ĳ������,����д�򲻿�����,��ôset��������������
		* ���ز���ֵ
		
	has(target, propKey)
		* ����propKey in proxy�Ĳ���
		* �����������Ч,���͵Ĳ�������in�����
		* ԭ���󲻿����û��߽�ֹ��չ,��ʱhas���ػᱨ��
		* ���ز���ֵ
		
	deleteProperty(target, propKey)
		* ����delete proxy[propKey]�Ĳ���
		* ����һ������ֵ
		
	ownKeys(target)
		* ����Object.getOwnPropertyNames(proxy),Object.getOwnPropertySymbols(proxy),Object.keys(proxy)
		* ����һ������,�÷�������Ŀ�����������������Ե�������,��Object.keys()�ķ��ؽ��������Ŀ���������Ŀɱ�������
		
	getOwnPropertyDescriptor(target, propKey)
		* ����Object.getOwnPropertyDescriptor(proxy, propKey)
		* �������Ե���������
		
	defineProperty(target, propKey, propDesc)
		* ����Object.defineProperty(proxy, propKey, propDesc��,Object.defineProperties(proxy, propDescs)
		* ���ز���ֵ
				
	preventExtensions(target)
		* ����Object.preventExtensions(proxy)
		* ���ز���ֵ
		
	getPrototypeOf(target)
		* ����Object.getPrototypeOf(proxy)
		* ����һ������
			
	isExtensible(target)
		* ����Object.isExtensible(proxy)
		* ��������ֵ
			
	setPrototypeOf(target, proto)
		* ����Object.setPrototypeOf(proxy, proto)
		* ���ز���ֵ,���Ŀ������Ǻ���,��ô�������ֶ��������������
		
	apply(target, object, args)
		* ���� Proxy ʵ����Ϊ�������õĲ���,����proxy(...args),proxy.call(object, ...args),proxy.apply(...)
		* ��������,�ֱ���Ŀ�����,Ŀ�����������Ķ���(this),Ŀ�����Ĳ�������
		* ֱ�ӵ���Reflect.apply����,Ҳ�ᱻ����
		
	construct(target, args)
		* ���� Proxy ʵ����Ϊ���캯�����õĲ���,����new proxy(...args)