package Chapter6;

import java.lang.reflect.Array;
import java.util.Arrays;;

public class ArrayDemo {
	
	public static void main(String[] args) {
		
		// 1、数组的创建
//		CreateLinearArray();
		
		// 2、一维数组的使用
//		UseLinearArray();
		
		// 3、二维数组的创建
//		CreateDoubleArray();
		
		// 4、二维数组的使用
//		UseDoubleArray();
		
		// 5、数组的基本操作
//		OperateShowArray();
		
		// 6、数组的基本操作(使用foreach遍历二维数组)
//		UseForeachShowArray();
		
		// 7、添加和替换数组元素
//		AddAndChangeArrItem();
		
		// 8、数组排序
//		SortArray();
		
		// 9、数组的复制
//		CopyArray();
		
		// 10、数组的查询
//		SearchArray();
//		Reference();
//		Rakel();
		
		// 11、数组的排序(冒泡)
//		BubbleSort1();
//		BubbleSort2();
		
		// 13、直接选择排序
//		SelectSort();
		
		// 14、反转排序
		ReverseSort();
	}
	
	/**
	 * 1、一维数组的创建
	 */
	public static void CreateLinearArray() {
		
		// 声明数组
		int arr1[];
		int[] arr2;
		
		// 分配内存
		arr1 = new int[5];
		
		// 声明并分配内存
		int[] arr3 = new int[15];
	
		// 数组的初始化
		int arr4[] = new int[] {1,2,3,4,25};
		int arr5[] = {34,23,12,6};
	}
	
	/**
	 * 2、一维数组的使用
	 * 要求：在主方法中创建int型数组，并实现将各月的天数输出
	 */
	public static void UseLinearArray() {
		int arr[] = new int[] {30,28,31,30,31,30,22,45,98,10};
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("第"+ (i+1) + "个数是：" + arr[i]);
		}
		
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	/**
	 * 3、二维数组的创建
	 */
	public static void CreateDoubleArray() {
		
		// 声明二维数组
		int arr1[][];
		int arr2[][];
		
		// 分配内存空间
		arr1 = new int[2][4];
		arr2 = new int[2][];
		arr2[0] = new int[4];
		arr2[1] = new int[6];
		
		// 二维数组的初始化
		int arr3[][] = {{12,0},{45,10}};	
	}
	
	/**
	 * 4、二维数组的使用
	 */
	public static void UseDoubleArray() {
		
		int a[][] = new int[3][4];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
	
	/**
	 * 5、数组的基本操作(遍历)
	 */
	public static void OperateShowArray() {
		int b[][] = new int[][] {{1},{2,3}};
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	/**
	 * 6、数组的基本操作(使用foreach遍历二维数组)
	 */
	public static void UseForeachShowArray() {
		int arr[][] = new int[][] {{4,3},{1,2}};
		int i = 0;
		for (int[] is : arr) {
			i++;
			for (int c : is) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}
	
	/**
	 * 7、添加和替换数组元素
	 */
	public static void AddAndChangeArrItem() {
		
		int arr[] = new int[10];
		
		// 1、指定数组中所有元素的值
		Arrays.fill(arr, 6);
		for(int i=0;i<arr.length;i++) {
			System.out.println("第" + i+ "个元素是：" + arr[i]);
		}
		
		System.out.println();
		
		// 2、指定数组中一个范围内的值
		Arrays.fill(arr, 1, 3, 8);
		for(int i=0;i<arr.length;i++) {
			System.out.println("第" + i+ "个元素是：" + arr[i]);
		}
	}
	
	/**
	 * 8、数组排序
	 */
	public static void SortArray() {
		int arr[] = new int[] {23,42,12,8};
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	/**
	 * 9、数组的复制
	 */
	public static void CopyArray() {
		
		int arr[] = new int[] {23,42,12,8,10,7,11};
		
		// 复制整个数组
		int newArr1[] = Arrays.copyOf(arr, 10);
		for (int i : newArr1) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// 复制数组中的部分区域
		int newArr2[] = Arrays.copyOfRange(arr, 1, 4);
		for (int i : newArr2) {
			System.out.print(i + " ");
		}
	}
	
	/**
	 * 10、数组的查询
	 */
	public static void SearchArray() {
		int arr[] = new int[] {4,25,10};
		Arrays.sort(arr);
		int index = Arrays.binarySearch(arr, 0,1,8);
		System.out.println(index);
	}
	
	public static void Reference() {
		int ia[] = new int[] {1,8,9,4,5};
		Arrays.sort(ia);
		
		// 整个数组查找
		int index1 = Arrays.binarySearch(ia, 4);
		System.out.println(index1);
		
		// 在数组的指定区域查找
		int index2 = Arrays.binarySearch(ia, 1, 3, 9);
		System.out.println(index2);
	}
	
	public static void Rakel() {
		String str[] = new String[] {"ab","cd","ef","yz"};
		Arrays.sort(str);
		for (String string : str) {
			System.out.print(string + " ");
		}
		
		System.out.println();
		
		int index = Arrays.binarySearch(str, 0, 2, "cd");
		System.out.println(index);
	}
	
	/**
	 * 11、数组排序法(冒泡 正序)
	 */
	public static void BubbleSort1() {
		int array[] = new int[] {63,4,24,1,3,15};
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length-1;j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		for (int i : array) {
			System.out.print(i + " ");
			System.out.println();
		}
	}
	
	/**
	 * 12、数组排序法(冒泡 倒序)
	 */
	public static void BubbleSort2() {
		int array[] = new int[] {63,4,24,1,3,15};
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length-1;j++) {
				if(array[j]<array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		for (int i : array) {
			System.out.print(i + " ");
			System.out.println();
		}
	}
	
	/**
	 * 13、直接选择排序
	 */
	public static void SelectSort() {
		int[] arr = new int[] {63,4,24,1,3,15};
		
		int index;
		for(int i=1;i<arr.length;i++) {
			index = 0;
			for(int j=1;j<=arr.length-i;j++) {
				if(arr[j]>arr[index]) {
					index = j;
				}
			}
			int temp = arr[arr.length-i];
			arr[arr.length-i] = arr[index];
			arr[index] = temp;
		}
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		System.out.println();
	}
	
	/**
	 * 14、反转排序
	 */
	public static void ReverseSort() {
		int[] arr = new int[] {63,4,24,1,3,15};
		
		int temp;
		for(int i=0;i<arr.length/2;i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
