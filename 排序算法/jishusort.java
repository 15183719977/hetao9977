package demo2;

import java.util.Arrays;

public class jishusort {
	public static void main(String[] args) {
		int[] arr = new int[] {12,5,402,312,123,710,213,15,17,287,223,3,212};
		sort(arr);
		System.out.println(Arrays.toString(arr) );
	}
	
	public static void sort(int[] arr) {
		int max = Integer.MIN_VALUE;
		//�������
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		//�������ֵ��λ��
		int maxlength = (max+"").length();
		//������ʱ�洢���ݵ�����
		int[][] temp = new int[10][arr.length];
		//���ڼ�¼����Ӧ�������д�ŵ����ֵ�����
		int[] counts = new int[10];
		
		for(int i=0,n=1;i<maxlength;i++,n*=10) {
			for(int j=0;j<arr.length;j++) {
				int yushu = arr[j]/n%10;//��������
				temp[yushu][counts[yushu]] = arr[j];
				counts[yushu]++;
			}
			int index = 0;//��¼ȡ��Ԫ����Ҫ�ŵ�λ��
			//������ȡ����
			for(int k=0;k<counts.length;k++) {
				if(counts[k]!=0) {
					for(int l=0;l<counts[k];l++) {
						arr[index] = temp[k][l];
						index++;
					}
					counts[k] = 0;
				}
			}
		}
		
	}
}
