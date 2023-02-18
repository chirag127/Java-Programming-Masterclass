"""get all files of form
22 - Java Networking Programming/387 - Multi Threaded Server.java
and rename them to
22 - Java Networking Programming/Multi_Threaded_Server.java
i.e. remove the number and the space before the file name
to make the file name more java class name friendly
"""
import glob
import os

# get all files of form
files = glob.glob('**/*.java', recursive=True)


for file in files:

    try:
        # get the file name
        file_name = os.path.basename(file)
        # get the folder name
        folder_name = os.path.dirname(file)
        # remove the number and the space before the file name
        try:
            new_file_name = file_name.split(' - ')[1]
        except IndexError:
            new_file_name = file_name


        new_file_name = new_file_name.replace(' ', '')

        new_file_name = new_file_name.replace('-', '')

        new_file_name = new_file_name.replace('(', '')

        new_file_name = new_file_name.replace(')', '')

        new_file_name = new_file_name.replace(';', '')

        new_file_name = new_file_name.replace(',', '')

        # rename the file
        os.rename(file, os.path.join(folder_name, new_file_name))
    except Exception as e:
        print(e)