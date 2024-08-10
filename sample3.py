import random
import pandas as pd
import copy

class Faculty:
  def __init__(self, subject):
    self.subject = subject
    self.timetable={'Monday':[None]*7,'Tuesday':[None]*7,'Wednesday':[None]*7,'Thursday':[None]*7,'Friday':[None]*7,'Saturday':[None]*7}

days = ['Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday']
periods = ['Period 1', 'Period 2', 'Period 3', 'Period 4', 'Lunch Break', 'Period 5', 'Period 6', 'Period 7']

timetable_section1={'Monday':[None]*7,'Tuesday':[None]*7,'Wednesday':[None]*7,'Thursday':[None]*7,'Friday':[None]*7,'Saturday':[None]*7}
timetable_section2={'Monday':[None]*7,'Tuesday':[None]*7,'Wednesday':[None]*7,'Thursday':[None]*7,'Friday':[None]*7,'Saturday':[None]*7}


subjects = ['DAA', 'SE', 'DBMS', 'Java', 'P & S']


subject_count = {"DAA":6,"SE":5,"DBMS":5,"Java":5,"P & S":5}


objs={sub:Faculty(sub) for sub in subjects}
#print(objs)


def assign_subjects(original_timetable):
  timetable = copy.deepcopy(original_timetable)
  def is_ok():
    for i in timetable.values():
        if any(i is None):
            return False
    return True
  temp_subs = ['DAA', 'SE', 'DBMS', 'Java', 'P & S']
  temp_subject_count = {subject: 0 for subject in subjects}
  for day in days:
    for peroid in range(len(periods)-1):
        if timetable[day][peroid] is not None:
            continue
        subject=random.choice(temp_subs)
        if(temp_subject_count[subject]>=subject_count[subject]):
            temp_subs.remove(subject)
            subject=random.choice(temp_subs)
        print(temp_subject_count)
        faculty_timetable=objs[subject].timetable
        if(peroid==0):
            timetable[day][peroid]=subject
            faculty_timetable[day][peroid]=subject
            temp_subject_count[subject]+=1
            faculty_timetable[day][peroid+1]='---'
            continue
        if(faculty_timetable[day][peroid-1] is None):
            timetable[day][peroid]=subject
            faculty_timetable[day][peroid]=subject
            temp_subject_count[subject]+=1
            if(peroid==6 or peroid==3):
                continue
            faculty_timetable[day][peroid+1]='---'
        if timetable[day][peroid] is None:
            print('Spotted...')
            print(faculty_timetable[day])
            print(subject,'   ',peroid,'   ',day)

    if not is_ok:
       assign_subjects(original_timetable)
    else:
       timetable=original_timetable


timetable_section1['Tuesday'][0:4] = ['SVR Lab'] * 4
timetable_section1['Wednesday'][4:7] = ['Java Lab'] * 3
timetable_section1['Friday'][4:7] = ['DBMS Lab'] * 3


timetable_section1['Monday'][2:4] = ['PCS - 2'] * 2
timetable_section1['Wednesday'][2:4] = ['PCS - 1'] * 2

timetable_section1['Saturday'][6] = 'Sports'
timetable_section1['Thursday'][6] = 'Library'


assign_subjects(timetable_section1)

periods1=['Period 1', 'Period 2', 'Period 3', 'Period 4', 'Period 5', 'Period 6', 'Period 7']
timetable_df_section_1 = pd.DataFrame(timetable_section1, index=periods1)
            
print(timetable_df_section_1.transpose())

for day in days:
    timetable_section1[day].insert(4, "Lunch Break")
    timetable_section2[day].insert(4, "Lunch Break")

timetable_df_section_1 = pd.DataFrame(timetable_section1, index=periods)
            
print(timetable_df_section_1.transpose())


  