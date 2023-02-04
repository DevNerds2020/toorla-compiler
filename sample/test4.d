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
            while(counter < arr.length)
                self.result = self.result + arr[counter];
                return 2;
        end
end
entry class MainClass:
    private field result b;
    function main() returns int:
        operator = new Operator();
        sub = operator.subtractor();
        sum = operator.arrCollector(arr);
        bigger = operator.comparator(a,b);
        return 1;
        if(a>5)
        begin
            if(a>3)
                b=4;
            elif(x)
                a=7;
        end
        else
        begin
            if(x)
                b=6;
            elif(y)
                a=7;
        end
    end
end