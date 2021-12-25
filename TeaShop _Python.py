coffee_types = {"capaceno": 1, "tea": 2, "coffee": 3}
print("""  1. capaceno   2 . tea    3 . coffee  """)
type = {1: {"sugar": 4, "water": 20, "power": 4, "item_name": "capaceno"}, 2: {"sugar": 3, "water": 2, "power": 2, "item_name": "tea"}, 3: {"sugar": 7, "water": 4, "power": 2, "item_name": "coffee"}}
total_amount = {1: 10, 2: 5, 3: 7}
capaceno = {"sugar": 4, "water": 20, "power": 4, "item_name": "capaceno"}
tea = {"sugar": 3, "water": 2, "power": 2, "item_name": "tea"}
coffee = {"sugar": 7, "water": 4, "power": 2, "item_name": "coffee"}

total_sugar = 8
total_water = 40
total_power = 10
flag = True
while flag:
    item = int(input("which item you want ?"))
    total_sugar = total_sugar-(type[item]["sugar"])
    total_water = - (type[item]["water"])
    total_power = - (type[item]["power"])
    print("""capaceno - 10 Rs    tea  - 5 Rs    coffee  - 7 Rs  """ )
    amount = int(input("Enter your amount"))
    if amount == total_amount[item]:
        print(f"Good have a nice day take your {type[item]['item_name']} ")

    elif amount>total_amount[item]:
        extra_amount=amount - total_amount[item]
        print(f"amount is more than sufficient so balance is {extra_amount} enjoy your {type[item]['item_name']}")

        print("""1)  capaceno - 10 Rs    2) tea  - 5 Rs    3)  coffee  - 7 Rs  """)
        extra=int(input("Choose any one you want !!!!!!"))
        total_sugar = total_sugar - (type[item]["sugar"])
        total_water = - (type[item]["water"])
        total_power = - (type[item]["power"])
        extra_amount = amount-extra_amount
        print(f"enjoy your {type[item]['item_name']}")
    else:
        flag=False
        print("insuffient balance")
    if total_sugar == 0 or total_water == 0 or total_power == 0:
        print("shop is closed")
        flag=False

