package androidx.work.impl.model;

/* JADX INFO: loaded from: classes.dex */
public class SystemIdInfo {
    public final String a;
    public final int b;

    public SystemIdInfo(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SystemIdInfo)) {
            return false;
        }
        SystemIdInfo systemIdInfo = (SystemIdInfo) obj;
        if (this.b != systemIdInfo.b) {
            return false;
        }
        return this.a.equals(systemIdInfo.a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }
}
