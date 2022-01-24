import pandas

dataframe = pandas.read_excel('sample1.xlsx')

print(dataframe)

print("number of rows nad columns", dataframe.shape)

	
print(dataframe['Email'])
	
print(dataframe.sort_values('FirstName'))