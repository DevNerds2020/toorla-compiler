class Operator inherits Test:
    private field result int;
    public function Operator() returns int:
        return 1;
    end
    public function subtractor(a:int , b:int) returns int:
        self.result = a - b;
        return self.result;
    end
    public function arrCollector(arr:int[]) returns int:
        var counter = 0;
        while(counter < arr.length)
            self.result = self.result + arr[counter];
        return self.result;
    end
    public function comparator(a:int , b: int) returns string:
        if(a<b)
        begin
            var alaki = 3;
            if(a<0)
                print("a is negative");
            return "b is bigger than a";
        end
        elif(a>b)
        begin
            if(b<0)
                print("b is negative");
            return "a is bigger than b";
        end
        else
            return "a and b are equal";
    end
end
entry class MainClass:
    function main() returns int:
        var a = 5;
        var b = 6;
        arr = new int[4];
        var sum=0;
        var sub=0;
        var a = 12;
        var bigger="";
        var operator = new Operator();
        sub = operator.subtractor();
        var undefinedClass = new Anonymous();
        sum = operator.arrCollector(arr);
        bigger = operator.comparator(a,b);
        return 1;
    end
end
