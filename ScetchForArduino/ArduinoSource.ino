int RelePin = 11;
int Triger = 0;

int DalTrigPin = 8;
int DalEchoPin = 9;
 
void setup() 
{
  Serial.begin(9600);
  pinMode(RelePin, OUTPUT);
  digitalWrite(RelePin,HIGH);
  pinMode(DalTrigPin,OUTPUT);
  pinMode(DalEchoPin,INPUT);
}

void loop() 
{ 
  if(Serial.available())
  {
    Triger=Serial.read();
    switch(Triger)
    {
      case '1':
        int duration, cm; 
        digitalWrite(DalTrigPin, LOW); 
        delayMicroseconds(2); 
        digitalWrite(DalTrigPin, HIGH); 
        delayMicroseconds(10); 
        digitalWrite(DalTrigPin, LOW); 
        duration = pulseIn(DalEchoPin,HIGH);
        cm = duration/58;
        Serial.print(cm);
        if(cm<70)digitalWrite(RelePin,LOW);
      break;
      case '2':
        digitalWrite(RelePin,HIGH);
      break; 
    }
  }
}
