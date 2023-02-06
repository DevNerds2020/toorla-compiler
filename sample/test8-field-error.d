class Operator inherits Test:
    private field result int;
    public function Operator() returns int:
        return 1;
    end
    public function arrCollector(arr:int[]) returns int:
        var bigger="";
        var counter = 0;
        while(counter < arr.length)
            self.result = self.result + arr[counter];
        return self.result;
    end
    public function arrCollectorxd(arr:int[]) returns int:
        var bigger="";
        var counter = 0;
        while(counter < arr.length)
            self.result = self.result + arr[counter];
        return self.result;
    end
end
class Operator2 inherits Test:
    private field result int;
    public function Operator() returns int:
        return 1;
    end
    public function arrCollector(arr:int[]) returns int:
        var bigger="";
        var counter = 0;
        while(counter < arr.length)
            self.result = self.result + arr[counter];
        return self.result;
    end
    public function arrCollectorxd(arr:int[]) returns int:
        var bigger="";
        var counter = 0;
        while(counter < arr.length)
            self.result = self.result + arr[counter];
        return self.result;
    end
end
class Operator3 inherits Test:
    private field result int;
    private field result int;
    public function Operator() returns int:
        return 1;
    end
    public function arrCollector(arr:int[]) returns int:
        var bigger="";
        var counter = 0;
        while(counter < arr.length)
            self.result = self.result + arr[counter];
        return self.result;
    end
    public function arrCollectorxd(arr:int[]) returns int:
        var bigger="";
        var counter = 0;
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
