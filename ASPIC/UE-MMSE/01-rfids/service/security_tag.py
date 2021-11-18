import os
import serial
import time

device = os.open('/dev/ttyUSB0', os.O_RDWR|os.O_NOCTTY)
serial = serial.Serial('/dev/ttyUSB0', 19200, timeout=1)

access_tag = '0000f618df10000104e0cf40'
rejected_tag = '000081f2940e000104e07b65'

os.write(device, b'\xFB')

while 1:
    tag = serial.read(size=12)
    tag = bytearray(tag).hex()

    if tag == access_tag:
        os.write(device, b'\xFC')
        os.write(device, b'\xFF')
        print("CEO access")
    elif tag == '':
        os.write(device, b'\xFD')
        os.write(device, b'\xFE')
        print()
    else:
        os.write(device, b'\xFE')
        os.write(device, b'\xFD')
        print("access denied")
    print(tag)
    