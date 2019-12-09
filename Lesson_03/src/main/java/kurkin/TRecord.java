package kurkin;

public class TRecord {
    public TRecord next;
    public int value;
    public TRecord prev;

    public void delete() {
        this.prev = null;
        this.next = null;
        this.value = 0;
    }

    public TRecord(TRecord rec) {
        this.next = rec.next;
        this.prev = rec.prev;
        this.value = rec.value;
    }

    public TRecord() {
        this.value = 0;
        this.next = null;
        this.prev = null;
    }
}