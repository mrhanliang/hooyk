class Bag {
		private String[] muster; // 以数组方式保存集合中元素
		private int number; // 计数集合中元素数目
		private final int MAXCOUNT = 100;

		public Bag() {
			// muster数组用来保存集合的元素个数，假设元素个数不超过MAXCOUNT个
			muster = new String[MAXCOUNT];
			number = 0;
			}
			public void insert(String str) {    
				// 首先检测待插入元素是否已经在集合中
				int i = find(str);
				if(0 <= i&&i < number){
					System.out.println("待插入元素已经存在集合中！");
				}
				else{
					if(number < muster.length){
						muster[number] = new String(str);
						number++;
					}
					else
						System.out.println("集合空间已满，不能添加新元素：" + str);
				}
			}

			public void remove(String str){
				int i = find(str);
				if (0 <= i&&i < number){
					//找到待查元素，则删除该元素
					muster[i] = null;
					//如果待删除元素不是最后一个元素，则把后面的元素向前移动
					if(i < number - 1){
						for(;i < number ; i++){
							muster[i] = muster[i + 1];
						}
					}
					number--;
				}
				else{
					System.out.println("未找到待删除元素！");
				}
			}

			public boolean isEmpty(){
				if(number > 0)
					return false;
				else
					return true;
			}

			public int getAmount(){
				return number;
			}

			public int find(String str){
				//如果找到待查元素，则返回其在数组中的位置
				//否 则返回-1
				int i;
				for (i = 0 ; i < number ; i++){
					//查找特定元素
					if(muster[i].compareTo(str) == 0)
						break;
				}
				if (i < number)
					return i;
				else
					return -1;
			}

			public String toString(){
				String str = "元素个数=" + number + "  ";
				int i;
				for (i = 0 ;i < number - 1 ; i++){
					str = str + muster[i] + ",";
				}
				str = str + muster[i];
				return str;
			}
}