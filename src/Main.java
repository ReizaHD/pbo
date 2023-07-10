import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Bayes{
    ArrayList<String[]> data;
    String[] dataTest;

    public Bayes(ArrayList<String[]> data, String[] dataTest) {
        this.data = data;
        this.dataTest = dataTest;
        System.out.println("Data Training");
        for(String[] i: data)
            System.out.println(Arrays.toString(i));
        System.out.println("\nData Testing = "+Arrays.toString(dataTest));
        hitung();
    }

    public void hitung(){
        int size = data.size();
        int indexClass = data.get(0).length-1;
        int jmlLabel = data.get(0).length-1;
        Map<String, Float> kelas = new HashMap<>();
        kelas.put(data.get(0)[indexClass],0f);
        for(String[] i : data){
            if(!kelas.containsKey((i[indexClass]))){
                kelas.put(i[indexClass],0f);
            }
        }
        if(kelas.size()>1){
            Map<String, Float> pClass = new HashMap<>();
            float result;
            for(String i : kelas.keySet()){
                result = (float) find(i, indexClass)/size;
                pClass.put(i,result);
            }

            String[] arr = pClass.keySet().toArray(new String[0]);
            for(int i=0;i<jmlLabel;i++){
                for(String key : arr){
                    result = (float) finds(dataTest[i],i,key,indexClass)/find(key, indexClass);
                    pClass.put(dataTest[i]+"|"+key,result);
                }
            }
            result = 1f;
            String[] ars = kelas.keySet().toArray(new String[0]);
            for(String cl : ars){
                for(String key : pClass.keySet()){
                    if(key.contains(cl)){
                        result = result * pClass.get(key);
//                        System.out.println(pClass.get(key));
                    }
                }
                kelas.put(cl, result);
                result = 1f;
            }

            for(String a: kelas.keySet()){
                System.out.println("P(Class=\""+a+"\") = "+kelas.get(a));
            }
            Object[] hasil = max(kelas);
            dataTest[indexClass] = (String) hasil[0];
            System.out.println(Arrays.toString(dataTest));


        }

    }

    public int find(String val, int index){
        int total=0;
        for(String[] i : data){
            if(i[index].equals(val)){
                total++;
            }
        }
        return total;
    }

    public int finds(String val, int index, String classVal, int classIndex){
        int total=0;
        for(String[] i : data){
            if(i[index].equals(val) && i[classIndex].equals(classVal)){
                total++;
            }

        }
        return total;
    }

    public Object[] max(Map<String, Float> val){
        float result = 0f;
        String key="";
        for(String i : val.keySet()){
            if(val.get(i) > result){
                result = val.get(i);
                key = i;
            }
        }
        return new Object[]{key, result};
    }
}

public class Main {
    public static void main(String[] args){
        ArrayList<String[]> data = new ArrayList<>();
        data.add(new String[]{"A","Tinggi","Tidak","Cukup","False"});
        data.add(new String[]{"A","Tinggi","Tidak","Baik","False"});
        data.add(new String[]{"B","Tinggi","Tidak","Cukup","True"});
        data.add(new String[]{"C","Menengah","Tidak","Cukup","True"});
        data.add(new String[]{"C","Rendah","Ya","Cukup","True"});
        data.add(new String[]{"C","Rendah","Ya","Baik","False"});
        data.add(new String[]{"B","Rendah","Ya","Baik","True"});
        data.add(new String[]{"A","Menengah","Tidak","Cukup","False"});
        data.add(new String[]{"A","Rendah","Ya","Cukup","True"});
        data.add(new String[]{"C","Menengah","Ya","Cukup","True"});
        data.add(new String[]{"A","Menengah","Ya","Baik","True"});
        data.add(new String[]{"B","Menengah","Tidak","Baik","True"});
        data.add(new String[]{"B","Tinggi","Ya","Cukup","True"});
        data.add(new String[]{"C","Menengah","Tidak","Baik","False"});

        String[] dataTest = {"A","Menengah","Ya","Cukup","?"};
        Bayes by = new Bayes(data,dataTest);
    }
}
