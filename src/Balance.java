public class Balance {
    private int bankbalance;
    public void setbalance(int bal){
        this.bankbalance=bal;
    }
    public int getbalance() {
        return bankbalance;
    }

    public static void main(String[] args) {
        Balance obj=new Balance();
        obj.setbalance(200000);
        int ans= obj.getbalance();
        System.out.println(ans);
    }

}
