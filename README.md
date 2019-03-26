# 2019_Q1
2019_Q1_软件开发工程师(Java) 

描述: 程序接收两行输入, 第一行是两个数字, 表示探测网格大小, 空格隔开; 第二行是一个字符串, 表示对应地形; 

输出: 一个和探测网格大小相同的矩阵, 保证矩阵对应的地形量(蛇形采集地形);

通过IDEA运行 

第一行输入有效正整数，存在非正整数则抛出MyDetectiveException: Incorrect mesh size. 

输入必须以整数开头，空格开头抛出MyDetectiveException: Incorrect mesh size. 

第一个数字与第二个数字见可以存在多个空格

输入第二个数字后不能再输入空格，也不能输入更多的数字，否则抛出MyDetectiveException: Incorrect mesh size. 

第二行输入有效字符串，否则抛出MyTypeException: Invalid cell type. 

输入字符的个数合法，否则抛出MyDataMatchException: Data mismatch. 

