int RelePin = 4;
int Triger = 0;

void setup() 
{
  Serial.begin(9600);
  pinMode(RelePin, OUTPUT);
  digitalWrite(RelePin,LOW);
}

void loop() 
{
  if(Serial.available())
  {
    Triger=Serial.read();
    Serial.write(Triger);
    switch(Triger)
    {
      case '1':digitalWrite(RelePin,HIGH);break;
      case '2':digitalWrite(RelePin,LOW);break;
    } 
  }
}
