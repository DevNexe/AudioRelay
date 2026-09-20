package defpackage;

import j$.time.ZoneOffset;

/* JADX INFO: loaded from: classes3.dex */
@za4(with = nf5.class)
public final class mf5 {
    public static final QnHx Companion = new QnHx();
    public final ZoneOffset a;

    public static final class QnHx {
        public final rv1<mf5> serializer() {
            return nf5.a;
        }
    }

    static {
        ZoneOffset zoneOffset = ZoneOffset.UTC;
    }

    public mf5(ZoneOffset zoneOffset) {
        this.a = zoneOffset;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mf5) {
            if (ur1.a(this.a, ((mf5) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
