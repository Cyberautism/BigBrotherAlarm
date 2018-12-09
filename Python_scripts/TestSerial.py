import serial
import time

ser=serial.Serial('/dev/ttyACM0')
ser.write(b'2')
time.sleep(1)
ser.write(b'1')
ser.close()
