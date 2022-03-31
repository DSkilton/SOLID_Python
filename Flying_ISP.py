from abc import ABC, abstractmethod


class Movable(ABC):
    @abstractmethod
    def go(self):
        pass


class Flyable(Movable):
    @abstractmethod
    def fly(self):
        pass


class Aircraft(Flyable):
    def go(self):
        print("taxiing")

    def fly(self):
        print("flying")


class Car(Movable):
    def go(self):
        print("going!")
