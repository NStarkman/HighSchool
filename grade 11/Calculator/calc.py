
class CALC ():
    def Add(self, num1, num2):
        sum = num1 + num2
        print(num1, "+", num2, "=", sum)
    def Subtract(self, num1, num2):
        diff = num1 - num2
        print(num1, "-", num2, "=", diff)
    def multiply(self,num1, num2):
        prod = num1 *num2
        print(num1, "x", num2, "=",prod)
    def divide (self, num1, num2):
        quotient = num1/num2
        print(num1, "/", num2, "=",quotient)
    def listMult (self, list):
        for i in range (0, len(list)):
            mult += list[i]


cont = True
multList = []
int1 = int(input("Input the first interger: "))
int2 = int(input("Input the second interger: "))
function = input("What would you like to do? (A for add, S for subtract, M for multiply, D for divide): ")

calculator = CALC()
if function == "A":
    calculator.Add(int1,int2)
elif function == "S":
    calculator.Subtract(int1, int2)
elif function == "M":
    multMode = input("Would you like to multiply a list? (Y/N): ")
    if multMode == "N":
        calculator.multiply(int1,int2)
    else:
        while cont:
            list_num=int(input("What number would you like to append (-1 to quit): "))
            if list_num == "-1":
                cont = False
            else:
                multList.append(list_num)
                calculator.listMult(multList)
elif function == "D":
    calculator.divide(int1,int2)
