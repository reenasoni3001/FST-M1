import pandas	
from pandas import ExcelWriter
values = {
	'FirstName':["Satvik", "Avinash", "Lahri"],
	'LastName':["Shah", "Kati", "Rath"],
	'Email':["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
	'PhoneNumber':["4537829158", "4892184058", "4528727830"]
}

data = pandas.DataFrame(values)

print(data)

writer = ExcelWriter('sample1.xlsx')

data.to_excel(writer, 'sheet1', index= False)

writer.save()