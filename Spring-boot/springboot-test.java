----------------------------
springboot�ĵ�Ԫ����		|
----------------------------
	# ��������
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	
	# ���Դ���
		@RunWith(SpringRunner.class)
		@SpringBootTest
		public class Test{
			@Test
			public void test(){
				
			}
		}