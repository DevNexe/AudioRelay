package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class h02 {
    public final ui2<QnHx> a = new ui2<>(new QnHx[16]);

    public static final class QnHx {
        public final int a;
        public final int b;

        public QnHx(int i, int i2) {
            this.a = i;
            this.b = i2;
            if (!(i >= 0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i2 >= i)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QnHx)) {
                return false;
            }
            QnHx qnHx = (QnHx) obj;
            return this.a == qnHx.a && this.b == qnHx.b;
        }

        public final int hashCode() {
            return (this.a * 31) + this.b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Interval(start=");
            sb.append(this.a);
            sb.append(", end=");
            return qc0.a(sb, this.b, ')');
        }
    }

    public final int a() {
        ui2<QnHx> ui2Var = this.a;
        if (ui2Var.j()) {
            throw new NoSuchElementException("MutableVector is empty.");
        }
        QnHx[] qnHxArr = ui2Var.w;
        int i = 0;
        int i2 = qnHxArr[0].b;
        int i3 = ui2Var.y;
        if (i3 > 0) {
            do {
                int i4 = qnHxArr[i].b;
                if (i4 > i2) {
                    i2 = i4;
                }
                i++;
            } while (i < i3);
        }
        return i2;
    }

    public final int b() {
        ui2<QnHx> ui2Var = this.a;
        if (ui2Var.j()) {
            throw new NoSuchElementException("MutableVector is empty.");
        }
        QnHx[] qnHxArr = ui2Var.w;
        int i = qnHxArr[0].a;
        int i2 = ui2Var.y;
        if (i2 > 0) {
            int i3 = 0;
            do {
                int i4 = qnHxArr[i3].a;
                if (i4 < i) {
                    i = i4;
                }
                i3++;
            } while (i3 < i2);
        }
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
