package defpackage;

import j$.time.LocalDateTime;
import j$.time.chrono.ChronoLocalDateTime;

/* JADX INFO: loaded from: classes3.dex */
@za4(with = t42.class)
public final class s42 implements Comparable<s42> {
    public static final QnHx Companion = new QnHx();
    public final LocalDateTime w;

    public static final class QnHx {
        public final rv1<s42> serializer() {
            return t42.a;
        }
    }

    static {
        LocalDateTime localDateTime = LocalDateTime.MIN;
        LocalDateTime localDateTime2 = LocalDateTime.MAX;
    }

    public s42(LocalDateTime localDateTime) {
        this.w = localDateTime;
    }

    @Override // java.lang.Comparable
    public final int compareTo(s42 s42Var) {
        return this.w.compareTo((ChronoLocalDateTime<?>) s42Var.w);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof s42) {
                if (ur1.a(this.w, ((s42) obj).w)) {
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
