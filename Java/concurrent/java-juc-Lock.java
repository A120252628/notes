----------------------------
Lock						|
----------------------------
	# 一个接口
	# 用于解决多线程的安全问题
	# synchronized 是隐式的锁
	# Lock 是显示的锁
	# 创建
		Lock lock = new ReentrantLock();

----------------------------
Lock-属性					|
----------------------------

----------------------------
Lock-方法					|
----------------------------
	lock();
		* 上锁

	unlock();
		* 锁释放

