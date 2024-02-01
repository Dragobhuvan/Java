public class Starpatterns {
    public static void main(String args[]){
        int n = 5;
        diamond(n);
    }

    static void box(int n){
        for(int i = 0; i<n; i++){ //outer loop
            for(int j = 0; j<n; j++){ //inner loop
                System.out.print("*");
            }
            System.out.println(); //for line break
        }
    }

    static void rightangletriangle(int n){
        for(int i =0; i<n ; i++){ //outer loop
            for(int j = 0; j <= i; j++){ //inner loop
                // To increment and print run j till i.
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void inverted_rightangletriangle(int n){
        for(int i = 0; i < n; i++){ //outer loop
            for( int j = 5; j > i; j--){ //inner loop
                // Increase the inner value to n at first inner iteration, then decrease.
                System.out.print("*");
            }
            System.out.println();
        }
        //Alternate : 
        // for(int i = n; i > 0; i--){ //outer loop
        //     for( int j = 0; j < i; j++){ //inner loop
    }

    static void mirrored_rightangletriangle(int n){
        int space = n; //if n-1 is assigned then, s should be 1.
        for(int i = 0; i<n; i++){ //inner loop
            for(int s = 0; s<space; s++){ //space loop
                System.out.print(" ");
            }
            for(int j = 0; j<=i; j++){ //inner loop
                System.out.print("*");
            }
            System.out.println();
            space--; //decrement space on each outer loop iteration
        }
    }

    static void pyramid(int n){
        int space = n-1;
        for(int i = 1; i<=n; i++){ //outer loop, started from 1 for multiplication for j.
            for(int s = 0; s<space; s++){ //space loop
                System.out.print(" ");
            }
            for(int j = 0; j<2*i-1; j++){ //inner loop, +2 stars on each iteration by 2*i-1.
                System.out.print("*");
            }
            System.out.println();
            space--; //decrement space
        }
    }

    static void inverted_pyramid(int n){
        for(int i = n; i>0; i--){ //inner loop, use decremental method for inverted patterns
            for(int s = 0; s<n-i; s++){ // space
                System.out.print(" ");
            }
            for(int j = 0; j<2*i-1; j++){ //inner loop
                System.out.print("*");
            }
            System.out.println(); //line break
        }
    }

    static void diamond(int n){
        int count = 0;
        for(int i = 1; i<=2*n; i++){ // Outer loop - lines double the time of n. so 2*n. 
            // In this pattern, we have to alter the stars & spaces with i, to eliinate second nested for loops 
            // If else condition is implemented.
            int stars; 
            int spaces;
            if(i<=n){ // this will bring the pyramid.
                spaces = n-i;
                stars = 2*i-1;
            }else{ // This brings out the inverted pyramid.
                // The challange is decrementing the value by 2 everytime so a external var is created & used.
                // the var should be outside the for loops, if brought inside any loop, value will reset. 
                spaces = (i-n)-1;
                stars = 2*n-1-count;
                count+=2;
            }
            for(int s = 1; s<=spaces; s++){
                System.out.print(" ");
            }
            for(int j = 1; j<= stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    
}
