// We will learn how we can implement the calculator program with the help of parallel array.
// Calculator program

class Calculator_Parallel_Array
{
public static void main(String[] args)
{
double[] FirstArray = {10.0d, 20.5d, 50.0d, 70.0d, 80.0d};
double[] SecondArray = {5.0d, 40.5d, 80.0d, 30.0d, 70.0d};

char[] oprCode = {'a','d','s','m'};

double[] results = new double[oprCode.length];

for(int i = 0; i<oprCode.length; i++)
{

switch(oprCode[i]) 
{
case 'a':
        results[i] = FirstArray[i] + SecondArray[i];
        break;

case 'd':
        results[i] = FirstArray[i] / SecondArray[i];
        break;

case 's':
        results[i] = FirstArray[i] - SecondArray[i];
        break;

case 'm':
        results[i] = FirstArray[i] * SecondArray[i];
        break;
 
 default:
 System.out.println("Invalid oprCode:" +oprCode);
 results[i] = 0.0d;
 
 break;
}
}

for(int i = 0; i<oprCode.length; i++)
{
 System.out.println(results[i]);
 }


// Implement with for-each loop 
/*
for(double curResult : results)
System.out.println(curResult);
*/
}}
 
