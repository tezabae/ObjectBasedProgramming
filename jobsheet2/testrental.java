package jobsheet2;

public class testrental {
    public static void main(String[] args) {
        
        rental rental1 = new rental();
        
        rental1.id = 01;
        rental1.memberName = "Zhao Yufan";
        rental1.gameName = "Valorant";
        rental1.pricePerDay = 10000;
        rental1.rentingDuration = 3;
        
        rental1.displayData();
    }
}
