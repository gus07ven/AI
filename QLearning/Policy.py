import QTable

a = QTable.MyQTable()

a.df.loc['1,1,1', 'n'] = 7
print(a.df)