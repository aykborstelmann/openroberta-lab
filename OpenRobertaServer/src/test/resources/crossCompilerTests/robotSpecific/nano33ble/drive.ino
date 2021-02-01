// This file is automatically generated by the Open Roberta Lab.

#include <Arduino.h>
#include <Servo/src/Servo.h>


int _led_L = 13;
Servo _servo_S;
int _taster_T = 0;

void setup()
{
    pinMode(_led_L, OUTPUT);
    _servo_S.attach(1);
    pinMode(_taster_T, INPUT);
}

void loop()
{
    _servo_S.write(90);
    while (true) {
        if ( digitalRead(_taster_T) == true ) {
            break;
        }
        delay(1);
    }
}