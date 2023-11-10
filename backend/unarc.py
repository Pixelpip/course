import os 
import zipfile
hlist=os.path.expanduser("~")
flist=os.listdir(os.path.join(hlist,"Downloads"))
print(flist)
for i in range(len(flist)):
        if flist[i].endswith(".zip"):
            path=os.path.join(os.path.join(hlist,"Downloads"),flist[i])
            print(path)
            with zipfile.ZipFile(path,'r') as zip_ref:
                zip_ref.extractall(os.getcwd())
            os.remove(path)
                
