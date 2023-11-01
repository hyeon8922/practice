int pin_LED[3] = {11, 12, 13};   //pin_LED라는 배열 을 11, 12, 13으로 지정하자. pin_LED[0]=11, pin_LED[1]=12, pin_LED[2]=13으로 선언. 통신핀 예약.
void setup() {   //setup함수는 한번만 적용
int i;   //int형 변수 i 선언
for(i=0; i<3; i++)   // i를 후위연산자를 통해 세번 반복시킬 수 있도록 한다.
{ pinMode(pin_LED[i], OUTPUT);} }   //pinMode(핀번호,출력 또는 입력), pin_LED배열을 출력으로 한다.
void loop() { digitalWrite(pin_LED[0],1);    //pin_LED[0]=11이고 1로 on 한다.
digitalWrite(pin_LED[1],1);    //pin_LED[1]=12이고 1로 on 한다.
digitalWrite(pin_LED[2],1);    //pin_LED[2]=13이고 1로 on 한다.
​
delay(500);    //0.5초 delay를 갖는다.
digitalWrite(pin_LED[0],0);    //pin_LED[0]=11이고 0으로 off한다.
digitalWrite(pin_LED[1],0);   //pin_LED[1]=12이고 1로 off한다.
digitalWrite(pin_LED[2],0); delay(500);   //pin_LED[2]=13이고 1로 off한다.
}





int pin_PIR = 18;    //pin_RIP=18번 핀으로 예약
uint16_t PIR_flag = 0;   //0으로 선언
void setup() {   //한번만 반복
Serial.begin(115200);   //초당 115200비트 사용.
pinMode(pin_PIR, INPUT);    //pin_PIR을 입력으로 사용. attachInterrupt(digitalPinToInterrupt(pin_PIR), PIR_ISR, RISING); }   //PIR 핀이 상승 엣지에서 인터럽트 발생 및 인터럽트 발생시 PIR_ISR 함수가 실행되도록 설정
void loop() {   //반복문
if(PIR_flag == 1){ Serial.println("Detected");    PIR_flag = 0;
}   만약 PIR_flag가 1일때, “Detected”라고 출력, 그리고 PIR_flag을 0으로 선언.
else{
Serial.println("Not detected"); }
delay(500);
}   //PIR_flag가 1이 아닐시, “Not detected”를 출력하고 0.5초를 기다린다.
void PIR_ISR(void){   //PIR_ISR 함수 정의
PIR_flag = 1;   PIR_flag를 1로 선언.
}
