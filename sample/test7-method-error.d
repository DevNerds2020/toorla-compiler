class Operator inherits Test:
    public function Operator() returns int:
        return 1;
    end
    public function arrCollector(arr:int[]) returns int:
        var counter = 0;
        while(counter < arr.length)
            self.result = self.result + arr[counter];
        return self.result;
    end
    public function arrCollector(arr:int[]) returns int:
        while(counter < arr.length)
            self.result = self.result + arr[counter];
        return self.result;
    end
end
entry class MainClass:
    function main() returns int:
        return 1;
    end
end
