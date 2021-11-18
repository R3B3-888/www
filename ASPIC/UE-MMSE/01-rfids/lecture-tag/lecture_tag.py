import os
import serial

device = os.open('/dev/ttyUSB0', os.O_RDWR|os.O_NOCTTY)
serial = serial.Serial('/dev/ttyUSB0', 19200, timeout=1)

os.write(device, b'\xFB')
while True:
    tag = serial.read(size=12)
    tag = bytearray(tag).hex()
    print(tag)
