#include "bob3.h" 
Bob3 rob;

void action();

double ___numberVar;
bool ___booleanVar;
unsigned int ___colourVar;

void action() {
    rob.setLed(EYE_2, RGB(0x00, 0x00, 0x00));
    rob.setLed(EYE_2, RGB(0x00, 0x00, 0xff));
    rob.setLed(EYE_2, RGB(0x22, 0x88, 0x22));
    rob.setLed(EYE_2, RGB(0x44, 0x66, 0xee));
    rob.setLed(EYE_2, RGB(0x44, 0x88, 0xaa));
    rob.setLed(EYE_2, RGB(0x66, 0x33, 0xaa));
    rob.setLed(EYE_2, RGB(0x66, 0x99, 0xee));
    rob.setLed(EYE_2, RGB(0x55, 0xff, 0x99));
    rob.setLed(EYE_2, RGB(0x00, 0xff, 0x00));
    rob.setLed(EYE_2, RGB(0x77, 0xff, 0xdd));
    rob.setLed(EYE_2, RGB(0x00, 0xff, 0xff));
    rob.setLed(EYE_2, RGB(0xdd, 0x44, 0x22));
    rob.setLed(EYE_2, RGB(0xff, 0x00, 0x00));
    rob.setLed(EYE_2, RGB(0xff, 0x00, 0x88));
    rob.setLed(EYE_2, RGB(0xff, 0x00, 0xff));
    rob.setLed(EYE_2, RGB(0xff, 0x77, 0x55));
    rob.setLed(EYE_2, RGB(0xff, 0x88, 0x00));
    rob.setLed(EYE_2, RGB(0xff, 0xff, 0x00));
    rob.setLed(EYE_2, RGB(0xff, 0xff, 0xff));
    rob.setLed(EYE_1, RGB(0x00, 0x00, 0x00));
    rob.setLed(EYE_1, RGB(0x00, 0x00, 0xff));
    rob.setLed(EYE_1, RGB(0x22, 0x88, 0x22));
    rob.setLed(EYE_1, RGB(0x44, 0x66, 0xee));
    rob.setLed(EYE_1, RGB(0x44, 0x88, 0xaa));
    rob.setLed(EYE_1, RGB(0x66, 0x33, 0xaa));
    rob.setLed(EYE_1, RGB(0x66, 0x99, 0xee));
    rob.setLed(EYE_1, RGB(0x55, 0xff, 0x99));
    rob.setLed(EYE_1, RGB(0x00, 0xff, 0x00));
    rob.setLed(EYE_1, RGB(0x77, 0xff, 0xdd));
    rob.setLed(EYE_1, RGB(0x00, 0xff, 0xff));
    rob.setLed(EYE_1, RGB(0xdd, 0x44, 0x22));
    rob.setLed(EYE_1, RGB(0xff, 0x00, 0x00));
    rob.setLed(EYE_1, RGB(0xff, 0x00, 0xff));
    rob.setLed(EYE_1, RGB(0xff, 0x77, 0x55));
    rob.setLed(EYE_1, RGB(0xff, 0x88, 0x00));
    rob.setLed(EYE_1, RGB(0xff, 0xff, 0x00));
    rob.setLed(EYE_1, RGB(0xff, 0xff, 0xff));
    rob.setLed(EYE_2, OFF);
    rob.setLed(EYE_1, OFF);
    rob.setLed(LED_4, ON);
    rob.setLed(LED_4, OFF);
    rob.setLed(LED_3, ON);
    rob.setLed(LED_3, OFF);
    remember((int)(___numberVar));
    ___numberVar = recall();
}

void setup()
{
    ___numberVar = 0;
    ___booleanVar = true;
    ___colourVar = RGB(0xFF, 0xFF, 0xFF);
    
}

void loop()
{
    action();
}