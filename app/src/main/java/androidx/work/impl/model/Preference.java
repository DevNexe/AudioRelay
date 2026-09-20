package androidx.work.impl.model;

/* JADX INFO: loaded from: classes.dex */
public class Preference {
    public final String a;
    public final Long b;

    public Preference(String str, long j) {
        this.a = str;
        this.b = Long.valueOf(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Preference)) {
            return false;
        }
        Preference preference = (Preference) obj;
        if (!this.a.equals(preference.a)) {
            return false;
        }
        Long l = preference.b;
        Long l2 = this.b;
        if (l2 != null) {
            return l2.equals(l);
        }
        return l == null;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }
}
