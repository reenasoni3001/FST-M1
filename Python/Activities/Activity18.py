import pandas

dataframe = pandas.read_csv("activity.csv")

print(dataframe["Username"])

print(dataframe["Username"][1], " ", dataframe["Password"][1])
print(dataframe.sort_values('Username'))
print(dataframe.sort_values('Password', ascending= False))