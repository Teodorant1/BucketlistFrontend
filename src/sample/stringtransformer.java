package sample;

public class stringtransformer {

    String text;
    String delimiter1 = "0yormungandr0yormungandr0";




    String finaltext = "placeholder";
    stringtransformer( String text){
        this.text=text;
    }

    public String transform(){
       String[]element=  this.text.split("/");
    for (int i = 0; i < element.length; i++ )
    {       setFinaltext(element[i]);
            setFinaltext(getFinaltext()+delimiter1);
      System.out.println(getFinaltext());}
    return getFinaltext(); };
    public String getFinaltext() {
        return finaltext;
    }

    public void setFinaltext(String finaltext) {
        this.finaltext = finaltext;
    }
}
