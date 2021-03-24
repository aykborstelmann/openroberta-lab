// This file is automatically generated by the Open Roberta Lab.

#include <Arduino.h>

#include <Servo/src/Servo.h>
#include <NEPODefs.h>


Servo _servo_S;
int _led_L = 13;
int _taster_T = 0;
int _trigger_U = 7;
int _echo_U = 6;
int _TMP36_T2 = A0;
unsigned long __time_1 = millis();

double _getUltrasonicDistance(int trigger, int echo)
{
    digitalWrite(trigger, LOW);
    delay(5);
    digitalWrite(trigger, HIGH);
    delay(10);
    digitalWrite(trigger, LOW);
    return pulseIn(echo, HIGH) * 0.03432/2;
}

void setup()
{
    _servo_S.attach(1);
    pinMode(_led_L, OUTPUT);
    pinMode(_taster_T, INPUT);
    pinMode(_trigger_U, OUTPUT);
    pinMode(_echo_U, INPUT);
}

void loop()
{
    while (true) {
        if ( digitalRead(_taster_T) == true ) {
            break;
        }
        delay(1);
    }
    while (true) {
        if ( (int) (millis() - __time_1) > 500 ) {
            break;
        }
        delay(1);
    }
    while (true) {
        if ( map(analogRead(_TMP36_T2), 0, 410, -50, 150) < 20 ) {
            break;
        }
        delay(1);
    }
    while (true) {
        if ( _getUltrasonicDistance(_trigger_U, _echo_U) < 30 ) {
            break;
        }
        delay(1);
    }
}