package com.kunalkushwaha.stack;

public class GrowableStack extends CustomStack{

    public GrowableStack(){
        super();
    }
    public GrowableStack(int size){
        super(size);
    }

    @Override
    public void push(int element) throws StackException {
        if (this.stackOverflow()){
            int[] temp = new int[data.length*2];
            for(int i=0;i< data.length;i++){
                temp[i]=data[i];
            }
            data=temp;
        }
        super.push(element);

    }
}
