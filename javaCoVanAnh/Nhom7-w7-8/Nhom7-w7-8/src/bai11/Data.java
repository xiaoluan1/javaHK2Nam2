
package bai11;


public class Data {
    private int index,number;
    private boolean checkstatus; 

    public Data() {
        index=1;
        checkstatus=true;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isCheckstatus() {
        return checkstatus;
    }

    public void setCheckstatus(boolean checkstatus) {
        this.checkstatus = checkstatus;
    }
}
