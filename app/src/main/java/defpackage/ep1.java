package defpackage;

import j$.time.Instant;

/* JADX INFO: loaded from: classes3.dex */
@za4(with = gp1.class)
public final class ep1 implements Comparable<ep1> {
    public static final QnHx Companion = new QnHx();
    public final Instant w;

    public static final class QnHx {
        public final rv1<ep1> serializer() {
            return gp1.a;
        }
    }

    static {
        Instant.ofEpochSecond(-3217862419201L, 999999999L);
        Instant.ofEpochSecond(3093527980800L, 0L);
        Instant instant = Instant.MIN;
        Instant instant2 = Instant.MAX;
    }

    public ep1(Instant instant) {
        this.w = instant;
    }

    @Override // java.lang.Comparable
    public final int compareTo(ep1 ep1Var) {
        return this.w.compareTo(ep1Var.w);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ep1) {
                if (ur1.a(this.w, ((ep1) obj).w)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.w.hashCode();
    }

    public final String toString() {
        return this.w.toString();
    }
}
