class Bag {
		private String[] muster; // �����鷽ʽ���漯����Ԫ��
		private int number; // ����������Ԫ����Ŀ
		private final int MAXCOUNT = 100;

		public Bag() {
			// muster�����������漯�ϵ�Ԫ�ظ���������Ԫ�ظ���������MAXCOUNT��
			muster = new String[MAXCOUNT];
			number = 0;
			}
			public void insert(String str) {    
				// ���ȼ�������Ԫ���Ƿ��Ѿ��ڼ�����
				int i = find(str);
				if(0 <= i&&i < number){
					System.out.println("������Ԫ���Ѿ����ڼ����У�");
				}
				else{
					if(number < muster.length){
						muster[number] = new String(str);
						number++;
					}
					else
						System.out.println("���Ͽռ����������������Ԫ�أ�" + str);
				}
			}

			public void remove(String str){
				int i = find(str);
				if (0 <= i&&i < number){
					//�ҵ�����Ԫ�أ���ɾ����Ԫ��
					muster[i] = null;
					//�����ɾ��Ԫ�ز������һ��Ԫ�أ���Ѻ����Ԫ����ǰ�ƶ�
					if(i < number - 1){
						for(;i < number ; i++){
							muster[i] = muster[i + 1];
						}
					}
					number--;
				}
				else{
					System.out.println("δ�ҵ���ɾ��Ԫ�أ�");
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
				//����ҵ�����Ԫ�أ��򷵻����������е�λ��
				//�� �򷵻�-1
				int i;
				for (i = 0 ; i < number ; i++){
					//�����ض�Ԫ��
					if(muster[i].compareTo(str) == 0)
						break;
				}
				if (i < number)
					return i;
				else
					return -1;
			}

			public String toString(){
				String str = "Ԫ�ظ���=" + number + "  ";
				int i;
				for (i = 0 ;i < number - 1 ; i++){
					str = str + muster[i] + ",";
				}
				str = str + muster[i];
				return str;
			}
}