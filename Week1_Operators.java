class Week1_Operators{
    public static void main(String [] args){

    
        int a = 5, b = 10;
        int c = 5*a - 3*b + a*b; // 45

        System.out.println(c/a);
        System.out.println(c/b);
        System.out.println(-c/b);
        System.out.println(c/(double)b);

        // Modulo operator (remainder)
        System.out.println(c % b);
        System.out.println(c % a);

        // Assignment Operator
        c = 10;
        System.out.println("c = " + c);

        c = c + 5;
        System.out.println("c = " + c);

        c += 6;
        System.out.println("c = " + c);

        // Relational Operators (>, <, >=, <=, !=, ==)
        System.out.println(a == c);
        System.out.println(30.5 <= c);
        System.out.println(a <= c); // >=
        System.out.println(a > c); // <
        System.out.println(a != c);

        // Logical Operators (&&, ||, !)
        System.out.println(a <= c && b <= c);
        System.out.println(a <= c && b >= c);

        // Unary Operators
        // Pre-increment
        // Post-increment
        // Pre-decrement
        // Post-decrement

        c--; // post-decrement
        System.out.println(c); // 20
        a++; // post-increment
        System.out.println(a); // 6
        --c; // pre-decrement
        System.out.println(c); // 19
    }
}

/*
int/int -> int
int/double -> double
double/int -> double
double/double -> double
*/
    
