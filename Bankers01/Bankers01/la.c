#include<stdio.h>
#include<Windows.h>


#define ROW 5
#define COL 3
void print(int a[COL]){
	system("cls");
	printf("----Available---\n");
	printf(" A\tB\tC\n");
	for (int i = 0; i<COL; ++i)
	{
		printf("%d\t", a[i]);
	}
	printf("\n");
}
void show(int a[ROW][COL]){
	system("cls");
	printf("\tA\tB\tC\n");
	for (int i = 0; i<ROW; ++i){
		printf("P%d\t",i);
		for (int j = 0; j < COL; ++j){
			printf("%d\t", a[i][j]);
		}
	    printf("\n");
    }
}
void init(int a[ROW][COL], int b[ROW][COL],int c[ROW][COL]){
	for (int i = 0; i < ROW; ++i){
		for (int j = 0; j < COL; ++j){
			c[i][j] = a[i][j] - b[i][j];
		}
	}
}
//银行家算法
int Banker(int k, int re[COL], int Need[ROW][COL], int Ava[COL], int All[ROW][COL]){
	if (re[0] <= Need[k][0] && re[1] <= Need[k][1] && re[2]<= Need[k][2]){
		if (re[0] <= Ava[0] && re[1] <= Ava[0] && re[2] <= Ava[2]){
				for (int j = 0; j < COL; ++j){
					Ava[j] = Ava[j] - re[j];
					All[k][j] = All[k][j] + re[j];
					Need[k][j] = Need[k][j] - re[j];
				}
				return 1;
		}
		return 0;
	}
	return 0;
}
//安全性算法
int Safety(int Ava[COL],int Need[ROW][COL],int All[ROW][COL]){
	int finsh[ROW] = { 0 };//记录完成的数组
	int Work[COL];//临时数组，进行检测
	for (int l = 0; l < COL; ++l){
		Work[l] = Ava[l];
	}
	int sum=0;
	for (int k = 0; k <= ROW;++k){//需要多循环几次，最坏就是第一次直接最后一个进程可用，那么最多就会循环ROW次
		for (int i = 0; i < ROW; ++i){
				if (finsh[i] == 0){
					if (Need[i][0] <= Work[0] && Need[i][1] <= Work[1] && Need[i][2] <= Work[2]){
						for (int j = 0; j < COL; ++j){
							Work[j] = Work[j] + All[i][j];
							finsh[i] = 1;
						}
					}
					sum = finsh[i] + sum;
					if (sum == ROW)
						return 1;
			}
		}
	}
	return 0;//找了那麽多次都没有找到，那肯定就不安全
}
//回溯算法
void backBanker(int k, int re[COL], int Need[ROW][COL], int Ava[COL], int All[ROW][COL]){
	for (int j = 0; j < COL; ++j){
		Ava[j] = Ava[j] + re[j];
		All[k][j] = All[k][j] - re[j];
		Need[k][j] = Need[k][j] + re[j];		
	}

}

//请求资源函数
void Request(int re[COL],int Need[ROW][COL], int Ava[COL], int All[ROW][COL]){
	while (1){
		int n,rei;
		printf("是否请求(Y-1/N-0)：");
		scanf("%d", &n);
		if (n==0)
			break;
		else{
			printf("请求的进程是P(0-4):");
			scanf("%d", &rei);
			for (int i = 0; i < COL;++i){
				printf("需要哪种资源多少依次输入%c：",65+i);
				scanf("%d", &re[i]);
			}
			if (!Banker(rei,re, Need, Ava, All)){
				printf("不符合银行不能分配\n");
				continue;
			}
			if (!Safety(Ava, Need, All)){
				printf("不符合安全不能分配\n");
				backBanker(rei,re,Need,Ava,All);
			}
			else
				printf("完全符合-可以分配\n");
		}
	}

}
void main()
{
	int Ava[COL] = {3,3,2};
	int Max[ROW][COL] = { { 7, 5, 3 }, { 3, 2, 2 }, { 9, 0, 2 }, { 2, 2, 2 }, { 4, 3, 3 } };
	int All[ROW][COL] = { { 0, 1, 0 }, { 2, 0, 0 }, { 3, 0, 2 }, { 2, 1, 1 }, { 0, 0, 2 } };
	int Need[ROW][COL];
	init(Max, All, Need);
	int re[COL];
	system("mode con cols=45 lines=25");
	system("color 0A");
	while (1){
		int n;
		printf("请选择 1:请求资源     2:可利用的资源\n");
		printf("       3:最大需求     4:已分配矩阵\n");
		printf("       5:需求矩阵     0:退出\n");
		scanf("%d", &n);
		if (n == 0)
			break;
		switch (n){
		case 1:
			Request(re,Need, Ava, All);
			break;
		case 2:
			print(Ava);
			break;
		case 3:
			printf("-------Max-----\n");
			show(Max);
			break;
		case 4:
			printf("------Allocation-----\n");
			show(All);
			break;
		case 5:
			printf("--------Need--------\n");
			show(Need);
			break;
		default:
			break;
		}

	}
}