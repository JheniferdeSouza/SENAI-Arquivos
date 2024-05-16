/*
Um programa que ler um led RGB, utilizando somente seus três canais é misturado as cores criado a ilusão de 
está acendendo outras cores. 

Linguagem: c++
Platforma: Arduino IDE
Placa: ESP32
Data:01/08/2023

*/

//Canais do led RGB
#define  canalY        0
#define  canalG        1
#define  canalR        2
#define  canalB        3

//Configurações Virtuais
#define  frequencia 5000
#define  resolucao     8

//Pinos fisicos
#define  ledYpin      19
#define  ledGpin      18
#define  ledRpin       5
#define  ledBpin       4

void setup()
{
  ledcSetup(canalY,frequencia,resolucao);
  ledcSetup(canalG,frequencia,resolucao);
  ledcSetup(canalR,frequencia,resolucao);
  ledcSetup(canalB,frequencia,resolucao);
  
  ledcAttachPin(ledYpin,canalY);
  ledcAttachPin(ledGpin,canalG);
  ledcAttachPin(ledRpin,canalR);
  ledcAttachPin(ledBpin,canalB);
}

void loop() 
{
  //Configuração inicial
  int y=0,g=0,r=255,b=0;
  ledcWrite(canalY,y);
  ledcWrite(canalG,g);
  ledcWrite(canalR,r);
  ledcWrite(canalB,b);
  //Looping 1
  for(int i=0;i<=255;i++)
  {
    y++;
    r--;
    
    ledcWrite(canalY,y);
    ledcWrite(canalR,r);
    delay(30);
  }
  //Looping 2
  y=255;
  r=0;
  ledcWrite(canalY,y);
  ledcWrite(canalR,r);
  for(int i=0;i<=255;i++)
  {
    
    g++;
    b++;
    ledcWrite(canalG,g);
    ledcWrite(canalB,b);
    delay(30);
  }
  //Looping 3
   for(int i=0;i<=255;i++)
  {
    y--;
    g--;
    r++;
    b--;
    ledcWrite(canalY,y);
    ledcWrite(canalG,g);
    ledcWrite(canalR,r);
    ledcWrite(canalB,b);
    delay(30);
  }
  y=0;
  g=0;
  b=0;
  ledcWrite(canalY,y);
  ledcWrite(canalG,g);
  ledcWrite(canalB,b);
  //Looping 4
  for(int i=0;i<=255;i++)
  {
    r--;
    ledcWrite(canalR,r);
    delay(30);
  }
  y=0;
  g=0;
  b=0;
  r=0;
  ledcWrite(canalY,y);
  ledcWrite(canalG,g);
  ledcWrite(canalB,b);
  ledcWrite(canalR,r);
  //Looping 5
    for(int i=0;i<=255;i++)
  {
    b++;
    ledcWrite(canalB,b);
    delay(30);
  }
  y=0;
  g=0;
  r=0;
  ledcWrite(canalY,y);
  ledcWrite(canalG,g);
  ledcWrite(canalR,r);
  //Looping 6
      for(int i=0;i<=255;i++)
  {
    r++;
    ledcWrite(canalR,r);
    delay(30);
  }
  y=0;
  g=0;
 
  ledcWrite(canalY,y);
  ledcWrite(canalG,g);
 
  //Looping 7
   for(int i=0;i<=255;i++)
  {
    g++;
    ledcWrite(canalG,g);
    delay(30);
  }
  y=0;
 
  ledcWrite(canalY,y);
    //Looping 8
   for(int i=0;i<=255;i++)
  {
    y++;
    ledcWrite(canalY,y);
    delay(30);
  }

 //Looping 9
   for(int i=0;i<=255;i++)
  {
    b--;
    ledcWrite(canalB,b);
    delay(30);
  }
  b=0;
  ledcWrite(canalB,b);
  //Looping 10
   for(int i=0;i<=255;i++)
  {
    r--;
    ledcWrite(canalR,r);
    delay(30);
  }
  b=0;
  ledcWrite(canalB,b);
  r=0;
  ledcWrite(canalR,r);
  //Looping 11
   for(int i=0;i<=255;i++)
  {
    g--;
    ledcWrite(canalG,g);
    delay(30);
  }
  b=0;
  ledcWrite(canalB,b);
  r=0;
  ledcWrite(canalR,r);
  g=0;
  ledcWrite(canalG,g);
  //Looping 12
  for(int i=0;i<=255;i++)
  {
    delay(30);
  }
  b=0;
  ledcWrite(canalB,b);
  r=0;
  ledcWrite(canalR,r);
  g=0;
  ledcWrite(canalG,g);
  //Looping 13
  for(int i=0;i<=255;i++)
  {
    y--;
    ledcWrite(canalY,y);
    delay(30);
  }
  b=0;
  ledcWrite(canalB,b);
  r=0;
  ledcWrite(canalR,r);
  g=0;
  ledcWrite(canalG,g);
  y=0;
  ledcWrite(canalY,y);
  //Looping 14
    for(int i=0;i<=255;i++)
  {
    delay(30);
  }
  b=0;
  ledcWrite(canalB,b);
  r=0;
  ledcWrite(canalR,r);
  g=0;
  ledcWrite(canalG,g);
  y=0;
  ledcWrite(canalY,y);
  delay(3000);
  }
