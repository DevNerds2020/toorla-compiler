class Operator:
    private function subtractor(a:int , b:int) returns int:
        self.result = a - b;
        return self.result;
    end
end
class Test:
    private field result int;
    public function Test() returns int:
           operator = new Operator();
           sub = operator.subtractor();
        return 1;
    end
end

entry class MainClass:
    function main() returns int:
    end
end
