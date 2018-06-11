--------------------------------
feign������					|
--------------------------------
	# ����Demo
		@FeignClient("USER-SERVICE")
		public interface UserFegin {
			
			@GetMapping("/user/{id}")
			public UserEntity m1(@PathVariable("id")Integer userId);
				* rest����
			
			@GetMapping("/user")
			public UserEntity m2(@RequestParam("id")Integer userId);
				* form ������
			
			@GetMapping("/user")
			public UserEntity m3(@RequestHeader("h")String header);
				* ������ͷ����
			
			@PostMapping("/user")
			public UserEntity m4(UserEntity userEntity);
				* �������ݷ�װΪ����
		}
		
		* feign�ӿڱ���Ҫͨ��:@RequestHeader,@RequestParam,�����������
		