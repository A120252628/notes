---------------------------
vue-ʵ�����				|
---------------------------
	var app = new Vue({
		el:"#app",
		data:{			//�ᱻӳ��Ϊvueʵ�������Զ���

		},
		methods:{

		},
		computed:{		//��������
			
		},
		filters:{		//������
			
		}
	});
	
	# ����һ��vueʵ������,��Ҫ����һ�����ö�������,ģ��,����Ԫ��,����,�������ڹ��ӵ�ѡ��
	# ÿ��vueʵ����������� data �µ���������
		var data = { a: 1 }
		var vm = new Vue({
			data: data
		})
		vm.a === data.a // -> true
		// ��������Ҳ��Ӱ�쵽ԭʼ����
		vm.a = 2
		data.a // --> 2
		// ... ��֮��Ȼ
		data.a = 3
		vm.a // --> 3

	# ������չ Vue ���������Ӷ���Ԥ����ѡ����ɸ��õ����������
		var MyComponent = Vue.extend({
			// ��չѡ��
		})
		// ���е� `MyComponent` ʵ��������Ԥ�������չѡ�����
		var myComponentInstance = new MyComponent()
	
	# ���� data ����, Vue ʵ����¶��һЩ���õ�ʵ�������뷽��,��Щ�����뷽������ǰ׺ $,�Ա������� data ��������
		var data = { a: 1 }
		var vm = new Vue({
			el: '#example',
			data: data
		})
		vm.$data === data // --> true
		vm.$el === document.getElementById('example') // --> true
		// $watch ��һ��ʵ������
		vm.$watch('a', function (newVal, oldVal) {
		// ����ص����� `vm.a`  �ı�����
		})
		* ע��,��Ҫ��ʵ�����Ի��߻ص�������(�� vm.$watch('a', newVal => this.myMethod()))ʹ�ü�ͷ����
		* ��Ϊ��ͷ�����󶨸�������,���� this ������Ԥ���һ���� Vue ʵ��,���� this.myMethod δ������
		* �ο�java���� lambda �е� this ִ�лᱻ�ı�
	
	
	# ʵ������������
		*  ÿ�� Vue ʵ���ڱ�����֮ǰ��Ҫ����һϵ�еĳ�ʼ����������
			ʵ����Ҫ�������ݹ۲�(data observer)
			����ģ��
			����ʵ���� DOM 
			Ȼ�������ݱ仯ʱ���� DOM 
		* �����������,ʵ��Ҳ�����һЩ �������ڹ��� ,��͸������ṩ��ִ���Զ����߼��Ļ���
		* ���磬created ���������ʵ��������֮�󱻵���
			var vm = new Vue({
				data: {
					a: 1
				},
				created: function () {
					// this ָ�� vm ʵ��
					console.log('a is: ' + this.a)
				}
			})
		* һЩ�����Ĺ���,��ʵ���������ڵĲ�ͬ�׶ε�����
			mounted
			updated 
			destroyed 
		* ���ӵ� this ָ��������� Vue ʵ��
		* һЩ�û����ܻ��� Vue.js �Ƿ���"������"�ĸ���?����,û��.������Զ����߼����Էֲ�����Щ������
		

---------------------------
vue-��������				|
---------------------------

---------------------------
vue-������					|
---------------------------

