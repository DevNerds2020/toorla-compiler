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
            int counter = 0;
            while(counter < arr.length):
                self.result = self.result + arr[counter];
            end
        return self.result;
        end
        public function comparator(a:int , b: int) returns string:
            if(a<b) int alaki = 3;
                if(a<0)
                    print("a is negative")
                return "a is bigger than b";
            elif(a>b)
                if(b<0)
                    print("b is negative");
                return "b is bigger than a";
            else
                return "a and b are equal";
            end
        end
entry class MainClass:
    function main() returns int:
        int a = 5;
        int b = 6;
        arr = new int[4];
        int sum;
        int sub;
        string bigger;
        operator = new Operator();
        sub = operator.subtractor();
        sum = operator.arrCollector(arr);
        bigger = operator.comparator(a,b);
        return 1;
    end
end