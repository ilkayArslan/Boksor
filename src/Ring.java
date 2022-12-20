public class Ring {
    Fighter f1;
    Fighter f2;
    int Maxweight;
    int Minweight;
    Ring(Fighter fighter1,Fighter fighter2,int Maxweight,int Minweight){
        this.f1 = fighter1;
        this.f2 = fighter2;
        this.Maxweight = Maxweight;
        this.Minweight = Minweight;
    }
    public void run() {

        if (isStart()) {
            double random = Math.ceil(Math.random()*2);
            if (random == 1.0){
                System.out.println("======== YENİ ROUND =========== " + f1.name + " BAŞLADI");
                while (f1.health > 0 && f2.health > 0) {
                    f2.health = f1.hit(f2);
                    if (isWin()){
                        break;
                    }
                    f1.health = f2.hit(f1);
                    if (isWin()){
                        break;
                    }
                    printScore();
                }
            }else {
                System.out.println("======== YENİ ROUND =========== " + f2.name + " BAŞLADI");
                while (f1.health > 0 && f2.health > 0) {


                    f1.health = f2.hit(f1);
                    if (isWin()){
                        break;
                    }
                    f2.health = f1.hit(f2);
                    if (isWin()){
                        break;
                    }
                    printScore();
                }
            }


        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }


    }
    public boolean isStart(){
        if (f1.weight<Maxweight && f1.weight>Minweight && f2.weight<Maxweight && f2.weight>Minweight ){
            return true;
        }else{
            return false;
        }
    };
    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        } else if (f2.health == 0){
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        }

        return false;
    }


    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
    }

}
