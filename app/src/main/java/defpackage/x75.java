package defpackage;

import j$.time.ZoneId;
import j$.time.ZoneOffset;

/* JADX INFO: loaded from: classes3.dex */
@za4(with = y75.class)
public class x75 {
    public static final QnHx Companion = new QnHx();
    public final ZoneId a;

    public static final class QnHx {
        public static x75 a(ZoneId zoneId) {
            boolean zIsFixedOffset;
            if (zoneId instanceof ZoneOffset) {
                return new ly0(new mf5((ZoneOffset) zoneId));
            }
            try {
                zIsFixedOffset = zoneId.getRules().isFixedOffset();
            } catch (ArrayIndexOutOfBoundsException unused) {
                zIsFixedOffset = false;
            }
            if (!zIsFixedOffset) {
                return new x75(zoneId);
            }
            return new ly0(zoneId);
        }

        public final rv1<x75> serializer() {
            return y75.a;
        }
    }

    static {
        ZoneOffset zoneOffset = ZoneOffset.UTC;
    }

    public x75(ZoneId zoneId) {
        this.a = zoneId;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof x75) {
                if (ur1.a(this.a, ((x75) obj).a)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
