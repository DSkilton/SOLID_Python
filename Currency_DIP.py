from abc import ABC


class CurrencyConverter(ABC):
    def convert(self, from_currency, to_currency, amount) -> float:
        pass


class FXConverter(CurrencyConverter):
    def convert(self, from_currency, to_currency, amount) -> float:
        print("converting currency using FX API")
        print(f"{amount} {from_currency} = {amount * 1.2} {to_currency}")
        return amount * 1.15


class AnotherConverter(CurrencyConverter):
    def convert(self, from_currency, to_currency, amount) -> float:
        print("converting currency using this API")
        print(f"{amount} {from_currency} = {amount * 2} {to_currency}")
        return amount * 2


class App:
    def __init__(self, converter: CurrencyConverter):
        self.converter = converter

    def start(self):
        self.converter.convert('EUR', 'USD', 100)

if __name__ == "__main__":
    converter1 = AnotherConverter()
    converter2 = FXConverter()
    app = App(converter1)
    app.start()
    app = App(converter2)
    app.start()

