package defpackage;

import com.google.android.gms.internal.ads.zzy;

/* JADX INFO: loaded from: classes3.dex */
public final class ye6 {
    public final Object a;
    public zzy b = new zzy();
    public boolean c;
    public boolean d;

    public ye6(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ye6.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((ye6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
