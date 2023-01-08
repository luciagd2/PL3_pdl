package gramaticas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Polinomio {
    ArrayList<HashMap<String, String>> monomios = new ArrayList<>();
    //String pol = "+x^2+y-3";
    public Polinomio(String pol){
        String monomio = "";
        for (int i=0;i<pol.length();i++){
            if((pol.charAt(i)) == ('+'|'-')){
                if(monomio != ""){
                    monomios.add(new HashMap<>());
                    if(monomio.charAt(0)== '-'){
                        if(monomio.contains("^")){
                            String[] partes = monomio.split("^");
                            monomios.get(monomios.size()-1).put("-".concat(partes[0]),partes[1]);
                        }else{
                            monomios.get(monomios.size()-1).put("-".concat(monomio),"1");
                        }
                    } else{
                        if(monomio.contains("^")){
                            String[] partes = monomio.split("^");
                            if(partes[0].contains("+")){
                                monomios.get(monomios.size()-1).put(partes[0],partes[1]);
                            }else{
                                monomios.get(monomios.size()-1).put("+".concat(partes[0]),partes[1]);
                            }

                        }else{
                            if(monomio.contains("+")){
                                monomios.get(monomios.size()-1).put(monomio,"1");
                            }else{
                                monomios.get(monomios.size()-1).put("+".concat(monomio),"1");
                            }
                        }
                    }
                }
                monomio = "";
            }
            monomio+= pol.charAt(i);
        }
    }
    private String valor(String var,int sustituto){
        String polNuevo = "";
        for (int i=0; i<monomios.size(); i++){
            String valor = monomios.get(i).get(0);
            String exponente = monomios.get(i).get(1);
            String signo = new String("+");
            if(valor.contains("-")){
                signo = "-";
            }
            String bruto = valor.replaceAll(signo, "");
            if(var.equals(bruto)){
                int valorNum = 0;
                if(signo.equals("+")){
                    valorNum = sustituto^(Integer.parseInt(exponente));
                } else{
                    valorNum = -sustituto^(Integer.parseInt(exponente));
                }
                polNuevo.concat(String.valueOf(valorNum));
            } else{
                polNuevo.concat(valor.concat("^").concat(exponente));
            }
        }
        return "";
    }
    public String evaluar(ArrayList<String> variables, ArrayList<Integer> sustitutos){
        Polinomio intermedio = this;
        for (int i = 0; i<variables.size(); i++){
            intermedio = new Polinomio(valor(variables.get(i), sustitutos.get(i)));
        }
        return intermedio.toString();
    }
    public String toString(){
        String polinomio = "";
        for (HashMap<String, String> mon: monomios){
            polinomio.concat(mon.get(0)).concat("^").concat(mon.get(1));
        }
        return polinomio;
    }
}
