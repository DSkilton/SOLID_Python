global temperature_readings
global current_temperature


def set_temperature(temperature):
    if temperature > 10:
        temperature = 10

    temperature_readings.append(temperature)
    current_temperature = temperature


def get_current_temperature(self):
    return current_temperature


def start_monitor():
    if current_temperature > 10:
        alert(current_temperature)


def get_temperature_readings():
    return temperature_readings


def alert(temperature):
    print(f'Ice ream mahcine too warm. Temperature: {temperature}')

