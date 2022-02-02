public class Montres {
    private static int heures, min = 0;
    Montres( int h, int m){
        this.heures=h;
        this.min=m;
    }
    public int getHeures(){
        return  this.heures;
    }
    public int getMin(){
        return  this.min;
    }

    public void Heure(){
        try{
            System.out.println("Il est :"+getHeures()+" heure(s)");
        }catch(NullPointerException ex){
            System.out.println("error Time ");
            System.out.println("Type => "+ex.getMessage());
        }
    }

    public void Min(){
        try{
            System.out.println("Il est :"+getMin()+" minutes(s)");
        }catch(NullPointerException ex){
            System.out.println("error Time ");
            System.out.println("Type => "+ex.getMessage());
        }
    }

    Montres(Montres m){
        this.heures=m.heures;
        this.min=m.min;
    }
    void avance(){
        if(this.min==59){
            if(this.heures==23){
                this.heures=0;
            }
            else{
                this.heures++;
                this.min=0;
            }
        }
        else {this.min++;
        }
    }

    @Override
    Montres clone(){
        return this;
    }
}