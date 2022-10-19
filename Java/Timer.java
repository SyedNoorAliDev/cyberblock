Class Timer {
int Limit;
int Value;
void setLimit(int b){
this.Limit= b;
}
  void setValue(int a){
  this.Value = a;}
  void Reset(){
  this.Value = 0;}
  void Tick (){
  this.value +=1;
  if (this.Value>=this.Limit}{
  Reset();
  }
  }
