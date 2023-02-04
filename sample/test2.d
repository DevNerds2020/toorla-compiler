class Operator inherits Test:
    private field result int;
    public function Operator() returns int:
        return 1;
    end
    public function subtractor(a: int, b: int) returns int:
        self.result = a-b;
        return self.result;
    end
    public function arrayCollector(arr:int[]) returns int:
        while(counter<arr.length)
            self.result = self.result + arr[counter];

    end
end
entry class MainClass:
    function main() returns int:
      if(a>5)
        return 1;
      end
    end
end