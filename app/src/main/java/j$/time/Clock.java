package j$.time;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Clock {
    protected Clock() {
    }

    public static Clock c() {
        return new b(ZoneId.systemDefault());
    }

    public static Clock systemUTC() {
        return new b(ZoneOffset.UTC);
    }

    public abstract ZoneId a();

    public long b() {
        return instant().S();
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public abstract Instant instant();
}
