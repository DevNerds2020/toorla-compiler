class Operator inherits Test:
    private field result int;
    public function Operator() returns int:
        return 1;
    end
end
class Test inherits Operator2:
    private field result int;
    public function Operator() returns int:
        return 1;
    end
end
class Operator2 inherits Operator:
    private field result int;
    public function Operator() returns int:
        return 1;
    end
end
entry class MainClass:
    function main() returns int:
        var a = 5;
        var b = 6;
        arr = new int[4];
        var sum=0;
        var sub=0;
        var bigger="";
        operator = new Operator();
        sub = operator.subtractor();
        sum = operator.arrCollector(arr);
        bigger = operator.comparator(a,b);
        return 1;
    end
end
