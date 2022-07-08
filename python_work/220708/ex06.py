from openpyxl import Workbook
import numpy as np

wb=Workbook()
ws=wb.active

index=1
for i in range(1,11):
    for j in range(1,11):
        ws.cell(row=i,column=j).value=np.random.randint(0,100)
        #index+=1


wb.save('b.xlsx')
wb.close()
