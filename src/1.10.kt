class Car:
    def __init__(self, car_type, model, price, owner, miles_driven):
self.car_type = car_type
self.model = model
self.original_price = price
self.owner = owner
self.miles_driven = miles_driven

def get_car_info(self):
return {
    "Type": self.car_type,
    "Model": self.model,
    "Original Price": self.original_price,
    "Owner": self.owner,
    "Miles Driven": self.miles_driven,
}

def current_car_price(self):
# Simple depreciation logic: 15% value drop for every 10,000 miles
depreciation_rate = 0.15
depreciation = (self.miles_driven // 10000) * depreciation_rate * self.original_price
return max(self.original_price - depreciation, 0)

def display_car_info(self):
info = self.get_car_info()
print("Car Information:")
for key, value in info.items():
print(f"{key}: {value}")
print(f"Current Price: {self.current_car_price():.2f}")

my_car = Car(car_type="Sedan", model="Toyota Camry", price=25000, owner="John Doe", miles_driven=15000)

my_car.display_car_info()
