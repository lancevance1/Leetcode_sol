import java.util.ArrayList;
import java.util.List;

public class BuildaMatrixWithConditions {
    public int[][] buildMatrix(int k, int[][] rc, int[][] cc) {
        int []m=new int[k],n=new int[k];
        for(int i=0;i<k;i++){
            m[i]=i+1;
            n[i]=i+1;
        }
        var a1 = h(rc);
        var a2=     h(cc);
        if(h2(rc,a1)==false||h2(cc,a2)==false)return  new int[][]{};
        if(a1.size()==0||a2.size()==0)return new int[][]{};
        int [][] res = new int [k][k];
        for(int i=0;i<k;i++){
            int x=0,y=0;
            for(int j=0;j<a1.size();j++){
                if(a1.get(j)==i+1){
                    x=j;
                    break;
                }
            }
            for(int j=0;j<a2.size();j++){
                if(a2.get(j)==i+1){
                    y=j;
                    break;
                }
            }
            res[x][y]=i+1;
        }
        return res;
    }
    private int found(List<Integer> map, int t){
        for(int i=0;i<map.size();i++){
            if(map.get(i)==t)return i;
        }
        return -1;
    }

    private List<Integer> h(int[][] rc){
        List<Integer> map = new ArrayList();
        for(int i=0;i<rc.length;i++){
            int a = rc[i][0];
            int b= rc[i][1];
            int af=found(map,a);
            int bf=found(map,b);
            if(af==-1&&bf==-1){
                map.add(a);
                map.add(b);
            }else if(af==-1){
                map.add(bf,a);
            }else if(bf==-1){
                map.add(af+1,b);
            }else{
                map.set(af,b);
                map.set(bf,a);
            }



        }
        return map;
    }
    private boolean h2(int[][] rc,List<Integer> map ){

        for(int i=0;i<rc.length;i++){
            int a = rc[i][0];
            int b= rc[i][1];
            int af=found(map,a);
            int bf=found(map,b);
            if(af>bf)return false;



        }
        return true;
    }


}
