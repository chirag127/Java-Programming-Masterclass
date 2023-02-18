import glob
import os

files = glob.glob('*/*/*.java', recursive=True)

for file in files:

    # get the file content
    with open(file, 'r') as f:
        content = f.read()

    # if len(content) < 2: then add /*
    # the name of the folder of the file
    folder_name = os.path.dirname(file)
    # the name of the file
    file_name = os.path.basename(file)
    # the name of the file without the extension
    file_name_no_ext = os.path.splitext(file_name)[0]
    # the name of the file without the extension and the number

    with open(file, 'w') as f:
        f.write(f'''/*
{folder_name.split(" - ")[-1]}

''')