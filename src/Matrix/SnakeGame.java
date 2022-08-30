package Matrix;

import java.util.*;

// soln: 2d array, sc: O(1), tc: O(W*H+F) where W is Width, H is Height and F is the food length.
//class Matrix.SnakeGame {
//
//    int [][] snakeMap;
//    int [] snakeHead;
//    int [] snakeTail;
//    int width,height;
//    Queue moveList;
//    int score;
//    int[][]food;
//    public Matrix.SnakeGame(int width, int height, int[][] food) {
//        snakeMap = new int[height][width];
//        this.width = width;
//        this.height =height;
//        snakeMap[food[0][0]][food[0][1]]=-1;
//        snakeMap[0][0]=1;
//        snakeHead = new int[]{0,0};
//        snakeTail = new int[]{0,0};
//        score= 0;
//        this.food = food;
//        moveList = new LinkedList<String>();
//    }
//
//    public int move(String direction) {
//        moveList.add(direction);
//        // Head moving
//        moveDirection(direction,snakeHead);
//        score = updateMap();
//        return score;
//
//    }
//    private int updateMap(){
//        // make it doest hit wall
//        if(snakeHead[0]>-1&&snakeHead[0]<this.width&&snakeHead[1]>-1&&snakeHead[1]<this.height){
//            snakeHead[1]=Math.abs(snakeHead[1]);
//            //check if this block has food or not
//            if( snakeMap[snakeHead[1]][snakeHead[0]]==-1){
//                //generate food
//                score++;
//                if(score<food.length){
//                    int test = this.food[score][1];
//                    int tmp = this.food[score][0];
//                    snakeMap[this.food[score][0]][this.food[score][1]]=-1;
//                }
//            }
//            // check if this block has body or not
//            else if(snakeMap[snakeHead[1]][snakeHead[0]]==1&&(snakeHead[1]!=snakeTail[1]||snakeTail[0]!=snakeHead[0])){
//                score = -1;
//            }
//            else{
//                //Tail moving, check if this block has no food
//                snakeMap[snakeTail[1]][snakeTail[0]]=0;
//                String s = moveList.poll().toString();
//                moveDirection(s,snakeTail);
//            }
//            snakeMap[snakeHead[1]][snakeHead[0]]=1;
//        }else{
//            score = -1;
//        }
//        return score;
//    }
//
//    // snake move
//    private void moveDirection(String direction, int[] arr){
//        if(direction.equals("U"))arr[1]-=1;
//        if(direction.equals("D"))arr[1]+=1;
//        if(direction.equals("L"))arr[0]-=1;
//        if(direction.equals("R"))arr[0]+=1;
//    }
//}

class SnakeGame {
    Map<int[], Boolean> body;
    Deque<int []> snakeQueue;
    int[] head;
    int[][]food;
    int score, width, height;
    public SnakeGame(int width, int height, int[][] food) {
        snakeQueue = new LinkedList();
        head = new int[]{0,0};
        snakeQueue.offer(head);
        score = 0;
        this.food = food;
        this.width = width;
        this.height = height;
        body=new HashMap<>();
        body.put(head,true);
    }

    public int move(String direction) {

        int[] previousHead = snakeQueue.peek();
        //move
        moveDirection(direction,previousHead);

        //check if it hit the wall
        if(previousHead[0]<0||previousHead[1]<0||previousHead[0]>=this.width||previousHead[1]>=this.height){
            return -1;
        }
        // check if it eat food
        if(previousHead[0]==this.food[score][0]&&previousHead[1]==this.food[score][1]){
            score++;
        }else{
            snakeQueue.poll();
            body.remove(previousHead);
        }
         //check if it hit the body
        if(body.containsKey(previousHead)){
            return -1;
        }
        snakeQueue.offer(previousHead);

        return score;

    }

     // snake move
    private void moveDirection(String direction, int[] arr){
        if(direction.equals("U"))arr[1]-=1;
        if(direction.equals("D"))arr[1]+=1;
        if(direction.equals("L"))arr[0]-=1;
        if(direction.equals("R"))arr[0]+=1;
    }
}