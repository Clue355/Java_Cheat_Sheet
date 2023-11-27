package practice;

class Main {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(num);
        Op someNum = new Op(5);
        System.out.println(someNum.getNum());
        someNum.setNum(10);
        System.out.println(someNum.getNum());
    }
}

class Op {
     private int num;

    Op(int _num) {
        num = _num;
    }

    public int getNum() {
        return num;
    }

    public void  setNum(int _num) {
        this.num = _num;
    }
}