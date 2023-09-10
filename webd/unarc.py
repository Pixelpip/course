import os 
import sys
import pathlib
import zipfile
flist=os.listdir()
print(flist)
for i in range(len(flist)):
        if flist[i].endswith(".zip"):
            path=os.path.join(os.getcwd(),flist[i])
            print(path)
            with zipfile.ZipFile(path,'r') as zip_ref:
                zip_ref.extractall("../vscd/course/webd")
            os.remove(path)
                
