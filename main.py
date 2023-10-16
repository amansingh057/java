import numpy as np 
import pandas as pd 
import category_encoders as ce
from sklearn.preprocessing import RobustScaler
from sklearn.model_selection import train_test_split
from sklearn.naive_bayes import GaussianNB
from sklearn.metrics import accuracy_score
import matplotlib.pyplot as plt 
import seaborn as sns

df=pd.read_csv('./adult.csv')
print(df.shape)
df.head()

col_names = ['age', 'workclass', 'fnlwgt', 'education', 'education_num', 'marital_status', 'occupation', 'relationship',
             'race', 'sex', 'capital_gain', 'capital_loss', 'hours_per_week', 'native_country', 'income']

df.columns = col_names
df.columns
df.head()
df.info()
df.describe()
df.isnull().sum()
categorical = [var for var in df.columns if df[var].dtype=='O']

print('There are {} categorical variables\n'.format(len(categorical)))
print('The categorical variables are :\n\n', categorical)

df.workclass.value_counts()
df['workclass'].replace('?', np.NaN, inplace=True)
df.occupation.value_counts()
df.native_country.value_counts()
df['native_country'].replace('?', np.NaN, inplace=True)

X = df.drop(['income'], axis=1)
y = df['income']

X_train, X_test, y_train, y_test = train_test_split(X, y, test_size = 0.2, random_state = 42)

encoder = ce.OneHotEncoder(cols=['workclass', 'education', 'marital_status', 'occupation', 'relationship', 
                                 'race', 'sex', 'native_country'])

X_train = encoder.fit_transform(X_train)
X_test = encoder.transform(X_test)

print(X_train.shape)

X_train.head()
X_train

cols = X_train.columns

scaler = RobustScaler()

X_train = scaler.fit_transform(X_train)
X_test = scaler.transform(X_test)

X_train = pd.DataFrame(X_train, columns=[cols])
X_test = pd.DataFrame(X_test, columns=[cols])

X_train.head()

model = GaussianNB()
model.fit(X_train, y_train)

y_pred = model.predict(X_test)
y_pred_train = model.predict(X_train)

print('Model accuracy score (testing dataset) : ',accuracy_score(y_test, y_pred))

print('Model accuracy score (training dataset) : ',accuracy_score(y_train, y_pred_train))

y_pred_prob = model.predict_proba(X_test)
y_pred_prob

y_pred_prob_df = pd.DataFrame(data=y_pred_prob, columns=['P(<=50K)', 'P(>50K)'])
y_pred_prob_df
