package work.UML.star;

/**
 * Date: 2021/3/3 18:13
 */
public class Agent {

    private Star myStar;
    private Fans myFans;
    private Company myCompany;

    public void setStar(Star myStar) {
        this.myStar = myStar;
    }

    public void setFans(Fans myFans) {
        this.myFans = myFans;
    }

    public void setCompany(Company myCompany) {
        this.myCompany = myCompany;
    }

    public void meeting() {
        System.out.println(myFans.getName()
        + "与明星" + myStar.getName() + "见面了。");
    }

    public void business() {
        System.out.println(myCompany.getName()
                + "与明星" + myStar.getName() + "洽谈业务。");
    }

    public static void main(String[] args) {
        Agent agent = new Agent();
        Fans han = new Fans("粉丝韩丞");
        Star lin = new Star("林心如");
        Company chian = new Company("中国传媒有限公司");
        agent.setFans(han);
        agent.setStar(lin);
        agent.setCompany(chian);

        agent.meeting();
        agent.business();
    }
}
