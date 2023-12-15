x = 3;
y = 4;

z = x + y;

fprintf("y is %d\n", y);


a = [1,2,3,4,5,6,7,8,9,10];

fprintf("My array has: \n");
fprintf("%d ", a);

l = length(a);

    range = 3;
    for i = 1 : l
        total = 0;
        amount = 0;
        if(i < range)
            j = 0;

            while(j <= i + range)
                total = total + a(i);
                j = j + 1;
                amount = amount + 1;
            end
            average = total / amount;
            a(i) = [];
            a(i) = average;
   
        elseif(i >= range && i < l - range)
            j = i - range;
            while(j < i + range + 1)
                total = total + a(i);
                j = j + 1;
                amount = amount + 1;
            end
            average = total / amount;
            a(i) = [];
            a(i) = average;
        else
            j = i - range;
            while(j < l)
                total = total + a(i);
                j = j + 1;
                amount = amount + 1;
            end
            average = total / amount;
            a(i) = [];
            a(i) = average;
        end
    end

fprintf("Smooth array has: \n");
fprintf("%d ", a);
