const char pin_n = 3;
char led_pins[pin_n] = {13,12,11};
int time = 0;
char current_led = 0;

#define PINBOUTON 8
#define D 1000

void setup() {
  Serial.begin(9600);
  // initialize digital pin LED_BUILTIN as an output.
  for(char i = 0; i < 3; i++)
    pinMode(led_pins[i], OUTPUT);
  
  pinMode(PINBOUTON, INPUT_PULLUP);
}


// the loop function runs over and over again forever
void loop() {
  if (digitalRead(PINBOUTON) == HIGH) {
    int delta = millis() - time;
    if (delta >= D) {
      time += delta;
      current_led += 1;
      current_led %= pin_n;
      turn_off_leds();
      turn_on_pin(current_led);
    }
  }
  delay(1);
}

void turn_on_pin(char switch_bit) {
  digitalWrite(led_pins[switch_bit], HIGH);
  Serial.print("Led turn on is ");
  Serial.println(led_pins[switch_bit] + 0);
} 

void turn_off_leds() {
  for (char i = 0; i < pin_n; i++) {
    digitalWrite(led_pins[i], LOW);   
  } 
}
