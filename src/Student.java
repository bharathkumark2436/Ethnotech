class Student {
    private int id;

    public void setid(int id) {
        this.id = id;
    }

    public int getid() {
        return id;
    }
}
class Main{
    public static void main(String[] args) {
        Student obj=new Student();
        obj.setid(14);
        int ans=obj.getid();
        System.out.println(ans);

    }
}

